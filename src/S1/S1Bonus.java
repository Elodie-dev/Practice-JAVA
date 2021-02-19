package S1;

import utils.Clavier;

public class S1Bonus {
	public static void main(String[] args) {
		String end = null;
		do {
			System.out.println("Start the program ? (Y/N)");
			end = Clavier.lireString();
			
			switch(end) {
			case "Y":
				tryCatch();
				break;
			case "N":
				System.out.println("B-Bye !!!");
				break;
			default: 
				System.out.println("Please enter Y or N ");
			}	
		} while (end != "N");
	}
	
	
	public static void tryCatch () {
		try {
			System.out.println("Help on Program:" + "\n" + "1.if" + "\n" + "2.switch" + "\n" + "3.for" + "\n" + "4.while" + "\n" + "5.do while" + "\n" + "\n" + "Choose one :");
			int choice = Clavier.lireInt();
			
			switch(choice) {
			case 1:
				System.out.println("The if:\nif(condition)\n{\n Statement\n}\nelse\n Statement");
				break;
			case 2:
				System.out.println("the switch:\nswitch(expression) {\n case x:\n  //code block\n  break;\n case y:\n  //code block\n  break;\n default:\n  //code block\n}");
				break;
			case 3:
				System.out.println("The for:\nfor(statement 1; statement 2; statement 3 {\r // code bolock to be executed\n}");
				break;
			case 4:
				System.out.println("The while:\nwhile(boolean) {\r //code block\n}");
				break;
			case 5:
				System.out.println("The do while:\ndo{\r//code block\n} while (boolean)");
				break;
			default:
				System.out.print("Please choose from 1 to 5");
				break;
			}
		} catch (Exception e) {
			System.out.println("Please enter a number");
		}
	}
}
