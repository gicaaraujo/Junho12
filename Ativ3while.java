package Junho12;

import java.util.Scanner;

public class Ativ3while {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		String nome;
		int repeticao=0;

		System.out.println("Informe o nome: ");
		nome = ler.next();

		while(repeticao <= 10) {
			repeticao ++;
			System.out.println("O nome é: " + nome);
		}}}