package controle;

import java.util.Scanner;
/*
 * Estudos da estrutura If no controle de fluxo.
 */

public class If{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média: ");
        Double media = entrada.nextDouble();

        if(media <= 10 && media >= 7){
            System.out.println("Aprovado!");
            System.out.println("Parabêns!");
        }

        if(media < 7 && media >=4.5){
            System.out.println("Recuperação.");
        }

        //adicionando variavel ao if por causa do tamanho.
        boolean CriterioReprovacaoAtingido = media < 4.5 && media > 0;
        if(CriterioReprovacaoAtingido){
            System.out.println("Reprovado");
        }


        entrada.close();
    }
}