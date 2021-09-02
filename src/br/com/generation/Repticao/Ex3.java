package br.com.generation.Repticao;

import java.util.Scanner;

public class Ex3 {
//Exercício 3 | Author: Abner Werley | Date: 02/09/2021
	public static void main(String[] args) {
		/*
		 * 3- "Solicitar a idade de várias pessoas e imprimir: total de pessoas com
		 * menos de 21 anos e o total de pessoas com mais de 50 anos. O programa termina
		 * quando a idade for -99"
		 */

		Scanner leia = new Scanner(System.in);
		int idade, jovens = 0, idosos = 0;

		System.out.println("Insira a idade:");
		idade = leia.nextInt();
		while (idade != -99) {

			idade = leia.nextInt();
			if (idade <= 21) {
				jovens++;
			}

			if (idade >= 50) {
				idosos++;
			}
		}

		System.out.println("Houveram " + jovens + " pessoas com menos de 21 anos");
		System.out.println("e " + idosos + " pessoas com mais de 50 anos.");

		leia.close();
	}
}
