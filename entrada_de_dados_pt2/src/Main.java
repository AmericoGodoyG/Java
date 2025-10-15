import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // sc.nextLine() - Lê um texto até a quebra de linha
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        // Leitura
        x = sc.nextInt();
        sc.nextLine(); // <-- Limpa o buffer (limpa o enter que sobrou)
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        // Saída
        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}