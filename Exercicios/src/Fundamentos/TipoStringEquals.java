package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");//evite comparar Strings com o operador ==. use a fucionalidade equals()

        String s1 = new String("2");
        System.out.println("2" == s1);//exemplo do não fazer
        System.out.println("2".equals(s1));//usando a função equal para comparar as Strings

        Scanner entrada = new Scanner(System.in);//estanciando o construtor para coletar informações do teclado.

        String s2 = entrada.next();//a funcionalidade next() retira os espaços em branco da String a nextLine() não
        System.out.println("2" == s2.trim());//a funcionalidade trim() retira os espaços em branco da String
        System.out.println("2".equals(s2));//forma certa de compara String com a funcionalidade equals()


        entrada.close();

    }
}
