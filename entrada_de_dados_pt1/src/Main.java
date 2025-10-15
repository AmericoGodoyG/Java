import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            sc.next()
            sc.nextInt()
            sc.nextDouble() - Pega a localidade do sistema
            sc.next().charAt(0) - Pega o primeiro caractere da string */

        Locale.setDefault(Locale.US); // Usa o ponto como separador
        Scanner sc = new Scanner(System.in); // Instanciando um obj Scanner

        String x;
        int y;
        double z;

         x = sc.next();
         y = sc.nextInt();
         z = sc.nextDouble();

        /*
            *** SCANNER ***
            Quando você usa o Scanner em Java, ele lê os dados separados por espaços,
            tabs ou quebras de linha (todos são chamados de delimitadores).
            Por padrão, o Scanner usa o espaço em branco (" ", "\t", "\n") como separador.
            Ou seja, ele entende que cada valor termina quando aparece um espaço ou Enter. */

         System.out.println("Dados digitados:" );
         System.out.println(x);
         System.out.println(y);
         System.out.println(z);

         sc.close();
    }
}