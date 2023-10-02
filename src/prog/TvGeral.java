package prog;

import java.util.Scanner;

public abstract class TvGeral {
	
	boolean	ligar;

	int volume;

	int canal;
	
	
	public boolean getLigar() {
		return ligar;
	}

	

	public int getVolume() {
		return volume;
	}

	

	public int getCanal() {
		return canal;
	}

	



		void ligar() {
			
			System.out.println("");
			System.out.println("********************************************************");
			
			if(ligar==false) {
				ligar=true;
				System.out.println("A tv ligou!");
			}else {
				System.out.println("A tv ja esta ligada!");
			}
			
			System.out.println("********************************************************");
			System.out.println("");

		
	}
		
		void desligar() {
			System.out.println("");
			System.out.println("********************************************************");
			
			if(ligar==true) {
				ligar=false;
				System.out.println("A tv vai desligar!");
			}else {
				System.out.println("A tv ja esta desligada!");
			}
			System.out.println("********************************************************");
			System.out.println("");

	}
		
		void aumentar() {
			System.out.println("");
			System.out.println("********************************************************");
			
			if(ligar==true) {
				if(volume<100) {
					volume++;
					System.out.println("Volume "+volume);
				}else {
					System.out.println("A tv ja esta no maximo");
				}
			}else {
				System.out.println("A tv esta desligada!");
			}
			
			System.out.println("********************************************************");
			System.out.println("");

		
		
	}
		void abaixar() {
			System.out.println("");
			System.out.println("********************************************************");
			
			if(ligar==true) {
				if(volume>0) {
					
					volume--;
					System.out.println("Volume "+volume);
				}else {
					System.out.println("A tv ja esta no minimo!");
				}
			}else {
				System.out.println("A tv esta desligada!");
			}	
			System.out.println("********************************************************");
			System.out.println("");
	}
		
		
		void status() {
			//System.out.println("");
			//System.out.println("********************************************************");
			
			if(ligar==true) {
								
					System.out.println("Volume "+getVolume());
					System.out.println("canal "+getCanal());
			}else {
				System.out.println("A tv esta desligada!");

			}
							
			
			//System.out.println("********************************************************");
			//System.out.println("");
			
		}
		
		
		void mudarCanal(){
			
			System.out.println("");
			System.out.println("********************************************************");
			
			Scanner imput = new Scanner(System.in);
			int canal=0;
			if(ligar==true) {
				while(canal != 1 && canal !=3 && canal != 5 && canal!=7 && canal!=11) {
				System.out.println("Digite o canal desejado:");
				canal=imput.nextInt();
				if(canal==1||canal==3||canal==5||canal==7||canal==11) {
					this.canal=canal;
				}else {
					System.out.println("Esse canal não existe digite outro!");
				}
				}
			}else {
				System.out.println("A tv esta desligada!");
			}
			System.out.println("********************************************************");
			System.out.println("");
				
		}
		
	}