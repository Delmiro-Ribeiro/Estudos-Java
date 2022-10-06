package ArraysECollections;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos aluno?: ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno?: ");
        int qtNotas = entrada.nextInt();

        double [] [] notasdaTurma = new double [qtdeAlunos] [qtNotas];

        int total = 0;
        for(int a = 0;a < notasdaTurma.length;a++){
            for(int n = 0;n < notasdaTurma[a].length;n++){
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasdaTurma[a][n] = (double) entrada.nextInt();
                total += notasdaTurma[a][n];

            }
        }

        double media = total / (qtdeAlunos * qtNotas);
        System.out.println("A média da turma é: " + media);

        entrada.close();
    }
}
