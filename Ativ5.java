package Junho12;

import java.util.Scanner;

public class Ativ5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int a[] = new int [20], idade, soma=0;

		for(int i=0; i <= 19; i++) {
			System.out.println("Informe a idade: " +i );
			a[i] = ler.nextInt();
			soma= soma+a[i];
			System.out.println("O resultado das idades são: " + soma);
		}
	}}