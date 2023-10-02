package prog;

import java.util.Scanner;

import prog.Smartv;

public class Princi {
	
	public static void main (String[] args) {
		
		Scanner imput = new Scanner(System.in);
	
		Tv tv_quarto=null,tv_sala=null,tv_varanda=null;
		
		
		int op;
		int opcao=1;
		
		
		
		System.out.println(" Tv Sala -> Escolha o tipo da tv:");
		System.out.println("1 - Smartv");
		System.out.println("2-  Tv");
		 op= imput.nextInt();
		switch(op) {
		case 1:
			 tv_sala = new Smartv(false, 0, 1, false, 1, 123456, 987654) ;
			
		break;
		case 2:
			 tv_sala = new Tv(false, 0, 1) ;
		break;
		
		}
		
		System.out.println(" Tv Quarto -> Escolha o tipo da tv:");
		System.out.println("1 - Smartv");
		System.out.println("2-  Tv");
		 op= imput.nextInt();
		switch(op) {
		case 1:
			 tv_quarto = new Smartv(false, 0, 1, false, 1, 123456, 987654) ;
			
		break;
		case 2:
			 tv_quarto = new Tv(false, 0, 1) ;
		break;
		
		}
		
		System.out.println(" Tv Varanda -> Escolha o tipo da tv:");
		System.out.println("1 -  Smartv");
		System.out.println("2-   Tv");
		 op= imput.nextInt();
		switch(op) {
		case 1:
			 tv_varanda = new Smartv(false, 0, 1, false, 1, 123456, 987654) ;
			
		break;
		case 2:
			 tv_varanda = new Tv(false, 0, 1) ;
		break;
		
		}
		
		if(tv_sala instanceof Smartv   ) {
			((Smartv)tv_sala).CanaisIniciais();
			
		}	

		if( tv_quarto instanceof Smartv   ) {

			((Smartv)tv_quarto).CanaisIniciais();
			
		}

		if(tv_varanda instanceof Smartv   ) {
			
			((Smartv)tv_varanda).CanaisIniciais();
		}	
		
		
		
			while(op!=4) {
		System.out.println("Digite a alternativa desejada:");
		
		System.out.println("");
		System.out.println("1 tv_sala");
		System.out.println("2 tv_quarto");
		System.out.println("3 tv_varanda");
		System.out.println("4 SAIR");
		
		op=imput.nextInt();


		
		if (op==1) {
				if(tv_sala instanceof Smartv) {
					
				
					
					while(opcao>0 && opcao<13) {	
						
						
						System.out.println("Digite a alternativa desejada:");
						
						System.out.println("");
						System.out.println("1 ligar");
						System.out.println("2 desligar");
						System.out.println("3 aumentar");
						System.out.println("4 abaixar");
						System.out.println("5 streaming");
						System.out.println("6 tv");
						System.out.println("7 conectar");
						System.out.println("8 desconectar");
						System.out.println("9 muda de canal");
						System.out.println("10 status");
						System.out.println("11 trocar login e senha");
						System.out.println("12 adicionar canais");
						System.out.println("13 SAIR");
						System.out.println("***************************************");
						System.out.println("");

						opcao=imput.nextInt();
						
					
						
						switch (opcao){
						
						case 1:
							((Smartv)tv_sala).ligar();
						break;
						case 2:
							((Smartv)tv_sala).desligar();
						break;
						
						case 3:
							((Smartv)tv_sala).aumentar();
						break;
						
						case 4:
							((Smartv)tv_sala).abaixar();
						break;
						
						case 5:
							((Smartv)tv_sala).streaming();
						break;
						
						case 6:
							
							((Smartv)tv_sala).tv();
						break;
						case 7:
							((Smartv)tv_sala).conectar();
						break;
						case 8:
							((Smartv)tv_sala).desconectar();
						break;
						case 9:
							((Smartv)tv_sala).mudarCanal();
						break;
						case 10:
							
							((Smartv)tv_sala).status();
						break;
						case 11:
							((Smartv)tv_sala).login();
							((Smartv)tv_sala).trocarLogineSenha();
						break;
						case 12:
							((Smartv)tv_sala).addCanais();
						break;
						default:
							if (opcao>0 && opcao<13) {
								System.out.println("Opção invalida!/n/nTente denovo!");
							}
							
						}
					}
					opcao=1;
					
					

					
					}else {
						
						while(opcao>0 && opcao<7) {	
		    				System.out.println("Digite a alternativa desejada:");
						
		    				System.out.println("");
		    				System.out.println("1 ligar");
		    				System.out.println("2 desligar");
		    				System.out.println("3 aumentar");
		    				System.out.println("4 abaixar");
		    				System.out.println("5 muda de canal");
		    				System.out.println("6 status");
		    				System.out.println("7 SAIR");
		    				System.out.println("***************************************");
		    				System.out.println("");

		    				opcao=imput.nextInt();
						
					
						
						    switch (opcao){
						
						    	case 1:
						    		tv_sala.ligar();
						    	break;
						        case 2:
						        	tv_sala.desligar();
						        break;
						
						        case 3:
						        	tv_sala.aumentar();
						        break;
						
						        case 4:
						        	tv_sala.abaixar();
						        break;
												
						        case 5:
						        	tv_sala.mudarCanal();
						        break;		
						        case 6:
						        	tv_sala.status();
						        break;	
						
						        default:
							
						        	opcao=12;
						    }
		    		  }
						opcao=1;

						
				}
				}else {
					if(op==2) {
						if(tv_quarto instanceof Smartv) {
							
							
							
							while(opcao>0 && opcao<13) {	
								System.out.println("Digite a alternativa desejada:");
								
								System.out.println("");
								System.out.println("1 ligar");
								System.out.println("2 desligar");
								System.out.println("3 aumentar");
								System.out.println("4 abaixar");
								System.out.println("5 streaming");
								System.out.println("6 tv");
								System.out.println("7 conectar");
								System.out.println("8 desconectar");
								System.out.println("9 muda de canal");
								System.out.println("10 status");
								System.out.println("11 trocar login e senha");
								System.out.println("12 adicionar canais");
								System.out.println("13 SAIR");
								System.out.println("***************************************");
								System.out.println("");


								opcao=imput.nextInt();
								
							
								
								switch (opcao){
								
								case 1:
									((Smartv)tv_quarto).ligar();
								break;
								case 2:
									((Smartv)tv_quarto).desligar();
								break;
								
								case 3:
									((Smartv)tv_quarto).aumentar();
								break;
								
								case 4:
									((Smartv)tv_quarto).abaixar();
								break;
								
								case 5:
									((Smartv)tv_quarto).streaming();
								break;
								
								case 6:
									
									((Smartv)tv_quarto).tv();
								break;
								case 7:
									((Smartv)tv_quarto).conectar();
								break;
								case 8:
									((Smartv)tv_quarto).desconectar();
								break;
								case 9:
									((Smartv)tv_quarto).mudarCanal();
								break;
								case 10:
									
									((Smartv)tv_quarto).status();
								break;
								case 11:
									((Smartv)tv_quarto).login();
									((Smartv)tv_quarto).trocarLogineSenha();
								break;
								case 12:
									((Smartv)tv_sala).addCanais();
								break;
								default:
									if (opcao>0 && opcao<13) {
										System.out.println("Opção invalida!/n/nTente denovo!");
									}
									
								}
							}
							opcao=1;

							

							
							}else {
								
								while(opcao>0 && opcao<7) {	
				    				System.out.println("Digite a alternativa desejada:");
								
				    				System.out.println("");
				    				System.out.println("1 ligar");
				    				System.out.println("2 desligar");
				    				System.out.println("3 aumentar");
				    				System.out.println("4 abaixar");
				    				System.out.println("5 muda de canal");
				    				System.out.println("6 status");
				    				System.out.println("7 SAIR");
				    				System.out.println("***************************************");
				    				System.out.println("");

				    				opcao=imput.nextInt();
								
							
								
								    switch (opcao){
								
								    	case 1:
								    		tv_quarto.ligar();
								    	break;
								        case 2:
								        	tv_quarto.desligar();
								        break;
								
								        case 3:
								        	tv_quarto.aumentar();
								        break;
								
								        case 4:
								        	tv_quarto.abaixar();
								        break;
														
								        case 5:
								        	tv_quarto.mudarCanal();
								        break;		
								        case 6:
								        	tv_quarto.status();
								        break;	
								
								        default:
									
								        	opcao=12;
								    }
				    		  }
								opcao=1;

						}
						
					}else {
						if(op==3) {
							if(tv_varanda instanceof Smartv) {
								
								
								
								while(opcao>0 && opcao<13) {	
									System.out.println("Digite a alternativa desejada:");
									
									System.out.println("");
									System.out.println("1 ligar");
									System.out.println("2 desligar");
									System.out.println("3 aumentar");
									System.out.println("4 abaixar");
									System.out.println("5 streaming");
									System.out.println("6 tv");
									System.out.println("7 conectar");
									System.out.println("8 desconectar");
									System.out.println("9 muda de canal");
									System.out.println("10 status");
									System.out.println("11 trocar login e senha");
									System.out.println("12 adicionar canais");
									System.out.println("13 SAIR");
									System.out.println("***************************************");
									System.out.println("");


									opcao=imput.nextInt();
									
								
									
									switch (opcao){
									
									case 1:
										((Smartv)tv_varanda).ligar();
									break;
									case 2:
										((Smartv)tv_varanda).desligar();
									break;
									
									case 3:
										((Smartv)tv_varanda).aumentar();
									break;
									
									case 4:
										((Smartv)tv_varanda).abaixar();
									break;
									
									case 5:
										((Smartv)tv_varanda).streaming();
									break;
									
									case 6:
										
										((Smartv)tv_varanda).tv();
									break;
									case 7:
										((Smartv)tv_varanda).conectar();
									break;
									case 8:
										((Smartv)tv_varanda).desconectar();
									break;
									case 9:
										((Smartv)tv_varanda).mudarCanal();
									break;
									case 10:
										
										((Smartv)tv_varanda).status();
									break;
									case 11:
										((Smartv)tv_varanda).login();
										((Smartv)tv_varanda).trocarLogineSenha();
									break;
									case 12:
										((Smartv)tv_sala).addCanais();
									break;
									default:
										if (opcao>0 && opcao<13) {
											System.out.println("Opção invalida!/n/nTente denovo!");
										}
										
									}
								}
								opcao=1;


								
								}else {
									
									while(opcao>0 && opcao<7) {	
					    				System.out.println("Digite a alternativa desejada:");
									
					    				System.out.println("");
					    				System.out.println("1 ligar");
					    				System.out.println("2 desligar");
					    				System.out.println("3 aumentar");
					    				System.out.println("4 abaixar");
					    				System.out.println("5 muda de canal");
					    				System.out.println("6 status");
					    				System.out.println("7 SAIR");
					    				System.out.println("***************************************");
					    				System.out.println("");

					    				opcao=imput.nextInt();
									
								
									
									    switch (opcao){
									
									    	case 1:
									    		tv_varanda.ligar();
									    	break;
									        case 2:
									        	tv_varanda.desligar();
									        break;
									
									        case 3:
									        	tv_varanda.aumentar();
									        break;
									
									        case 4:
									        	tv_varanda.abaixar();
									        break;
															
									        case 5:
									        	tv_varanda.mudarCanal();
									        break;		
									        case 6:
									        	tv_varanda.status();
									        break;	
									
									        default:
										
									        	opcao=7;
									    }
					    		  }
									opcao=1;

							}
						}
					}
				}
		
			
	}
			 imput.close();	
}
	
}


