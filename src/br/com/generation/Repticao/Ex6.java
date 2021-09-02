package br.com.generation.Repticao;

import java.util.Scanner;

public class Ex6 {
//Exercício 6 | Author: Abner Werley | date: 02/09/2021
	public static void main(String[] args) {
		/*
		 * Escreva um programa que receba inteiros do teclado, e no final imprima a
		 * média dos números multiplos de 3. Para sair, digite 0(zero)
		 */

		Scanner leia = new Scanner(System.in);
		int numero;
		double media = 0.0, soma = 0.0, contagem = 0.0;

		System.out.println(
				"Insira qualquer número. Para parar e saber" 
		+ " a média dos números multiplos de 3, digite 0 .");

		do {
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero != 0) {

				soma = soma + numero;
				// System.out.println(soma);
				contagem++;
				// System.out.println(contagem);
				media = soma / contagem;
				// System.out.println(media);
			}
		} while (numero != 0);

		System.out.println("A média dos números inseridos é " + media);

		leia.close();

	}
}
