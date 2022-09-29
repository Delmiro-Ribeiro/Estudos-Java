package Exercicios;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorNumero = 0;
        int contador = 0;

        do{
            System.out.print("\nDigite um numero: ");
            int numero = entrada.nextInt();

            if(numero > maiorNumero){
                maiorNumero = numero;
            }

            contador++;

        }while(contador != 10);

        System.out.println("O maior número foi " + maiorNumero);

        entrada.close();
    }
}
