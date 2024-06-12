package Junho12;

import java.util.Scanner;

public class Ativ5while {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade, soma=0, i=0;

		while(i < 20) {
			i++; 
			System.out.println("Informe a idade: ");
			idade = ler.nextInt();
			soma = soma + idade;
		}
		System.out.println("A soma é: " + soma);
	}}