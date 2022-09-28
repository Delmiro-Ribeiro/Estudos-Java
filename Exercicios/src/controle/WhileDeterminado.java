package controle;

import java.util.Scanner;

public class WhileDeterminado {
    public static void main(String[] args) {
        /* int contador = 1;  LAÇO WHILE EXECUTA ENQUANTO UMA CONDIÇÃO FOR TRUE

        while(contador <= 10){
            System.out.printf("i = %d\n",contador);
            contador++;
        } */
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!valor.equalsIgnoreCase("sair")){
            System.out.print("Você diz: ");
            valor = entrada.nextLine();

        }

        entrada.close();
    }
}
