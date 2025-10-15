import java.util.Locale;

public class Main {
    public static void main(String[] args){

        int y = 32;
        double x = 10.3584;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);  // Exibe duas casas decimais e arredonda o valor
        System.out.println("...");
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x); // Exibe quatro casas decimais

        // Concatenar elementos
        System.out.println("RESULTADO = " + x + " METROS");

        // Concaternar com printf | %f = ponto flutuante | %n = quebra de linha |
        System.out.printf("RESULTADO = %.2f METROS %n", x);

        /* Concaternar varios elementos em um mesmo comando de escrita
            %f = ponto flutuante
            %d = inteiro
            %s = textto
            %n = quebra de linha */

        String nome = "Bruna";
        int idade = 23;
        double renda = 2360;
        System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);

    }
}
