package Desafio2;

import java.util.Scanner;
import java.util.ArrayList;

public class Desafio2 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int x = 0, totalAlunos = 0, atraso=0;
		ArrayList<Integer> listaHorario = new ArrayList<Integer>();

		System.out.println("Qual a qual a quantidade minima de Alunos? ");
		x = leitor.nextInt();
		System.out.println("Qual o total de alunos?");
		totalAlunos = leitor.nextInt();

		for (int cont = 0; cont < totalAlunos; cont++) {

			System.out.println("Tempo de chegada do " + (cont + 1) + "°:");
			listaHorario.add(leitor.nextInt());
		}
		
		for (int cont = 0; cont < listaHorario.size(); cont++) {

			if(listaHorario.get(cont)>0) {
				
				atraso++;
				}

		}
		if (atraso > x) {
			System.out.println("Aula Cancelada!");
		} else {
			System.out.println("Aula Normal!");
		}
	}

}
