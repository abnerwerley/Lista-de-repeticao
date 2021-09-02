package br.com.generation.Repticao;

import java.util.Scanner;

public class Ex5 {
//Exercício 5 | Author: Abner Werley | Date:02/09/2021

	public static void main(String[] args) {
		/*
		 * 5- "Crie um programa que leia um número do teclado até que encontre um número
		 * igual a 0(zero). No final, mostre a soma dos números digitados."
		 */

		Scanner leia = new Scanner(System.in);

		int numero, soma = 0;

		System.out.println("Digite números para soma, e para parar digite 0");
		do {
			numero = leia.nextInt();
			soma = soma + numero;
		} while (numero != 0);

		System.out.println("A soma dos números é " + soma);

		leia.close();
	}
}
