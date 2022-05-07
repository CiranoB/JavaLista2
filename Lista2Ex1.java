package Familia52;

import java.util.Scanner;

public class Lista2Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias, totaldias;
		System.out.println("\nInsira a parcela em anos: ");
		anos = leia.nextInt();
		System.out.println("\nInsira a parcela em meses: ");
		meses = leia.nextInt();
		System.out.println("\nInsira a parcela em dias: ");
		dias = leia.nextInt();
		totaldias = 365*anos + 30*meses + dias;
		System.out.println("\nSeu total de dias vividos é de: "+totaldias);
	}

}
