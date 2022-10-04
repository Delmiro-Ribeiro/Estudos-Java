package classe;

public class areaCircunTeste {
    public static void main(String[] args) {
        areaCircun area1 = new areaCircun(10);
        //area1 Posso tambem passar o valor dentro da estancia 
        // area1.raio = 10;Exemplo

        System.out.println(area1.area());

        System.out.println(areaCircun.area(100));
        System.out.println(areaCircun.PI);
        System.out.println(Math.PI);
    }
}
