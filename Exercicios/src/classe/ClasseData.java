package classe;

public class ClasseData {
    int dia;
    int mes;
    int ano;
    String nome;

    // Data(){

    //     this(1,1,1970);//o this() como método é usado quando um contrutor chama outro construtor
    // }

    // Data(int diainicial, int mesinicial, int anoinicial){
    //     this.dia = diainicial;// o this. é usado para apontar uma variavel resolvendo assim conflitos de nomes.
    //     this.mes = mesinicial;
    //     this.ano = anoinicial;
    // }

    String ObterDataFormatada(){
        return String.format("%d/%d/%d",this.dia,mes,ano);
    }
}
