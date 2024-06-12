package Junho12;

import java.util.Scanner;

public class Ativ2while {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int numeros=0, soma=0;

		while(numeros <= 15) {
			soma= soma+numeros;
			numeros++;
		}
		System.out.println("O resultado da soma é: " + soma);
	}}