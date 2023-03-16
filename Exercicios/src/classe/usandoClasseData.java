package classe;

public class usandoClasseData {
    public static void main(String[] args) {


        dataTeste Data = new dataTeste();
        Data.dia = 06;
        Data.mes = 02;
        Data.ano = 1993;
        Data.nome = "Delmiro Junior";

        dataTeste Nascimento = new dataTeste();
        Nascimento.nome = "Gabriel Brandão";
        Nascimento.dia = 07;
        Nascimento.mes = 06;
        Nascimento.ano = 2021;

        //Não usaremos o toString nesse exemplo

        System.out.println("A data de nascimento de "
                + Nascimento.nome + " é : " + Nascimento.dia + "/" + Nascimento.mes + "/"
                + Nascimento.ano);

        System.out.println("A data de nascimento de "
                + Nascimento.nome + " é : " + Nascimento.dia + "/" + Nascimento.mes + "/"
                + Nascimento.ano);
    }
}
