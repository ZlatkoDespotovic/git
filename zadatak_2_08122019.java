package domaci_08122019;

import java.util.Scanner;

public class zadatak_2_08122019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Program racuna sumu parnih brojeva i proizvod neparnih brojeva od 0 do n:");
		int izborbroja;
		int s=0;
		int p=1;
		int br=0;
		izborbroja=sc.nextInt();
		while (br<izborbroja) {
			br=br+1;
			if (br%2==0) {
				s=s+br;
			} 
			else {
				p=p*br;
			}
		}
		System.out.println("Suma parnih brojeva:" + s);
		System.out.println("Proizvod neparnih brojeva:" + p);
		
	
	}

}
