package domaci_08162019;

import java.util.Scanner;

public class zadatak_2_08162019 {
	// Izracunati sumu prirodnih brojeva u intervalu od 1 do n 
	//koji su djeljivi sa 3.
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
        System.out.println("Unesi N:");
        int n=sc.nextInt();
        int i, sum=0;
        for (i = 1; i <= n; i++) {
            if (i % 3 == 0)
                sum=sum+i;
        }
        System.out.println("suma je:" + sum);
    }


	}


