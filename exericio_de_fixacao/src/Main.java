//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.printf("Products: %n" +
                "%s, which price is $ %.2f%n" +
                "%s, which price is $ %.2f%n", product1, price1, product2, price2);
        System.out.println("...");
        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.println("...");
        System.out.printf("%s with eight decimal places: %.8f%n" +
                "Rounded (three decimal places): %.3f%n" +
                "US decimal point: %.3f%n", "Measure", measure, measure, measure);
    }
}