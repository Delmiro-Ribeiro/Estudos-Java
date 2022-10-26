package listaDeExercicios.desafios;

public class carroTeste {
    public static void main(String[] args) {

        carro c1 = new civic(10, 5, 2);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        System.out.println();
        carro c2 = new ferrari(1, 5, 10);
        // carro c2 = new ferrari(1, 5, 10);minha resposta


        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

    }
}
