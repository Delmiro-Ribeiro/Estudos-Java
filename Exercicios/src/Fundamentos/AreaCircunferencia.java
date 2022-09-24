package Fundamentos;

public class AreaCircunferencia{
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.1419;

        double area = PI * raio * raio;
        System.out.println(area);


        //mudando o valor do raio

        raio = 10;
        area = PI * area * area;
        System.out.println("Área = " + area + "m2");
    }
}