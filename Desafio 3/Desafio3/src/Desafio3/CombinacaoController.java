package Desafio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CombinacaoController {

	
	public static void verifica(ArrayList<Integer> lista, int numero, 
            ArrayList<ArrayList<Integer>> resposta, 
            ArrayList<Integer> auxiliar, int cont) 
    { 
     
      if (numero < 0) { 
        return; 
      }
     
      if (numero == 0) 
      { 
        resposta.add(new ArrayList<Integer>(auxiliar)); 
        return; 
      } 
    
      while (cont < lista.size() && numero-lista.get(cont) >= 0) 
      { 
        auxiliar.add(lista.get(cont)); 
    
        verifica(lista, numero - lista.get(cont), resposta, auxiliar, cont);
       
        cont++; 
    
       
        auxiliar.remove(auxiliar.size()-1); 
      } 
    } 
	
	public static ArrayList<ArrayList<Integer>> elementos(ArrayList<Integer> lista, int numero) {
		
		Collections.sort(lista);

	
		ArrayList<Integer> listaAux = new ArrayList<Integer>();

		HashSet<Integer> analise = new HashSet<Integer>();
		for (int i = 0; i < lista.size(); i++) {
			if (analise.contains(lista.get(i)) == false) {
				analise.add(lista.get(i));
				listaAux.add(lista.get(i));
			}
		}

		lista = listaAux;

		ArrayList<Integer> auxiliar = new ArrayList<Integer>();

		ArrayList<ArrayList<Integer>> resposta = new ArrayList<ArrayList<Integer>>();
		verifica(lista, numero, resposta, auxiliar, 0);

		return resposta;
	}
}
