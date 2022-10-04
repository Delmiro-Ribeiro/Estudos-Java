package classe;

public class ValorvsReferencia {
    public static void main(String[] args) {
        int a = 2;// atribuição por valor(feito por tipos primitivos)
        int b = a;// o valor atribuido da primeira variável e absorvido como uma cópia.

        a++;
        b--;

        System.out.println(a + " " + b);
        /*
         * quando um valor é atribuido por objetos dizemos que foi por referencia, sendo que quando atribuimos 
         * o valor do primeiro objeto no segundo NÃO é feita uma cópia como na atribuição de por valor,
         * o objeto aponta para a mesma área de alocada na memória que o objeto um aponta, sendo assim 
         * que qualquer alteração que um dos dois fizer em seus valores , afetará o valor do outro objeto pois ambos
         * apontam e compartilham de um mesmo espaço na memória.
         */

        ClasseData d1 = new ClasseData();
        d1.dia = 5;

        ClasseData d2 = d1;

        System.out.println(d1 + " " + d2);

    }
}
