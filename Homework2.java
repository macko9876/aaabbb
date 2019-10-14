import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age: ");
        int x = input.nextInt();
        System.out.println("How much does the thing cost:");
        int y = input.nextInt();
        double wynik;
        if (x < 18) {
            System.out.println("Discount is 25%");
            wynik = 0.75 * y;
            System.out.println("The cost is " + wynik);
        } else if (x >= 18 && x <= 65) {
            System.out.println("Discount is 5%");
            wynik = 0.95 * y;
            System.out.println("The cost is " + wynik);
        } else if (x > 65) {
            System.out.println("Discount is 10%");
            wynik = 0.9 * y;
            System.out.println("The cost is " + wynik);
        }
    }
}
