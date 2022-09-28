package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadesNotas = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1){
            System.out.print("Digite a nota (ou -1 para sair): ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){
                total += nota;// acu
                quantidadesNotas++;//acumulando a quantidade de notas
            }else if(nota != -1){
                System.out.println("Nota inválida!!");
            }
        }

        //calcular média
        double media = total / quantidadesNotas;
        System.out.println("Média = " + media);




        entrada.close();
    }
}
