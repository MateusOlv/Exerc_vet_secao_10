package application;

import java.util.Scanner;

public class SomaVect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES =  ");
		for(int i = 0 ; i < n ; i++) {
			System.out.printf("%.2f ", vect[i]);
		}
		
		double soma = 0;
		for(int i = 0 ; i < n ; i++) {
			soma += vect[i];
		}
		System.out.printf("\nSOMA = %.2f\n", soma);
		
		System.out.printf("MEDIA = %.2f", soma / n);
		
		sc.close();
	}

}
