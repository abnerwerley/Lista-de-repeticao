package br.com.generation.Repticao;

import java.util.Scanner;

public class Ex5 {
//Exerc�cio 5 | Author: Abner Werley | Date:02/09/2021

	public static void main(String[] args) {
		/*
		 * 5- "Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
		 * igual a 0(zero). No final, mostre a soma dos n�meros digitados."
		 */

		Scanner leia = new Scanner(System.in);

		int numero, soma = 0;

		System.out.println("Digite n�meros para soma, e para parar digite 0");
		do {
			numero = leia.nextInt();
			soma = soma + numero;
		} while (numero != 0);

		System.out.println("A soma dos n�meros � " + soma);

		leia.close();
	}
}
