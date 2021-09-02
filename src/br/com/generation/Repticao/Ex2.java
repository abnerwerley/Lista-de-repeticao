package br.com.generation.Repticao;

import java.util.Scanner;

public class Ex2 {
//Exercício 2 | Author : Abner Werley | Date: 02/09/2021

	public static void main(String[] args) {
		/*
		 * 2- "Ler 10 números e imprimir quantos são pares e quantos são ímpares."
		 */

		Scanner leia = new Scanner(System.in);
		double contagemPar = 0, contagemImpar = 0, numero, numeroInformado;

		System.out.println("Digite 10 números");

		for (numero = 1; numero <= 10; numero++) {

			numeroInformado = leia.nextDouble();

			if (numeroInformado % 2 == 0) {

				contagemPar++;
			}

			if (numeroInformado % 2 == 1) {

				contagemImpar++;
			}
			if (numero == 10) {
				leia.close();
			}

		}

		System.out.println("Houveram " + contagemImpar + " números impares;");
		System.out.print("e " + contagemPar + " números pares.");
	}
}
