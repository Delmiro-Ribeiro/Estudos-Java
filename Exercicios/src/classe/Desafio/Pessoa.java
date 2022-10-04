package classe.Desafio;

public class Pessoa {

    String Nome;
    double Peso;

    Pessoa(String Nome, double Peso){
        this.Nome = Nome;
        this.Peso = Peso;
    }

    void comer(Comida Comida){
        if(Comida != null){
            this.Peso += Comida.peso;
        }
    }

    String apresentar(){
        return "Olá sou " + Nome + " e peso " + Peso + " Kgs.";     
    }

}
