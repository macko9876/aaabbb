import java.util.Scanner;
public class Proogram{

	public static void main(String[] args){
	int suma;
	Scanner input = new Scanner(System.in);
	System.out.println("Wpisz liczbę ");

	int x = input.nextInt();
	suma = 0;
	while (x != 0){
	suma += x%10;
	x /= 10;
	}
	System.out.println("Suma to " + suma);
	}
}