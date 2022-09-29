package Exercicios;

import java.util.Scanner;

public class anoBisexto {
    public static void main(String[] args) {
        /** 2. Criar um programa informa se o ano atual é um ano bissexto; */

		Scanner AnoBisexto = new Scanner(System.in);

		System.out.print("Digite o ano: ");
		int ano = AnoBisexto.nextInt();

		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);

		if (bissexto == true) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		AnoBisexto.close();
    }
}
