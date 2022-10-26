package listaDeExercicios.desafios;

public class carro {
    int velocidadeAtual;
    final int VELOCIDADE_MAXIMA;
    int delta = 5;

    carro(int velocidade_maxima, int velocidade_maxima2, int delta2){
        VELOCIDADE_MAXIMA = velocidade_maxima;
    }

    void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += delta;
        }
    }

    void frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else{
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return  "A velocidade atual é " + velocidadeAtual + "KM/h";
    }
}
