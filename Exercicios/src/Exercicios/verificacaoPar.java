package Exercicios;

import java.util.Scanner;

public class verificacaoPar {
    public static void main(String[] args) {
        //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
        Scanner numeroVerificacao = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int verificavel = numeroVerificacao.nextInt();

        if(verificavel >= 0 && verificavel  <= 10 && verificavel % 2 == 0){
            System.out.printf("O número %d PAR e está no intervalo de 0 á 10.;)\n",verificavel);
        }
        else if(verificavel >= 0 && verificavel  <= 10 && verificavel % 2 == 1){
            System.out.printf("O número %d NÃO é par mais está no intervalo de 0 á 10.;(\n",verificavel);
        }else {
            System.out.printf("O número %d não está entre 0 e 10\n",verificavel);
        }



        numeroVerificacao.close();
    }
}
