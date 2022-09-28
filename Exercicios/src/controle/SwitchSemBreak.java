package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        int idade = 5;

        switch(idade){//pega-se um valor e escolha um caso para ser executado.
            case 1:
                System.out.println("Olá mundo!");
                break;//para a execução e sai do switch
            case 2:
            case 7:// case pode ser organizado dessa orma tambem
                System.out.println("Vamo que vamo");
                break;
            case 3: case 5://o case pode ser organizado dessa maneira tambem
                System.out.println("Agor sim"); 
                break; 

                
        }
    }
}
