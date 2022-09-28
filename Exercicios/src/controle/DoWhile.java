package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do{
            System.out.println("Diga as palavras mágica...: ");
            texto = entrada.nextLine();

        }while(!texto.equalsIgnoreCase("Por Favor"));


        entrada.close();
    }
}
