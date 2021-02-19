package S1;

public class S1Exo3 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.println(i+"€ = " + (i/0.813F) + "$");
		}
	}
}
