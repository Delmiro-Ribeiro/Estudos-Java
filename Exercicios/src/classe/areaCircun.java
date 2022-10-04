package classe;

public class areaCircun {
    double raio;
    static final double PI = 3.1415;
    //criado uma constante de classe na qual não precisa acessar atraves de um contrutor.(usando a palavra STATIC)

    areaCircun(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return PI * Math.pow(raio, 2);
    }
    //criado um método de classe usando a STATIC 
    static double area(double raio){
        return PI * Math.pow(raio, 2);
        
    }
}
