package domaci_08152019;

import java.util.Scanner;

public class zadatak_1_08152019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s;
		do {
			System.out.println("Izabrati broj ispred geometrijskog tela ciju povrsinu zelite da izracunate");
			System.out.println("1-P kocke");
			System.out.println("2-P kvadra");
			System.out.println("3-P valjaka");
			System.out.println("4-P lopte");
			System.out.println("0-izlaz");
			double x, y, r, h, P;
			s=sc.nextInt();
			switch (s) { 
			default:
				System.out.println("Pogresan unos");
			case 1: 
				System.out.println("Upisati vrednost za stranicu x:");
				x=sc.nextDouble();
				P=6*x*x;
				System.out.println("Povrsina kocke je:" + P);
				break;
			case 2:
				System.out.println("Upisati vrednosti za stranice x i y, kao i vrednost visine h:");
				x=sc.nextDouble();
				y=sc.nextDouble();
				h=sc.nextDouble();
				P=2*(x*y + x*h + y*h);
				System.out.println("Povrsina kvadra je:" + P);
				break;
			case 3:
				System.out.println("Upisati vrednost poluprecnika valjka:");
				r=sc.nextDouble();
				System.out.println("Upisati vrednost visine valjka:");
				h=sc.nextDouble();
				P=r*r*3.14 + 2*r*3.14*h;
				System.out.println("Povrsina valjka je:" + P);
				break;
			case 4:
				System.out.println("Upisati vrednost poluprecnika lopte:");
				r=sc.nextDouble();
				P=4*r*r*3.14;
				System.out.println("Povrsina lopte je:" + P);
				break;
			case 0:
				System.out.println("Izlaz iz programa");
				break;
			}
		} while (s!=0);
				
			}
		

	}


