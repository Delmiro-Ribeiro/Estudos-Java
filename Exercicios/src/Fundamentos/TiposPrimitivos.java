package Fundamentos;

public class TiposPrimitivos{
    public static void main(String[] args) {
        //Informações do funcionario

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;// 1 byte
        short numeroDeVoos = 542; // 2 bytes
        int id = 56789; // 4 bytes
        long pontosAcumulados = 3_134_845_223L;//8 bytes

        //Tipos numéricos reais
        float salario = 11_445.44F;
        // o valor com ponto flutuante vem com double por padrão
        //por isso ten-se a nescessidade da letra F no fim do valor atribuido.
        double VendaAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean EstaDeFerias = false; //true

        //Tipo caractere
        char status = 'A';

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //numero de viagens
        System.out.println(numeroDeVoos / 2);

        //pontos por real
        System.out.println(pontosAcumulados / VendaAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias?: " + EstaDeFerias);
        System.out.println("Status: " + status);


    }
}