package S1;

import utils.Clavier;

public class S1Exo2 {
	public static void main(String[] args) {
		int[] entier = new int[4];
		int i = 0; 
		do {
			System.out.println("Entier n°" + (i+1));
			entier[i] = Clavier.lireInt();
			i++;
		}
		while(i < entier.length);
		System.out.println("Somme : " + (entier[0] + entier[1] + entier[2] + entier[3]));
	}
}
