package Junho12;

import java.util.Scanner;

public class Ativ7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade[] = new int [20], maioridade=0;

		for(int i=0; i <= 19; i++) {
			System.out.println("Informe a idade: " +i );
			idade [i] = ler.nextInt();

			if ( idade [i]>= 18) {
				maioridade ++;
			}}
		System.out.println("As pessoas meiores de idade são: " + maioridade);
	}}