package Junho12;

import java.util.Scanner;

public class Ativ6while {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade, soma=0, i=0, media;

		while(i < 20) {
			i++; 
			System.out.println("Informe a idade: ");
			idade = ler.nextInt();
			soma = soma + idade;
		}
		media = (soma/20);
		System.out.println("A média das idades é: " + media);
	}}