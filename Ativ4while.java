package Junho12;

import java.util.Scanner;

public class Ativ4while {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int numero=0, soma=0;

		while(numero <= 10) {
			System.out.println("Informe um número: ");
			numero = ler.nextInt();
			numero ++;
			soma = soma + numero;
		}
		System.out.println("A soma é: " + soma);
	}}