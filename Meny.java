package demo0914;

import java.io.IOException;
import java.util.Scanner;

public class Meny {
	private static int val;
	public static void main(String[] args) throws NumberFormatException, IOException{
		do {
			System.out.println("[1] Val 1");
			System.out.println("[2] Val 2");
			System.out.println("[3] Val 3");
			System.out.println("[4] Val 4");
			System.out.println("Ange ett val");
			
			Scanner s = new Scanner(System.in);
			val = s.nextInt();
			
			switch (val) {
			case 1:
				System.out.println("Du har valt 1");
				break;
			case 2:
				System.out.println("Du har valt 2");
				break;
			case 3:
				System.out.println("Du har valt 3");
				break;
			case 4:
				System.out.println("Du har valt 4");
				s.close();
				break;
				
			default:
					System.out.println("Ogiltigt val!");
					System.out.println("Det här är en till ändring");
					System.out.println("Nu ändrar ja igen");
			}
		}while (val != 4);
		//Sweeet meny!
	}

}
