package domaci_08232019;

import java.util.Scanner;

public class zadatak_1_08232019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi n:");
		int n=sc.nextInt();
		System.out.println("Inverzni broj je:" +obrnuti(n));

	}
	public static int obrnuti(int n) {
		int inverzni=0;
				while (n!=0) {
					 inverzni=inverzni*10+n%10;
					n=n/10;
				}
				return inverzni;

    }
	
}
