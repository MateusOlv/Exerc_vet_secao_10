package application;

import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vc quer digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.printf("Dados da %dª pessoa:", i+1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double somaAlt = 0;
		for(int i = 0 ; i < n ; i++) {
			somaAlt += altura[i]; 
		}
		
		System.out.printf("\nAltura média: %.2f\n", somaAlt / n);
		
		int cont = 0;
		for(int i = 0 ; i < n ; i++) {
			if(idade[i] < 16) {
				cont ++;
			}
		}
		
		double perc = cont * 100 / n; 
		
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", perc);
		for(int i = 0 ; i < n ; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
