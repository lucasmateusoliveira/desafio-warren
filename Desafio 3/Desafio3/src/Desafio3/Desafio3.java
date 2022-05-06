package Desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner leitor= new Scanner (System.in);
		int numero=0, elementoLista=0;
	
		System.out.println("Qual o valor de Numero?");
		numero= leitor.nextInt();
		
		System.out.println("Quantos Elementos tem a lista?");
		elementoLista= leitor.nextInt();
		for(int cont=0; cont<elementoLista; cont++) {
			
			System.out.println("Digite o Número:");
			lista.add(leitor.nextInt());
		}
		
		
		CombinacaoController controller= new CombinacaoController();
		
		ArrayList<ArrayList<Integer>> resposta = new ArrayList<ArrayList<Integer>>();
		resposta = controller.elementos(lista, numero);

		
		if (resposta.isEmpty()) {
			System.out.println("Nenhuma Combinação Encontrada!");
			return;
		}
		int menor= resposta.get(0).size();

		for (int cont = 0; cont < resposta.size(); cont++) {
 
			
			if (resposta.get(cont).size() < menor) {
			
				menor= resposta.get(cont).size();
			}

		}
		
		for (int cont = 0; cont < resposta.size(); cont++) {

			if (resposta.get(cont).size() == menor) {
				System.out.println(resposta.get(cont));

			}

		}
	
	}

}
