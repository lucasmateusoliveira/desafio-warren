import java.util.ArrayList;


public class Questao1 {
	
	static ArrayList<Integer> verificacao = new ArrayList<>();
	
	public static void main(String[] args) {
        
		int i=12;
        int numReverso =0;
        int somar=0;
        
		while(i<1000000) {
			
			numReverso= numeroReverso(i);
			somar= i+ numReverso;
			
			if(verificacao.get(0) != 0 && verificacao.get(verificacao.size() - 1) != 0) {
			
				if(somar%2 != 0) {
					
					System.out.println("Numero: " + i+ " + " + numReverso + " = " + somar);
				}
			
			}
			verificacao.clear();
			i++;
		}
			
		
		
	}
	
	public static int numeroReverso(int num) {

		int reverso = 0;
		while (num > 0) {
			int n = num % 10;
			reverso = (reverso * 10) + n;
			num /= 10;
			verificacao.add(n);
		}
		return reverso;
	}
}



