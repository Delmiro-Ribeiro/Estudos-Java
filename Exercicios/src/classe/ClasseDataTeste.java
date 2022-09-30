package classe;

public class ClasseDataTeste {
    public static void main(String[] args) {
        ClasseData DataNascimento = new ClasseData();
        DataNascimento.dia = 06;
        DataNascimento.mes = 02;
        DataNascimento.ano = 1993;
        DataNascimento.nome = "Delmiro Junior";

        ClasseData NascimentoFilho = new ClasseData();
        NascimentoFilho.nome = "Gabriel Brandão";
        NascimentoFilho.dia = 07;
        NascimentoFilho.mes = 06;
        NascimentoFilho.ano = 2021;

        System.out.println("A data de nascimento de " 
        + DataNascimento.nome + " é : " + DataNascimento.dia + "/" + DataNascimento.mes + "/"
         + DataNascimento.ano);

         System.out.println("A data de nascimento de " 
        + NascimentoFilho.nome + " é : " + NascimentoFilho.dia + "/" + NascimentoFilho.mes + "/"
         + NascimentoFilho.ano);
    }
}
