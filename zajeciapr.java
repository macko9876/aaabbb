import java.util.Scanner;
public class zajeciapr{

	public static void main(String[] args){

	byte x = 1;
	short y = 15000;
	int z = 100500;
	long w1 = 90003000;
	long w2 = 90003000L;

	boolean yes = true;
	char j = 'J';
	
	int age = 40;
	if (age >= 25){
	String message = "25 years or older";
	}
        System.out.println(message);


	int suma;
	Scanner input = new Scanner(System.in);
	System.out.println("Wpisz liczbę ");

	int x11 = input.nextInt();
	suma = 0;
	while (x11 != 0){
	suma += x11%10;
	x11 /= 10;
	}
	System.out.println("Suma to " + suma);
	}
}
