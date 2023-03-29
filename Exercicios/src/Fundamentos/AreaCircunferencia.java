package Fundamentos;

import java.util.Scanner;

public class AreaCircunferencia{
    public static void main(String[] args) {
        final double PI = 3.1419;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();


        double area = PI * raio * raio;
        System.out.println(area);


        //mudando o valor do raio

        raio = 10;
        area = PI * area * area;
        System.out.printf("Área = %.2f m2",area);

        sc.close();
    }
}