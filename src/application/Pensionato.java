package application;

import java.util.Scanner;

import entities.Aluguel;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluguel[] aluguel = new Aluguel[10];  
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.printf("Aluguel #%d:\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeEstudante = sc.nextLine();
			System.out.print("Email: ");
			String emailEstudante = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
						
			aluguel[quarto] = new Aluguel(nomeEstudante, emailEstudante);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for(int i = 0 ; i < 10 ; i++) {
			if(aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i]);
			}
		}
		
		sc.close();
	}

}
