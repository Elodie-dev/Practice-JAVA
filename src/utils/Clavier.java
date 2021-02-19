package utils;
import java.util.Scanner;
public class Clavier {
	public static void main(String[] args) {
		//System.out.println(lireInt());
		//System.out.println(lireFloat());
		//System.out.println(lireDouble());
		//System.out.println(lireString());
	}
	public static int lireInt() {
		Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			//scan.close();
		    return a;     
	}
	public static float lireFloat() {
		Scanner scan = new Scanner(System.in);
			float i = scan.nextFloat();
		    return i;
	}
	public static double lireDouble() {
		Scanner scan = new Scanner(System.in);
			double i = scan.nextDouble();
		    return i;
	}
	public static String lireString() {
		Scanner scan = new Scanner(System.in);
			String i = scan.nextLine();
		    return i;
	}
}
