package ArraysECollections;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        
        double [] notasAlunoA = new double[4];//contruindo um array.
        System.out.println(Arrays.toString(notasAlunoA));//inicialização do array(seus valores iniciais)

        //Adicionando valores ao vetor
        notasAlunoA [0] = 8.6;
        notasAlunoA [1] = 9;
        notasAlunoA [2] = 6.8;
        notasAlunoA [3] = 10;

        System.out.println(Arrays.toString(notasAlunoA));//exibindo o array

        double total = 0;

        for(int i = 0;i < notasAlunoA.length;i++){//percorrendo o array com  For
            total += notasAlunoA[i];
        }

        System.out.println(total / notasAlunoA.length);

        double [] notasdoAlunoB = {6, 4.5, 8, 9.8, 7};

        double totalNotasAlunoB = 0;
        for(int i = 0; i < notasdoAlunoB.length;i++){
            totalNotasAlunoB += notasdoAlunoB[i];
        }

        System.out.println(totalNotasAlunoB / notasdoAlunoB.length);
        //percorendo o array com Foreach
        double [] Notas = { 9.9, 6.5, 7.3, 8.8 };

        for(double nota: Notas){
            System.out.println(nota + " ");
        }
    }
    
}
