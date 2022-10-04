package classe.Desafio;

public class Jantar {
    public static void main(String[] args) {
    
        Comida comida1 = new Comida("Estrogonff", 0.900);

        Comida Comida2 = new Comida("Arroz", 0.100);

        Pessoa cliente = new Pessoa("Junior", 80.5);

        System.out.println(cliente.apresentar());

        cliente.comer(comida1);
        System.out.println(cliente.apresentar());
        
        cliente.comer(Comida2);
        System.out.println(cliente.apresentar());

    }
}