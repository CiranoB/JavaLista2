package Familia52;

import java.util.Scanner;

public class Lista2Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int segundos, horas, minutos, totalsegundos;
		System.out.println("\nInsira a duração em segundos: ");
		totalsegundos = leia.nextInt();
		horas = totalsegundos/3600;
		minutos = (totalsegundos%3600)/60;
		segundos = ((totalsegundos%3600)%60);
		System.out.println("\nA parcela em horas: "+horas);
		System.out.println("\nA parcela em minutos: "+minutos);
		System.out.println("\nA parcela em segundos: "+segundos);

	}

}
