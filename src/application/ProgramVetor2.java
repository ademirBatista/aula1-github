package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetor2;

public class ProgramVetor2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVetor2[] vect = new ProductVetor2[n];
/* vect.length é a mesma coisa que  a variavel n,
   só que é melhor usar .lemgh para nao depender de outra variavel no vetor	*/	
 
		for(int i=0; i<vect.length; i++) {
			sc.nextLine(); /* para consumir o espaço da linha*/
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVetor2(name, price);/* preciso instanciar os produtos,
			 pq se trata de um vetor de referencia, o vect[i] aponta para o objeto*/
			
		}
		double sum = 0.0;
			for(int i=0; i<vect.length; i++) {
		/* getPrice pq preciso pegar para fazer media dos preços*/		
				sum += vect[i].getPrice();
				
			}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
