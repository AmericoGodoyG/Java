//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Boa prática:
            Sempre indique o tipo do número, se a
            expressão for de ponto flutuante (não inteira)

            Para double use: .0
            Para float use: f
        */

        double a;
        int b;

        a = 5.0;
        b = (int)a; // Casting: conversão explicita

        System.out.println(b);
    }
}