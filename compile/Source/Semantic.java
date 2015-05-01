import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

public class Semantic 

{

        Pro pro;
        TDSGlobal tdsglobale;
        Tree ast;
        boolean check;
        int place;//Donnera la place de l'analyse
        int region_declarant;
        public Semantic(Pro p,TDSGlobal tdsg,Tree ast)
        {
                this.pro=p;
                this.tdsglobale=tdsg;
                this.ast=ast;
        }

        

        

        public void CheckVisibilityVariable(Tree ast,int region)
        {
                for (int i = 0; i<ast.getChildCount();i++)
                {
                        if (ast.getChild(i).getText().equals("INSTRUCTION"))
                        {
                                GetIntoInstruction(ast.getChild(i),region);
                        }
                }
                for (int i=0;i<ast.getChildCount();i++)
                {
                         if (ast.getChild(i).getText().equals("DECLARATION"))
                        {
                                CheckVisibilityVariable(ast.getChild(i),region);
                        }
                         else if (ast.getChild(i).getText().equals("FONCTION") || ast.getChild(i).getText().equals("PROCEDURE"))
                        {
                                CheckVisibilityVariable(ast.getChild(i),++region);
                        }
                        else if (ast.getChild(i).getText().equals("BLOC"))
                        {
                                CheckVisibilityVariable(ast.getChild(i),region);
                        }
                }

        }

        private void GetIntoInstruction(Tree ast, int region) 
        {
                for (int j=0;j<ast.getChildCount();j++)
                {
                        if (ast.getChild(j).getText().equals("="))
                        {
                        			this.place=j;
                                    String var = ast.getChild(j).getChild(0).getText();
                                    String type = SearchTypeIntoTds(var,region);
                                    if (type.equals("")) //pas de type = pas déclaré
                                    {
                                            System.err.println("Dans la région "+region+" La variable \""+var+"\" n'est pas déclarée ou n'est pas visible");
                                            ArrayList<Boolean> bool = new ArrayList<Boolean>();
                                            this.Checkexpression(ast.getChild(j).getChild(1),type,region,bool);
                                            System.err.println("Dans la région "+region+" l'expression associé à la variable \""+var+"\" est complètement incorrect");
                                    }
                                    else if (type.equals("ARRAY"))
                                    {
                                               System.out.println("Dans la région "+region+" la variable "+var+" est visible");
                                               ArrayList<Boolean> bool = new ArrayList<Boolean>();
                                               boolean count=false;
                                               for (int i=0;i<ast.getChild(j).getChildCount();i++)
                                               {
                                                       if (ast.getChild(j).getChild(i).getText().equals("VAL"))
                                                       {
                                                             count=true;
                                                             this.Checkexpression(ast.getChild(j).getChild(i).getChild(0),type,region,bool);
                                                       }
                                               }
                                               if (this.semantiqueEstCorrect(bool) && count)
                                               {
                                                       System.out.println("Dans la région "+region+" l'expression associé à la variable "+var+" est correct et type de renvoi :"+type);
                                               }
                                               else
                                               {
                                                       System.err.println("Dans la région "+region+" l'expression associé à la variable \""+var+"\" est complètement incorrect");
                                                       if (!count)

                                                       {

                                                               System.err.println("Dans la région "+region+" problème avec le tableau \""+var+"\"");

                                                       }

                                               }

                                    }

                                    else

                                    {

                                       System.out.println("Dans la région "+region+" la variable "+var+" est visible");

                                       ArrayList<Boolean> bool = new ArrayList<Boolean>();

                                       

                                       if (ast.getChild(j).getChildCount()>2)

                                       {
                                    	   	   System.err.println("dans la région "+region+" il y a un problème de cohérence de type");
                                               for (int i=0;i<ast.getChild(j).getChildCount();i++)
                                               {
                                            	   if (ast.getChild(j).getChild(i).getText().equals("VAL"))
                                                       {
                                                               System.out.println(type);
                                                               Checkexpression(ast.getChild(j).getChild(i), type, region, bool);
                                                       }
                                               }
                                       }
                                       else
                                       {
                                               this.Checkexpression(ast.getChild(j).getChild(1),type,region,bool);
                                               if (this.semantiqueEstCorrect(bool))
                                               {
                                                       System.out.println("Dans la région "+region+" l'expression associé à la variable "+var+" est correct et type de renvoi :"+type);
                                               }
                                               else
                                               {
                                                       System.err.println("Dans la région "+region+" l'expression associé à la variable \""+var+"\" est complètement incorrect");
                                               }
                                       }
                                    }
                          }
                        	else if (ast.getChild(j).getText().equals("for"))
                        	{
				            			Tree	ast3=ast.getChild(j);
				            			System.out.println(ast3);
				            			String type = "";
				            			String type2 = "";
				            			
				            			String var = ast3.getChild(1).getText();
				            			
				            			 String var2= ast3.getChild(2).getText();
				            		
				            			if(IsInteger(var)&&IsInteger(var2))
				            			{
				            				if(Integer.parseInt(var)>Integer.parseInt(var2)){
				            					System.err.println(var+" est sup�rieur � "+var2);
				            				}
				            				else{}
				            			}
				            			 
				            			 if (var.equals("APPEL")){
				            			var=ast3.getChild(1).getChild(0).getText();
				            			 }
				            			 if(var2.equals("APPEL")){
				            				var2=ast3.getChild(2).getChild(0).getText();
				            				System.out.println(var2);
				            				
				            				}	
				            		
				            				ArrayList<Integer> pile_reg_ouv = new ArrayList<Integer>();
				            				pile_reg_ouv=this.pro.getPile().get(region);
				            				for(int k=0;k<pile_reg_ouv.size();k++){
				            					TDS courant = this.tdsglobale.TDSparRegion.get(pile_reg_ouv.get(k));
				
				            					for (int p=0;p<courant.getSymboles().size();p++)
				
				            					{
				            						if (courant.getSymboles().get(p).getNom().equals(var)){
				            							type = courant.getSymboles().get(p).getType();
				            						}
				            					}
				
				            					
				            					for (int u=0;u<courant.getSymboles().size();u++){
				            						if(courant.getSymboles().get(u).getNom().equals(var2)){
				            							type2 = courant.getSymboles().get(u).getType();
				            						}
				            					
				            					}
				            				}
				            				if(type!=null && type2!=null){
				            						if (type.equals("")&&!IsInteger(var)) //pas de type = pas d�clar�
				
				            								{
				
				            							System.err.println("Dans la r�gion "+region+" La variable \""+var+"\" n'est pas d�clar�e ou n'est pas visible");
				
				            							ArrayList<Boolean> bool = new ArrayList<Boolean>();
				
				            							//this.Checkexpression(ast.getChild(j).getChild(1),type,region,bool);
				
				            							//System.err.println("Dans la r�gion "+region+" l'expression associ� � la variable \""+var+"\" est compl�tement incorrect");
				
				            								}
				            					if(type2.equals("")&&!IsInteger(var2))
				            						{
				            							System.err.println("Dans la r�gion "+region+" La variable \""+var2+"\" n'est pas d�clar�e ou n'est pas visible");
				
				            							ArrayList<Boolean> bool = new ArrayList<Boolean>();
				
				            							//this.Checkexpression(ast.getChild(j).getChild(1),type2,region,bool);
				
				            							//System.err.println("Dans la r�gion "+region+" l'expression associ� � la	 variable \""+var2+"\" est compl�tement incorrect");
				
				            						}
				
				            					 if(!type.equals("integer")&& !IsInteger(var)) {
				            							System.err.println("La variable "+var+" n'est pas un entier");
				            						}
				            					 if(!type2.equals("integer")&& !IsInteger(var2)) {
				            							System.err.println("La variable "+var2+" n'est pas un entier");
				            						}
				            				}
				            					 else{
				            						 System.err.println("For mal formé");
				            					 }
				            			 GetIntoInstruction(ast.getChild(j).getChild(3), region);
            			}
                        else if (ast.getChild(j).getText().equals("if"))
                        {
                            	Tree ast2=ast.getChild(j).getChild(0);
                        			IsGood(ast2,region);
                        	
                            	}
                            	for(int o=0;o<ast.getChild(j).getChildCount();o++){
                            		if (ast.getChild(j).getChild(o).getText().equals("then"))
                            	 GetIntoInstruction(ast.getChild(j).getChild(o), region);}
                         }	
                       /* else if (ast.getText().equals("==")||ast.getText().equals("!=")||ast.getText().equals(">=")||ast.getText().equals("<=")||ast.getText().equals("<")||ast.getText().equals(">"))
            			{
		            			Tree	ast3=ast.getChild(j);
		            			String var1=ast.getChild(0).getText();
		            			String var2=ast.getChild(1).getText();
		            			String type1="";
		            			String type2="";
		            			String nature1="";
		            			String nature2="";
		            			int param1=0;
		            			int param2=0;
		            			 if (var1.equals("APPEL")){
		            					var1=ast3.getChild(1).getChild(0).getText();
		            					System.out.println(var1);
		            					 }
		            					 if(var2.equals("APPEL")){
		            						var2=ast3.getChild(2).getChild(0).getText();
		            						System.out.println(var2);
		            						
		            						}	
		            			ArrayList<Integer> pile_reg_ouv = new ArrayList<Integer>();
		            			pile_reg_ouv=this.pro.getPile().get(region);
		            			for(int k=0;k<pile_reg_ouv.size();k++){
		            				TDS courant = this.tdsglobale.TDSparRegion.get(pile_reg_ouv.get(k));
		
		            				for (int p=0;p<courant.getSymboles().size();p++)
		
		            				{
		            					if (courant.getSymboles().get(p).getNom().equals(var1)){
		
		            						type1 = courant.getSymboles().get(p).getType();
		            						nature1=courant.getSymboles().get(p).getNature();
		            						param1=courant.getSymboles().get(p).getParametre();
		            					}
		            					}
		            				for (int u=0;u<courant.getSymboles().size();u++)
		            					if(courant.getSymboles().get(u).getNom().equals(var2)){
		            						type2 = courant.getSymboles().get(u).getType();
		            						nature2=courant.getSymboles().get(u).getNature();
		            						param2=courant.getSymboles().get(u).getParametre();
		            					}
		            				}
		            			
		            				
		            			if(!type1.equals(type2))
		            				System.err.println("Les expressions ne sont pas de meme type");
		            			else if(!nature1.equals(nature2))
		            					System.err.println("Les expressions ne sont pas de meme nature");
		            			else if(param1!=param2)
		            				System.err.println("Les expressions n'ont pas le meme nombre de parametres");
            				}*/
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
                if (type.equals("integer"))
                {
                       if (ast.getText().equals("-") && ast.getChildCount()==1)
                           {
                                   Checkexpression( ast.getChild(0),type,region,b);
                           }
                           else if ( ast.getText().equals("+")
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
                                    if (app_type==null)
                                    {
                                        System.err.println("dans la region "+ region+" La procedure "+ app +" n'a pas de type donc on ne peut pas l'additionner avec un entier");
                                        b.add(false);
                                    }
                                    else if (app_type.equals("integer"))
                                    {
                                            b.add(true);
                                    }
                                    else
                                    {
                                            System.err.println("dans la region "+ region+" La fonction ou procedure "+ app +" n'est pas déclaré ou pas visible ou ne renvoie pas le bon type");
                                            b.add(false);
                                    }
                            }
                            else if (ast.getText().equals("TABLEAU")) 
                            {
                                    String app =ast.getChild(0).getText();
                                    String app_type = this.SearchTypeIntoTds(app, region);
                                    if (app_type.equals("ARRAY"))
                                    {
                                            b.add(true);
                                    }
                                    else
                                    {
                                            System.err.println("Dans la région "+region+" le tableau "+ app + " n'est pas déclaré");
                                            b.add(false);
                                    }
                            }
                            else if (ast.getText().equals("VAL"))
                            {
                                    Checkexpression( ast.getChild(0), type,region,b);
                            }
                            else //c'est une variable
                            {
                                    String app =ast.getText();
                                    String app_type = this.SearchTypeIntoTds(app, region);
                                    CheckVariableInitialise(app, region);//verifier que la variable est bien initialisée
                                    if (app_type.equals("integer"))
                                    {
                                            b.add(true);
                                    }
                                    else
                                    {
                                            System.err.println("Dans la région "+region+" la variable "+ app + " n'est pas déclarée ou ne renvoie pas le bon type");
                                            b.add(false);
                                    }
                            }
                }
                else if (type.equals("boolean"))
                {
                        if (ast.getText().equals("-") && ast.getChildCount()==1)
                           {
                                  Checkexpression( ast.getChild(0),type,region,b);
                           }
                           else if (   ast.getText().equals("+")
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
                                    if (app_type==null)
                                    {
                                        System.err.println("dans la region "+ region+" La procedure "+ app +" n'a pas de type donc on ne peut pas l'additionner");
                                        b.add(false);
                                    }
                                    else if (app_type.equals(type))
                                    {
                                            b.add(true);
                                    }
                                    else
                                    {
                                            System.err.println("dans la region "+ region+" La fonction ou procedure "+ app +" n'est pas déclaré ou pas visible ou ne renvoie pas le bon type");
                                            b.add(false);
                                    }
                            }
                            else if (ast.getText().equals("VAL"))
                            {
                                    Checkexpression( ast.getChild(0), type,region,b);
                            }
                            else if (ast.getText().equals("TABLEAU"))
                            {
                                    String app =ast.getChild(0).getText();
                                    String app_type = this.SearchTypeIntoTds(app, region);
                                    if (!app_type.equals("ARRAY"))
                                    {
                                            System.err.println("Dans la region "+region+" le tableau "+ app +" n'est pas défini comme un tableau");
                                    }
                                    b.add(false);
                                    System.err.println("Dans la region "+region+" on ne peut pas évaluer des booléens avec des entiers");
                            }
                            else if (this.IsInteger(ast.getText()))
                            {
                                    System.err.println("Dans la region "+region+" on ne pas peut évaluer des booléens avec des entiers");
                                    b.add(false);
                            }

                       else //c'est une variable
                            {
                                    String app =ast.getText();
                                    String app_type = this.SearchTypeIntoTds(app, region);
                                    CheckVariableInitialise(app, region);//verifier que la variable est bien initialisée
                                    if (!app_type.equals(""))
                                    {
                                            b.add(true);
                                    }
                                    else
                                    {
                                            System.err.println("Dans la région "+region+" la variable "+ app + " n'est pas déclarée");
                                            b.add(false);
                                    }
                            }
                }
                else if (type.equals("ARRAY"))
                {
                           if (ast.getText().equals("-") && ast.getChildCount()==1)
                           {
                                   Checkexpression( ast.getChild(0),type,region,b);
                           }
                           else if ( ast.getText().equals("+")
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
                                    if (app_type==null)
                                    {
                                        System.err.println("dans la region "+ region+" La procedure "+ app +" n'a pas de type donc on ne peut pas l'additionner");
                                        b.add(false);
                                    }
                                    else if (app_type.equals("integer"))
                                    {
                                            b.add(true);
                                    }
                                    else
                                    {
                                            System.err.println("dans la region "+ region+" La fonction ou procedure "+ app +" n'est pas déclaré ou pas visible ou ne renvoie pas le bon type");
                                            b.add(false);
                                    }
                            }
                            else if (ast.getText().equals("TABLEAU"))
                            {
                                    String app =ast.getChild(0).getText();
                                    String app_type = this.SearchTypeIntoTds(app, region);
                                    if (app_type.equals("ARRAY"))
                                    {
                                            b.add(true);
                                    }
                                    else
                                    {
                                            System.err.println("Dans la région "+region+" le tableau "+ app + " n'est pas déclaré");
                                            b.add(false);
                                    }
                            }
                            else //c'est une variable
                            {
                                    String app =ast.getText();
                                    String app_type = this.SearchTypeIntoTds(app, region);
                                    CheckVariableInitialise(app, region);//verifier que la variable est bien initialisée
                                    if (app_type.equals("integer"))
                                    {
                                            b.add(true);
                                    }
                                    else
                                    {
                                            System.err.println("Dans la région "+region+" la variable "+ app + " n'est pas déclarée ou ne renvoie pas le bon type");
                                            b.add(false);

                                    }
                            }
                }
        }

        private String SearchTypeIntoTds(String var, int region) 
        {
                ArrayList<Integer> pile_reg_ouv = new ArrayList<Integer>();
                pile_reg_ouv=this.pro.getPile().get(region);
                String type="";
                for (int i = 0; i< pile_reg_ouv.size();i++)
                {
                        TDS courant = this.tdsglobale.TDSparRegion.get(pile_reg_ouv.get(i));
                        for (int j=0;j<courant.getSymboles().size();j++)
                        {
                        	if (courant.getSymboles().get(j).getNom().equals(var))
                             {
                                 type=courant.getSymboles().get(j).getType();

                             }
                        }
                }
                return type;
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

        public void checkOccur(TDSGlobal tdsFinal) 
        {
                for (int i=0;i<tdsFinal.TDSparRegion.size();i++)
                {
                        TDS courant = tdsFinal.TDSparRegion.get(i);
                        for (int j=0;j<courant.symboles.size();j++)
                        {
                                String nom =courant.symboles.get(j).getNom();
                                for(int k=0;k<j;k++)
                                {
                                        if (nom.equals(courant.symboles.get(k).getNom()))
                                        {
                                                System.err.println("Dans la region "+courant.symboles.get(k).getNumeroRegion()+ " l' élément "+ courant.symboles.get(k).getNom() +" est déclaré plusieurs fois" );
                                        }
                                }
                        }
                }
        } 
        

        public void CheckVariableInitialise (String idf,int region)

        {
                ArrayList<Integer> pile_reg_ouv = new ArrayList<Integer>();
                pile_reg_ouv=this.pro.getPile().get(region);
                this.region_declarant=pile_reg_ouv.get(pile_reg_ouv.size()-1);
                for (int p=0;p<pile_reg_ouv.size();p++)
                {
                        SearchRegionInAST(ast,idf,pile_reg_ouv.get(p),0);
                        if (check)
                        {
                                p=pile_reg_ouv.size();
                        }
                }
                if (check)
                {
                        System.out.println("Dans la région "+region+" la variable "+idf+ " a bien été initialisée");
                }
                if (!IsParameter(idf,region))
                {
	                if (!check)
	                {
	                        System.err.println("Dans la région "+region+" la variable "+ idf+" n'as pas été initialisée");
	                }
                }
        }

        
        private boolean IsParameter(String idf, int region) 
        {
        	boolean isParameter=false;
			for (int i=0;i<this.tdsglobale.TDSparRegion.size();i++)
			{
				TDS courant = this.tdsglobale.TDSparRegion.get(i);
				if (courant.getregion()==region)
				{
					for (int j=0;j<courant.getSymboles().size();j++)
					{
						if (idf.equals(courant.getSymboles().get(j).getNom())
							&& (courant.getSymboles().get(j).getNature().equals("parametreV") || courant.getSymboles().get(j).getNature().equals("parametreA")))
						{
							isParameter=true;
							i=this.tdsglobale.TDSparRegion.size();
							j=courant.getSymboles().size();
						}
					}
				}
			}
			return isParameter;
		}





		private void SearchRegionInAST(Tree a, String idf, Integer region_a_trouver, int region_ast) 
        {
                if (region_a_trouver==region_ast)
                {                        
                        if (region_a_trouver==0)
                        {
                                for (int p=0;p<a.getChildCount();p++)
                                {
                                        if (a.getChild(p).getText().equals("INSTRUCTION"))
                                        {
                                            SearchAffectationVariable(a.getChild(p),idf,region_ast);
                                        }
                                }
                        }
                        else
                        {
                                for (int v=0;v<a.getChildCount();v++)
                                {
                                        if (a.getChild(v).getText().equals("BLOC"))
                                        {
                                                for (int p=0;p<a.getChild(v).getChildCount();p++)
                                                {
                                                        if (a.getChild(v).getChild(p).getText().equals("INSTRUCTION"))
                                                        {
                                                            SearchAffectationVariable(a.getChild(v).getChild(p),idf,region_ast);
                                                        }
                                                }
                                        }
                                }
                        }
                }
                else
                {
                        for (int i = 0; i<a.getChildCount();i++)
                        {
                                 if (a.getChild(i).getText().equals("DECLARATION"))
                                        {
                                                SearchRegionInAST(a.getChild(i), idf, region_a_trouver,region_ast);
                                        }
                                        else if (a.getChild(i).getText().equals("FONCTION") || a.getChild(i).getText().equals("PROCEDURE"))
                                        {
                                                SearchRegionInAST(a.getChild(i), idf, region_a_trouver,++region_ast);
                                        }
                                        else if (a.getChild(i).getText().equals("BLOC"))
                                        {
                                                SearchRegionInAST(a.getChild(i), idf, region_a_trouver,region_ast);
                                        }
                        }
                }
        }
       
        private void SearchAffectationVariable(Tree a, String idf,int region) 
        {
                int trouve=0;
                int var=0;
                for (int i=0;i<a.getChildCount();i++)
                {
                        if (a.getChild(i).getText().equals("="))
                        {
                        	if (region != this.region_declarant)
                        	{
                                if (a.getChild(i).getChild(0).getText().equals(idf))
                                {
                                        this.check=true;
                                        trouve=1;
                                        i=a.getChildCount();
                                }
                        	}
                        	else
                        	{
                                if (a.getChild(i).getChild(0).getText().equals(idf) && i<this.place)
                                {
                                        this.check=true;
                                        trouve=1;
                                        i=a.getChildCount();
                                }    		
                        	}
                        }
                }
                if (trouve==0)
                {
                        this.check=false;
                }

        }   public boolean IsNotOp(Tree ast){
        	boolean b=false;
        		if(!ast.getText().equals("==")&& !ast.getText().equals("!=")&& !ast.getText().equals(">=")&&!ast.getText().equals("<=")&&!ast.getText().equals("<")&&!ast.getText().equals(">")&&!ast.getText().equals("+")&&!ast.getText().equals("-")&&!ast.getText().equals("*")&&!ast.getText().equals("/"))
        		{
        		b=true;	
        		}
        		
        	return b;
        }
        
        public void IsGood(Tree ast,int region){
        	ArrayList<String>  types=new ArrayList<String>();
        	if(IsNotOp(ast)){
        	String var=ast.getText();
        	String type;
        	ArrayList<Integer> pile_reg_ouv = new ArrayList<Integer>();
        	pile_reg_ouv=this.pro.getPile().get(region);
			if(IsInteger(var)){
		types.add("integer");
			}
			else{
        	for(int k=0;k<pile_reg_ouv.size();k++){
				TDS courant = this.tdsglobale.TDSparRegion.get(pile_reg_ouv.get(k));

				for (int p=0;p<courant.getSymboles().size();p++)

				{
					if (courant.getSymboles().get(p).getNom().equals(var)){

						type = courant.getSymboles().get(p).getType();
						if(!type.equals("") && type!=null ){			
						types.add(type);
					
						}
						
						else{
							System.err.println("La variable "+var+" n'est pas declaree");
						}
					}
					
				}
			}
			
			}
        	}
        	
        	
			 	for ( int z =0;z<ast.getChildCount();z++){
			 		IsGood(ast.getChild(z),region);
			 	}
        	
			System.out.println(types);
        	String s = "";
        	String c = "";
			for (int l=0;l<types.size();l++){
				
	        	 s = types.get(l);
              for (int m=0;m<types.size();m++){
            
              	
            	  c =types.get(m);
              }
			}
        			if (!s.equals(c)){
        				System.err.println("La condition du if n'est pas un boolean");
        			}
        		
			
        

        }
}

