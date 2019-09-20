package domaci_08132019;

import java.util.Scanner;

public class zadatak_2_a_08132019 {

	public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("Zbir brojeva od 1 do 5:");
			int a=5;
			int b=1;
			int sum=0;
			while (b<=a) {
				sum=sum+b; 
				b++;
			}
			System.out.println("Zbir je:" + sum);

	}

}
