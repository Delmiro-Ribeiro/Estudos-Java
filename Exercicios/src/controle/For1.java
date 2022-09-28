package controle;

public class For1{
    public static void main(String[] args) {
        
        // for(int contador = 1; contador <= 10;contador++){
        //     System.out.printf("i = %d\n",contador);
        // }
            
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
//controle do laço sem uso de numeros
        for(String v = "#";!v.equals("#####");v += "#"){
            System.out.println(v);
        }

    }
}