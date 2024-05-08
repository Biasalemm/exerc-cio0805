package estruturaPosCondicionada;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); 
	   int i = 1;
      String nome;
       System.out.println("Informe o nome do usuário: ");
       nome = ler.nextLine();
       
       while (i <= 10) { 
    	   System.out.println(nome);
    	   i++;
    	
       }
       ler.close();
     
	}

}
