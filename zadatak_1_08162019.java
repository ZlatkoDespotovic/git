package domaci_08162019;

import java.util.Scanner;

public class zadatak_1_08162019 {

	public static void main(String[] args) {
		//Napisati program koji ce proveriti da li je upisani broj pozitivan, 
		//negativan ili nula i da to ispise.
			Scanner sc=new Scanner (System.in);
			System.out.println("Unesi broj: ");
			int a=sc.nextInt();
			if (a>0)
				System.out.println("Broj je pozitivan");
			else 
				if (a < 0)
					System.out.println("Broj je negativan");
				else 
					System.out.println("Broj je nula");
		}

	}


