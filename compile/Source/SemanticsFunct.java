import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;


public class SemanticsFunct {
	Pro pro;
	TDSGlobal tdsglobale;
	int regionFct;
	public SemanticsFunct(Pro p,TDSGlobal tdsg)
	{
		this.pro=p;
		this.tdsglobale=tdsg;
	}
	
	
	public void CheckVisibilityFunct(Tree ast,int region)
	{
		for (int i = 0; i<ast.getChildCount();i++)
		{
			
			if (ast.getChild(i).getText().equals("INSTRUCTION"))
			{
				GetIntoInstruction(ast.getChild(i),region);
			}
			 /*if (ast.getChild(i).getText().equals("DECLARATION"))
			{
				CheckVisibilityFunct(ast.getChild(i),region);
			}*/

		}
		for (int i=0;i<ast.getChildCount();i++)
		{
			 if (ast.getChild(i).getText().equals("DECLARATION"))
			{
				CheckVisibilityFunct(ast.getChild(i),region);
			}
			else if (ast.getChild(i).getText().equals("FONCTION") || ast.getChild(i).getText().equals("PROCEDURE"))
			{
				CheckVisibilityFunct(ast.getChild(i),++region);
			}
			else if (ast.getChild(i).getText().equals("BLOC"))
			{
				CheckVisibilityFunct(ast.getChild(i),region);
			}
		}
	}


	private void GetIntoInstruction(Tree ast, int region) 
	{
		for (int j=0;j<ast.getChildCount();j++)
		{
			
			if (ast.getChild(j).getText().equals("APPEL"))
			{
			    	String fct = ast.getChild(j).getChild(0).getText();
			    	String type = SearchTypeIntoTds(fct,region);
			    	int para = SearchParaIntoTds(fct,region);
			    	System.out.println(fct+" "+region);
			    	if (type==null)
			    	{
				    	   System.out.println("Dans la région "+region+" la procedure "+fct+" est visible");
				    	   if((ast.getChild(j).getChildCount()-1)>para){
					    	   System.err.println("Il y a des parametres en trop dans la procedure "+fct);
				    	   }else if((ast.getChild(j).getChildCount()-1)<para){
					    	   System.err.println("Il manque des parametres dans la procedure "+fct);
				    	   }else{
				    	   }
			    	}
			    	else if (type.equals(""))
			    	{
			    		if(ast.getText().equals("INSTRUCTION")){
				    		System.err.println("Dans la région "+region+" La procedure \""+fct+"\" n'est pas déclarée ou n'est pas visible");
			    		}else{
				    		System.err.println("Dans la région "+region+" La fonction \""+fct+"\" n'est pas déclarée ou n'est pas visible");
					    	/*ArrayList<Boolean> bool = new ArrayList<Boolean>();
					    	this.Checkexpression(ast.getChild(j).getChild(1),type,region,bool);
					    	System.err.println("Dans la région "+region+" l'expression associé à la fonction \""+fct+"\" est complètement incorrect");*/
			    		}
			    	}
			    	else if (type.equals("ARRAY"))
			    	{
				    	fct = ast.getChild(j).getChild(0).getText();
			    		   System.out.println("Dans la région "+region+" la fonction "+fct+" est visible");
					       ArrayList<Boolean> bool = new ArrayList<Boolean>();
					       for (int i=0;i<ast.getChild(j).getChildCount();i++)
					       {
					    	   if (ast.getChild(j).getChild(i).getText().equals("VAL"))
					    	   {
					    	     this.Checkexpression(ast.getChild(j).getChild(i).getChild(0),type,region,bool);
					    	   }
					       }
					       if (this.semantiqueEstCorrect(bool))
					       {
					    	   System.out.println("Dans la région "+region+" l'expression associé à la fonction "+fct+" est correct et type de renvoi :"+type);
					       }
					       else
					       {
					    	   System.err.println("Dans la région "+region+" l'expression associé à la fonction \""+fct+"\" est complètement incorrect");
					       }
			    	}
			    	else
			    	{
			    	   System.out.println("Dans la région "+region+" la fonction "+fct+" est visible");
			    	   if((ast.getChild(j).getChildCount()-1)>para){
				    	   System.err.println("Il y a des parametres en trop dans la fonction "+fct);
			    	   }else if((ast.getChild(j).getChildCount()-1)<para){
				    	   System.err.println("Il manque des parametres dans la fonction "+fct);
			    	   }else{
				    	   if(ast.getText().equals("APPEL")){
				    		   if(SearchAllParaIntoTds(ast.getChild(0).getText(),region).get(j-1).getType().equals(type)){
						    	   System.out.println("Dans la région "+region+" le parametre "+j+" associé à la fonction "+ast.getChild(0).getText()+" est correct et type de renvoi : "+type);
				    		   }else{
						    	   System.err.println("Dans la région "+region+" le parametre "+j+" associé à la fonction "+ast.getChild(0).getText()+" est incorrect et type de renvoi : "+type+" mais devrais renvoyer : "+SearchAllParaIntoTds(ast.getChild(0).getText(),region).get(j-1).getType());
				    		   }
				    	   }
				    	   for(int t=1;t<ast.getChild(j).getChildCount();t++){
								String n=ast.getChild(j).getChild(0).getText();
								String ty=SearchAllParaIntoTds(ast.getChild(j).getChild(0).getText(),region).get(t-1).getType();
								String par;
								//System.out.println(ast.getChild(i).getChild(3).getChild(1).getChild(p).getChild(0).getText());;
								if(ast.getChild(j).getChild(t).getText().equals("true")||ast.getChild(j).getChild(t).getText().equals("false")){
									par="boolean";
								}
								else if(estUnEntier(ast.getChild(j).getChild(t).getText())){
									par="integer";
								}
								else if(ast.getChild(j).getChild(t).getText().equals("APPEL")){
									par="";
								}
								else{
									par=SearchTypeIntoTds(ast.getChild(j).getChild(t).getText(),regionFct+1);
								}
								//System.out.println(ret);
								//System.out.println(nom+" "+ast.getChild(i).getChild(3).getChild(1).getChild(p).getChild(0).getText());
								//System.out.println(ret+"et att : "+type+" reg : "+(regionFct+1));
								if(!ty.equals(par)&&!ast.getChild(j).getChild(t).getText().equals("APPEL")){
									if((par.equals(""))){
										System.err.println("Erreur "+ast.getChild(j).getChild(t).getText()+" n'a pas été initialisé");
									}else{
										System.err.println("Erreur sur le type du parametre "+t+" dans la fonction "+ast.getChild(0).getText()+" : "+ty+" attendu mais "+par+" trouvé");
									}
								}
				    	   }
			    	   }
			    	   
				      /*ArrayList<Boolean> bool = new ArrayList<Boolean>();
				       this.Checkexpression(ast.getChild(j),type,region,bool);
				       if (this.semantiqueEstCorrect(bool))
				       {
				    	   System.out.println("Dans la région "+region+" l'expression associé à la fonction "+fct+" est correct et type de renvoi :"+type);
				       }
				       else
				       {
				    	   System.err.println("Dans la région "+region+" l'expression associé à la fonction \""+fct+"\" est complètement incorrect");
				       }*/

			    	}
			    	/*for(int o=0;o<ast.getChild(j).getChildCount();o++){
			    		GetIntoInstruction(ast.getChild(j).getChild(o), region);
			    	}*/
					GetIntoInstruction(ast.getChild(j), region);

			  }
			else
			{
				GetIntoInstruction(ast.getChild(j), region);
			}
		}
	}
	
	private boolean semantiqueEstCorrect(ArrayList<Boolean> bool) {
		for (int i=0;i<bool.size();i++)
		{
			if (!bool.get(i))
			{
				return false;
			}
		}
		return true;
	}


	private void Checkexpression(Tree ast, String type,int region,ArrayList<Boolean> b) 
	{
		if (type.equals("integer") || type.equals("ARRAY"))
		{
		       if (   ast.getText().equals("+")
		    	|| ast.getText().equals("-")
		    	|| ast.getText().equals("*")
		    	|| ast.getText().equals("/"))
		        {
		    	   Checkexpression( ast.getChild(0), type,region,b);
		    	   Checkexpression(ast.getChild(1), type,region,b);
		        }
		    else if (this.IsInteger(ast.getText()))
		    {
		    	if (type.equals(type))
		    	{
		    		b.add(true);
		    	}
		    	else
		    	{
		    		b.add(false);
		    	}
		    }
		    else if (ast.getText().equals("APPEL"))
		    {
		    	String app =ast.getChild(0).getText();
		    	String app_type = this.SearchTypeIntoTds(app, region);
		    	if (app_type.equals("integer") || app_type.equals("ARRAY"))
		    	{
		    		b.add(true);
		    	}
		    	else
		    	{
		    		System.err.println("dans la region "+ region+" La fonction ou procedure "+ app +" n'est pas déclaré ou pas visible ou ne renvoie pas le bon type");
		    		b.add(false);
		    	}
		    }
		    else if (ast.getText().equals("TABLEAU")) // les tableaux sont forcément des entiers on verifie juste qu'il est visible
		    {
		    	String app =ast.getChild(0).getText();
		    	String app_type = this.SearchTypeIntoTds(app, region);
		    	if (!app_type.equals(""))
		    	{
		    		b.add(true);
		    	}
		    	else
		    	{
		    		System.err.println("Dans la région "+region+" le tableau "+ app + " n'est pas déclaré");
		    		b.add(false);
		    	}
		    }
		    else //c'est une fonction
		    {
		    	String app =ast.getText();
		    	String app_type = this.SearchTypeIntoTds(app, region);
		    	if (app_type.equals("integer"))
		    	{
		    		b.add(true);
		    	}
		    	else
		    	{
		    		System.err.println("Dans la région "+region+" la fonction "+ app + " n'est pas déclarée ou ne renvoie pas le bon type");
		    		b.add(false);
		    	}
		    }
		}
		else if (type.equals("boolean"))
		{
		       if (   ast.getText().equals("+")
		    	|| ast.getText().equals("-")
		    	|| ast.getText().equals("*"))
		        {
		    	   Checkexpression( ast.getChild(0), type,region,b);
		    	   Checkexpression(ast.getChild(1), type,region,b);
		        }
		       else if (ast.getText().equals("/"))
		       {
		    	   System.err.println("Dans la region "+region+" on ne divise pas des booléens");
		    	   Checkexpression( ast.getChild(0), type,region,b);
		    	   Checkexpression(ast.getChild(1), type,region,b);
		       }
		       else if (ast.getText().equals("true") ||
		    		    ast.getText().equals("false"))
		       {
		    	   b.add(true);
		       }
		       else if (ast.getText().equals("APPEL"))
			    {
			    	String app =ast.getChild(0).getText();
			    	String app_type = this.SearchTypeIntoTds(app, region);
			    	if (app_type.equals(type))
			    	{
			    		b.add(true);
			    	}
			    	else
			    	{
			    		System.err.println("dans la region "+ region+" La fonction ou procedure "+ app +" n'est pas déclaré ou pas visible ou ne renvoie pas le bon type");
			    		b.add(false);
			    	}
			    }
			    else if (ast.getText().equals("TABLEAU")) // les tableaux sont forcément des entiers on verifie juste qu'il est visible
			    {
			    	b.add(false);
			    	System.err.println("Dans la region "+region+" on ne peut pas évaluer des booléens avec des entiers");
			    }
			    else if (this.IsInteger(ast.getText()))
			    {
			    	System.err.println("Dans la region "+region+" on ne pas peut évaluer des booléens avec des entiers");
			    	b.add(false);
			    }
		       else //c'est une fonction
			    {
			    	String app =ast.getText();
			    	String app_type = this.SearchTypeIntoTds(app, region);
			    	if (!app_type.equals(""))
			    	{
			    		b.add(true);
			    	}
			    	else
			    	{
			    		System.err.println("Dans la région "+region+" la fonction "+ app + " n'est pas déclarée");
			    		b.add(false);
			    	}
			    }
		}

	}

	private String SearchTypeIntoTds(String fct, int region) 
	{
		ArrayList<Integer> pile_reg_ouv = new ArrayList<Integer>();
		pile_reg_ouv=this.pro.getPile().get(region);
		String type="";
		for (int i = 0; i< pile_reg_ouv.size();i++)
		{
			TDS courant = this.tdsglobale.TDSparRegion.get(pile_reg_ouv.get(i));
			for (int j=0;j<courant.getSymboles().size();j++)
			{
				
				if (courant.getSymboles().get(j).getNom().equals(fct))
				{
					type=courant.getSymboles().get(j).getType();
				}
			}
		}
		return type;
	}
	
	private int SearchParaIntoTds(String fct, int region) 
	{
		ArrayList<Integer> pile_reg_ouv = new ArrayList<Integer>();
		pile_reg_ouv=this.pro.getPile().get(region);
		int type=0;
		for (int i = 0; i< pile_reg_ouv.size();i++)
		{
			TDS courant = this.tdsglobale.TDSparRegion.get(pile_reg_ouv.get(i));
			for (int j=0;j<courant.getSymboles().size();j++)
			{
				
				if (courant.getSymboles().get(j).getNom().equals(fct))
				{
					type=courant.getSymboles().get(j).getParametre();
				}
			}
		}
		return type;
	}
	
	private ArrayList<Symbole> SearchAllParaIntoTds(String fct, int region) 
	{
		ArrayList<Integer> pile_reg_ouv = new ArrayList<Integer>();
		pile_reg_ouv=this.pro.getPile().get(region);
		ArrayList<Symbole> params=new ArrayList<Symbole>();
		for (int i = 0; i< pile_reg_ouv.size();i++)
		{
			TDS courant = this.tdsglobale.TDSparRegion.get(pile_reg_ouv.get(i));
			for (int j=0;j<courant.getSymboles().size();j++)
			{
				
				if (courant.getSymboles().get(j).getNom().equals(fct))
				{
					params=courant.getSymboles().get(j).getParam();
				}
			}
		}
		return params;
	}


	private boolean IsInteger(String cc/*chaine de caractaire*/){
		char [] s =cc.toCharArray();
		boolean testerreurfrappe= true;

		for (int i=0; i<s.length;i++){
		if(!Character.isDigit(s[i]) )
		{testerreurfrappe= false;}
		}
		return testerreurfrappe;
		} 
	
	public void CheckSameFonct(){
		for (int j=0;j<tdsglobale.TDSparRegion.size();j++){
			ArrayList<String> v = new ArrayList<String>();
			for (int i=0;i<tdsglobale.TDSparRegion.get(j).getSymboles().size();i++){
				String nom = tdsglobale.TDSparRegion.get(j).getSymboles().get(i).getNom();
				String nat = tdsglobale.TDSparRegion.get(j).getSymboles().get(i).getNature();
				if(nat.equals("fonction")){
					if(v.contains(nom)){
						System.out.println("La fonction "+nom+" est déclaré plusieurs fois dans la région "+tdsglobale.TDSparRegion.get(j).getregion());
					}else{
						v.add(nom);
					}
				}else if(nat.equals("procedure")){
					if(v.contains(nom)){
						System.out.println("La procedure "+nom+" est déclaré plusieurs fois dans la région "+tdsglobale.TDSparRegion.get(j).getregion());
					}else{
						v.add(nom);
					}
				}
			}
		}
	}
	
	/*public void CheckRetourFonct(Tree ast,int region){
		if(ast==null){
			return;
		}
		for(int j=0;j<ast.getChildCount();j++){
			if(ast.getChild(j).getText().equals("FONCTION")){
				if(ast.getChild(j).getChild(1).getText()!=ast.getChild(j).getChild(5).getText()){
					System.err.println("Erreur sur le type de retour dans la fonction "+ast.getChild(j).getChild(0).getText()+": "+ast.getChild(j).getChild(1).getText()+" attendu mais "+);
				}
			}
		}
	}*/
	
	public void CheckRetourFonct(Tree ast,int prof, int regionFct2){
		if(ast==null){
			return;
		}
		if(ast.getText().equals("do")){
			for(int i=0;i<ast.getChildCount();i++){
				if(ast.getChild(i).getText().equals("DECLARATION"))
				{
					CheckRetourFonct(ast.getChild(i),0,0);
				}
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					CheckRetourFonct(ast.getChild(i),0,0);
				}
			}
		}
		else{
			for(int i=0;i<ast.getChildCount();i++){
				
				if(ast.getChild(i).getText().equals("FONCTION")){
					
					String nom=ast.getChild(i).getChild(0).getText();
					String type=ast.getChild(i).getChild(1).getText();
					int p = ast.getChild(i).getChild(3).getChild(1).getChildCount()-1;
					String ret;
					//System.out.println(ast.getChild(i).getChild(3).getChild(1).getChild(p).getChild(0).getText());;
					if(ast.getChild(i).getChild(3).getChild(1).getChild(p).getChild(0).getText().equals("true")||ast.getChild(i).getChild(3).getChild(1).getChild(p).getChild(0).getText().equals("false")){
						ret="boolean";
					}
					else if(estUnEntier(ast.getChild(i).getChild(3).getChild(1).getChild(p).getChild(0).getText())){
						ret="integer";
					}
					else{
						ret=SearchTypeIntoTds(ast.getChild(i).getChild(3).getChild(1).getChild(p).getChild(0).getText(),regionFct+1);
					}
					//System.out.println(ret);
					//System.out.println(nom+" "+ast.getChild(i).getChild(3).getChild(1).getChild(p).getChild(0).getText());
					//System.out.println(ret+"et att : "+type+" reg : "+(regionFct+1));
					if(!type.equals(ret)){
						if((ret.equals(""))){
							System.err.println("Erreur "+ast.getChild(i).getChild(3).getChild(1).getChild(p).getChild(0).getText()+" n'a pas été initialisé");
						}else{
							System.err.println("Erreur sur le type de retour dans la fonction "+nom+" : "+type+" attendu mais "+ret+" trouvé");
						}
					}
					CheckRetourFonct(ast.getChild(i).getChild(3).getChild(0),prof+1,++regionFct);
					
				}	else if(ast.getChild(i).getText().equals("PROCEDURE")){
					CheckRetourFonct(ast.getChild(i).getChild(2).getChild(0),prof+1,++regionFct);					
					//regionFct++;
				}
				else{
					CheckRetourFonct(ast.getChild(i),prof+1,regionFct2);
					//regionFct++;
				}	
			}
		}
	}
	
	public boolean estUnEntier(String chaine) {
		try {
			Integer.parseInt(chaine);
		} catch (NumberFormatException e){
			return false;
		}
 
		return true;
	}
	
	/*public void checkNumbPar(Tree ast,int prof, int regionFct2, Pro pile, TDSGlobal tdsSorted){
		ArrayList<TDS> TDSparRegion=tdsSorted.getTDSparRegion();
		if(ast==null){
			return;
		}
			for(int i=0;i<ast.getChildCount();i++){
				
				if(ast.getChild(i).getText().equals("APPEL")){
					String nom=ast.getChild(i).getChild(0).getText();
					int parametre = ast.getChild(i).getChildCount()-1;
					int nbr = pile.getPile().get(regionFct).size();
					System.out.println(regionFct+" "+parametre+" "+nom);
					for(int j=nbr;j>=0;j--){
						int nbrS = TDSparRegion.get(j).getSymboles().size();
						for(int r=nbr;r<nbrS;r++){
							if((TDSparRegion.get(j).getSymboles().get(r).getNom()==nom)&&TDSparRegion.get(j).getSymboles().get(r).getParametre()!=parametre){
								System.out.println("Le nombre de parametre n'est pas bon pour"+nom);
							}
						}
					}
					checkNumbPar(ast.getChild(i),prof+1,++regionFct,pile,tdsSorted);
				}
				else{
					checkNumbPar(ast.getChild(i),prof+1,regionFct2,pile,tdsSorted);
				}	
		}
	}
	public void checkNumbPar(Tree ast,int prof, int regionFct2, Pro pile, TDSGlobal tdsSorted){
		if(ast==null){
			return;
		}
		if(ast.getText().equals("do")){
			for(int i=0;i<ast.getChildCount();i++){
				if(ast.getChild(i).getText().equals("DECLARATION"))
				{
					checkNumbPar(ast.getChild(i),0,0,pile,tdsSorted);
				}
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					int cpt = ast.getChild(i).getChildCount();
					for(int t=0;t<cpt;t++){
						if(ast.getChild(i).getChild(t).getText().equals("=")&&ast.getChild(i).getChild(t).getChild(1).getText().equals("APPEL")){
							String nom=ast.getChild(i).getChild(t).getChild(1).getChild(0).getText();
							int parametre = ast.getChild(i).getChild(t).getChild(1).getChildCount()-1;
							//int nbr = pile.getPile().get(++regionFct).size();
							System.out.println(regionFct2+" "+parametre+" "+nom);
						}
					}
				}
			}
		}
		else{
			for(int i=0;i<ast.getChildCount();i++){
				
				if(ast.getChild(i).getText().equals("FONCTION")){
							int cpt = ast.getChild(i).getChild(3).getChild(1).getChildCount();
							for(int t=0;t<cpt;t++){
								if(ast.getChild(i).getChild(3).getChild(1).getChild(t).getText().equals("=")){
									String nom=ast.getChild(i).getChild(3).getChild(1).getChild(t).getChild(1).getChild(0).getText();
									int parametre = ast.getChild(i).getChild(3).getChild(1).getChild(t).getChild(1).getChildCount()-1;
									int nbr = pile.getPile().get(++regionFct).size();
									System.out.println(regionFct+" "+parametre+" "+nom);
								}
							}
					checkNumbPar(ast.getChild(i).getChild(3).getChild(0),prof+1,++regionFct,pile,tdsSorted);
					
				}
				else if(ast.getChild(i).getText().equals("PROCEDURE")){	
					int cpt = ast.getChild(i).getChild(2).getChild(1).getChildCount();
					for(int t=0;t<cpt;t++){
						if(ast.getChild(i).getChild(2).getChild(1).getChild(t).getText().equals("=")){
							String nom=ast.getChild(i).getChild(2).getChild(1).getChild(t).getChild(1).getChild(0).getText();
							int parametre = ast.getChild(i).getChild(2).getChild(1).getChild(t).getChild(1).getChildCount()-1;
							int nbr = pile.getPile().get(regionFct).size();
							System.out.println(regionFct+" "+parametre+" "+nom);
							Tree a = ast.getChild(i).getChild(2).getChild(1).getChild(t).getChild(1);
							while(a!=null){
								
							}
						}
					}
					checkNumbPar(ast.getChild(i).getChild(2).getChild(0),prof+1,++regionFct,pile,tdsSorted);
					
					//regionFct++;
				}
				else{
					checkNumbPar(ast.getChild(i),prof+1,regionFct2,pile,tdsSorted);
					//regionFct++;
				}	
			}
		}
	}*/
	
}
