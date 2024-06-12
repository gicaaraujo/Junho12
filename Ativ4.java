package Junho12;

import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int a[] = new int [10], numero, soma=0;

		for(int i=0; i <= 9; i++) {
			System.out.println("Informe um número: " +i );
			a[i] = ler.nextInt();
			soma= soma+a[i];
		}
		System.out.println("O resultado da soma é: " + soma);
	}}