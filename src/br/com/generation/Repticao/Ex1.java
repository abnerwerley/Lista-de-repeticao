package br.com.generation.Repticao;

public class Ex1 {

//	Exerc�cio 1 Author: Abner Werley date: 02/09/2021

	public static void main(String[] args) {
		// 1- "Informar todos os n�meros entre 1000 e 1999 que quando dividodos por
		// 11obtemos o resto 5"

		double numero, limite;

		System.out.println("Os n�meros entre 1000 e 1999 que quando divididos por " + "11 o resto � 5 s�o: ");
		for (numero = 1000, limite = 1999; numero <= limite; numero++) {

			if (numero % 11 == 5) {
				System.out.print(numero + "\n");

			}
		}

	}
}
