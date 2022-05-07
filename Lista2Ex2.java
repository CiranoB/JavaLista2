package Familia52;

import java.util.Scanner;

public class Lista2Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias, totaldias;
		System.out.println("\nInsira sua idade em dias: ");
		totaldias = leia.nextInt();
		anos = totaldias/365;
		meses = (totaldias%365)/30;
		dias = ((totaldias%365)%30);
		System.out.println("\nA parcela em anos: "+anos);
		System.out.println("\nA parcela em meses: "+meses);
		System.out.println("\nA parcela em dias: "+dias);

	}

}
