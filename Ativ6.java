package Junho12;

import java.util.Scanner;

public class Ativ6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int a[] = new int [20], idade, soma=0, media;

		for(int i=0; i <= 19; i++) {
			System.out.println("Informe a idade: " +i );
			a[i] = ler.nextInt();
			soma= soma+a[i];
		}
		media = (soma/20);
		System.out.println("A média das idades são: " + media);
	}}