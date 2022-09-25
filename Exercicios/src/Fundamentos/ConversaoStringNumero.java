package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");//caixa visual para input
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        System.out.println(valor1 + " - " + valor2);

        double numero1 = Double.parseDouble(valor1);//convertendo o valor de String p/ numero com o Double.parseDouble()
        double numero2 = Double.parseDouble(valor2);//pode-se fazer isso com outros tipos int.parseInt()/long,short e etc

        double soma = numero1 + numero2 ;
        System.out.println("Soma é: " + soma);
        System.out.println("A média é: " + soma / 2);
    }
}
