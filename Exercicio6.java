package estruturaPosCondicionada;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0,num;
		int nome;
		 
	       System.out.println("Informe um nome: ");
	       nome = ler.nextInt();
	       System.out.println("Informe um numero: ");
	       num = ler.nextInt();
	       
	       while (i <= num) { 
	    	   System.out.println(nome);
	    	   i++;
	    	
	       }
		

	}

}
