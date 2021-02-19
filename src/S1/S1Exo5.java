package S1;

import utils.Clavier;

public class S1Exo5 {
	public static void main(String[] args) {
		String text = Clavier.lireString(); 
		//String text = "Hello World" + "\n" + "Welcome to my app" + "\n";
        int countChar = 0;
        int countLine = 0;
        int countWord = 0;
          
        for(int i = 0; i < text.length(); i++) {  
            if(text.charAt(i) != ' ' && text.charAt(i) != '\n')  
                countChar++;  
            else if(text.charAt(i) == '\n') {
            	countLine++;
            }
            else {
            	countWord = text.trim().split(" |\n").length;
            }
        }  
        System.out.println("Nb lignes : " + countLine + "\n" + "Nb mots : " + countWord + "\n" + "Nb caractère : " + countChar);
	}
}
