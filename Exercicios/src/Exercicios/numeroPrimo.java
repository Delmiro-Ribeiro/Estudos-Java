package Exercicios;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        // Criar um programa que receba um número e diga se ele é um número primo.
        int contadorDeDivisores = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = valor.nextInt();

        for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}



        valor.close();
    }
}
