package prog;

import java.util.ArrayList;
import java.util.Scanner;


public class Smartv extends Tv{
	
	boolean conectar;

	int modo;

	int login;

	int senha;
	
	public Smartv(boolean ligar, int volume, int canal,boolean conectar, int modo, int login, int senha) {
	super(ligar,volume,canal);
	this.conectar = conectar;
	this.modo = modo;
	this.login = login;
	this.senha = senha;
}

public boolean isConectar() {
	return conectar;
}



public int getModo() {
	return modo;
}


public int getLogin() {
	return login;
}



public int getSenha() {
	return senha;
}


ArrayList<Integer> canais = new ArrayList<Integer>();


void streaming() {
	System.out.println("");
	System.out.println("*****************************************************************");
	if(ligar==true) {
	if (conectar==true) {
	if(modo==1) {
		modo=2;
		System.out.println("A tv mudou para o modo STREAMING");
	}else {
		System.out.println("A tv ja esta no modo STREAMING!");
	}
	}else {
		System.out.println("A tv esta desconectada");
	}
}else {
	System.out.println("A tv esta desligada!");
}
	System.out.println("*****************************************************************");
	System.out.println("");

	
}

void tv() {
	System.out.println("");
	System.out.println("*****************************************");
	if(ligar==true) {
	if(modo==2) {
		modo=1;
		System.out.println("A tv mudou para o modo TV");
	}else {
		System.out.println("A tv ja esta no modo TV!");
	}}else {
		System.out.println("A tv esta desligada!");
	}
	System.out.println("******************************************");
	System.out.println("");
}

void trocarLogineSenha() {
	Scanner imput = new Scanner(System.in);
	//System.out.println("");
	//System.out.println("*****************************************");
	

		if (conectar==true) {	
			System.out.println("");
			System.out.println("*****************************************");
	System.out.println("Digite novo login:");
	   this.login=imput.nextInt();
				

	System.out.println("Digite nova senha:");
		this.senha=imput.nextInt();
		
		System.out.println("Senha mudada com sucesso!");
		System.out.println("****************************************");
		System.out.println("");
		}
		
	//	System.out.println("******************************************");
	//	System.out.println("");
		

}

void login() {
	Scanner imput = new Scanner(System.in);
	int senha=1;
	int login=1;
	System.out.println("");
	System.out.println("*******************************************************");
	if(ligar==true) {
	
	if (conectar==true) {
		while(login!=this.login) {
			System.out.println("Digite Login e Senhas atuais:");
			System.out.println("");

	System.out.println("Digite login:");
	   login=imput.nextInt();
	   if(login==this.login) {
		   System.out.println("OK");
	   }else {
		   System.out.println("Login errado digite denovo.");
	   }
		}
		while(senha!=this.senha) {

	System.out.println("Digite senha:");
		senha=imput.nextInt();
		 if(senha==this.senha) {
			   System.out.println("OK");
		   }else {
			   System.out.println("Senha errado digite denovo.");
		   }
		}
}else {
	System.out.println("A tv esta desconectada!");
}}else {
	System.out.println("A tv esta desligada!");
}
	System.out.println("***********************************************************");
	System.out.println("");

}

void conectar() {
	
	Scanner imput = new Scanner(System.in);
	int senha=1;
	int login=1;
	System.out.println("");
	System.out.println("*****************************************");
	if(ligar==true) {
	if(conectar==false) {
		conectar=true;
		System.out.println("A tv conectou!");
		
		if (conectar==true) {
			while(login!=this.login) {
		System.out.println("Digite login:");
	
		   login=imput.nextInt();
		   if(login==this.login) {
			   System.out.println("OK");
		   }else {
			   System.out.println("Login errado digite denovo.");
		   }
			}
			while(senha!=this.senha) {

		System.out.println("Digite senha:");
			senha=imput.nextInt();
			 if(senha==this.senha) {
				   System.out.println("OK");
			   }else {
				   System.out.println("Senha errado digite denovo.");
			   }
			}
	}
	}else {
		System.out.println("A tv ja esta conectada!");
	}
	}else {
		System.out.println("A tv esta desligada!");
	}
	System.out.println("*******************************************");
	System.out.println("");
}

void desconectar() {
	System.out.println("");
	System.out.println("*****************************************");
	if(ligar==true) { 
	if (conectar==true) {
		if(modo==1) {
			conectar=false;
			System.out.println("A tv foi desconectada.");
		}else {
			System.out.println("A tv precisa estar no modo tv!");
		}
	}else {
		System.out.println("A tv ja esta desconectada!");
	}
	}else {
		System.out.println("A tv esta desligada!");
	}
	System.out.println("*****************************************");
	System.out.println("");

}

@Override
void status() {
	
	System.out.println("");
	System.out.println("***********************************************");

	if(ligar==true) {
		System.out.println("A tv esta ligada");
	
	
		if(conectar==true) {
			System.out.println("A tv esta conectada");
		}else {
			System.out.println("A tv esta desconectada!");
		}	
			super.status();

	
		if(modo==1) {
			System.out.println("A tv esta no modo Tv");
		}else {
			System.out.println("A tv esta no modo STREAMING");
		}	
	
	}else {
		System.out.println("A tv esta desligada!");
	}	
	System.out.println("***********************************************");

	System.out.println("");

}

void addCanais() {


int x=0;


Scanner imput = new Scanner(System.in);

while( x!=1) {
	System.out.println("Digite os canais a ser adicionado.");



this.canal=imput.nextInt();
canais.add(this.canal);
System.out.println( canais.toString());
System.out.println("Quando terminar digite 1.Se não terminou digite outro valor:");

x=imput.nextInt();

}}


@Override
void ligar() {
	
	modo=1;
	super.ligar();
	
}


void CanaisIniciais() {
	canais.add(1);
	canais.add(3);
	canais.add(5);
	canais.add(7);
	canais.add(11);
}

@Override
void mudarCanal() {
	Scanner imput = new Scanner(System.in);
	if (modo==1) {
		
		
		if(ligar==true) {
			System.out.println("Digite o canal desejado:");
			canal=imput.nextInt();
			
			if(canais.contains(canal)) {
			      System.out.println("Mudou para o canal: "+canal);
			   } else {
			      System.out.println("Esse canal não existe digite outro!");
			   }
			
		
				
		}else {
			System.out.println("A tv esta desligada!");
		}
	
	}else {
		System.out.println("A tv tem que estar no modo Tv!");
	}
	}



}