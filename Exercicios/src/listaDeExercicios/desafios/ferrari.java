package listaDeExercicios.desafios;

public class ferrari extends carro implements esportivo{

    public ferrari(int velocidadeAtual, int velocidade_maxima, int delta){
        super(velocidadeAtual,velocidade_maxima,delta);
    }//minha resposta

    // // ferrari(){
    // //     this(315)
    // // }
    
    // farrari(int velocidade_maxima){
        
    //     super(velocidade_maxima);
    // }
    
    @Override
    void acelerar(){
        super.acelerar();

    }

    @Override
    public void ligarTurbo() {
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }

}