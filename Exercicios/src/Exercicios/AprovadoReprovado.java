package Exercicios;

import java.util.Scanner;

public class AprovadoReprovado {
    // Criar um programa que receba duas notas parciais, calcular a média final. 
    // Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
    // se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
    // caso contrário imprime no console "Reprovado".
    public static void main(String[] args) {
        Scanner entradaDeNotas = new Scanner(System.in);

        System.out.print("Digite a primira nota: ");
        Double nota1 = entradaDeNotas.nextDouble();

        System.out.print("Digite a segunda nota: ");
        Double nota2 = entradaDeNotas.nextDouble();       
        
        double media = (nota1 + nota2) / 2;

        System.out.println("Média = " + media);


        if(media >= 7){
            System.out.println("Aprovado !!!! Parabêns...:)");
        }else if(media < 7 && media > 4){
            System.out.println("Recuperação!!!!!");
        }else{
            System.out.println("Reprovado!");
        }
        


        entradaDeNotas.close();
    }
}
