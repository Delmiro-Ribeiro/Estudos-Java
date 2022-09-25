package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        /*
         * criar um scanner
         * pegar 3 string usando nextline
         * os ultimos 3 salarios do funcionario
         * calcular a media dos ultimos 3 salarios
         * pode separar o valor por virgula ou ponto
         * nextline pega a linha toda;
         */

         Scanner entrada = new Scanner(System.in);

         System.out.print("Digite o ultimo salario: ");
         String ultimo = entrada.nextLine();

         System.out.print("\nDigite o penultimo salario: ");
         String penultimo = entrada.nextLine();

         System.out.print("\nDigite o antepenultimo salario: ");
         String antepeniltimo = entrada.nextLine();

         double ultimo1 = Double.parseDouble(ultimo);
         double penultimo2 = Double.parseDouble(penultimo);
         double antepeniltimo3 = Double.parseDouble(antepeniltimo);

         double media = (ultimo1 + penultimo2 + antepeniltimo3) / 2;

         System.out.println("A média dos ultimos três salários é: " + media);

        entrada.close();
    }
}
