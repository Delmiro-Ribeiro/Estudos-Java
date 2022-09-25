package Fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;// declarando uma variavel junto ao seu tipo.
        System.out.println(a);

        a = 12;
        System.out.println(a);// o valor muda contudo o tipo do dado precisa  ser o mesmo.

        var b = 5;// variavel criada por inferencia, é quando foi declarada e sem que o tipo de dado fosse explicito.
        System.out.println(b);//os valores das variaveis podem mudar, mais seu tipo de dado NÃO!!!!!1

        var c = "...";
        System.out.println(c);

        /**
         * valores inteiros não suportam valores com casas decimais sendo que ao contrario funciona.
         */


    }
}
