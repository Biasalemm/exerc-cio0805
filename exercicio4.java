package estruturaPosCondicionada;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in); 

		int i = 0;
		int idade, som =0;
		

		while (i <= 20) {
			System.out.print("Informe a idade: ");
			idade = ler.nextInt();
			i++;
			if (idade >= 18) {
				System.out.println("Maior de idade");
				som++;
				}
			else { 
				System.out.println("Menor de idade");
			}
			
			}
		System.out.println("O valor de pessoas maiores de idade é: " +som );
			}
	 
		}


	


