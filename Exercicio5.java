package estruturaPosCondicionada;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0;
		int num,som = 0;

		while (i < 10) {
			System.out.print("Informe um valor: ");
			num = ler.nextInt();
			i++;
			
			som+=num;
		}
		
	    System.out.println("A soma foi: " + som);
	
	}

}
