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
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
		}
		
		double somaAlt = 0;
		for(int i = 0 ; i < n ; i++) {
			somaAlt += altura[i]; 
		}
		
		System.out.printf("Altura média: %.2f", somaAlt / n);
		
		int cont = 0;
		for(int i = 0 ; i < n ; i++) {
			if(idade[i] < 16) {
				cont ++;
			}
		}
		
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%", cont * 100 / n);
		for(int i = 0 ; i < n ; i++) {
			if(idade[i] < 16) System.out.println(nome[i]);
		}
		
		sc.close();
	}

}
