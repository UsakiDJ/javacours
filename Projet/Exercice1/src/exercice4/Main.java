package exercice4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		int nombre = input.nextInt();
		input.close();
		System.out.println(nombre);
		String binaire= Integer.toBinaryString(nombre);
		String hex = Integer.toHexString(nombre);
		String oct = Integer.toOctalString(nombre);
		System.out.println("Binaire = "+binaire);
		System.out.println("Hexa = " + hex);
		System.out.println("Octal = "+ oct);
		

	}

}
