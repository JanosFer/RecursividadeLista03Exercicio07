package controller;

public class SomaDigitoController {
	public SomaDigitoController() {
		super();
	}
	
	public int soma(String n, int tamanho) {
	//Condição de Parada: Se o tamanho do número chegar a 0, a função recursiva para de ser chamada e retorna 0.
	
			if(tamanho == 0) {
				return 0;
			}else {
				//Se o último caractere for '-' (no caso de um número negativo), soma-se 0 com a recursiva e diminui o tamanho do número em 1, senão, soma-se o digito atual com a recursiva e diminui o tamanho do número em 1 . 
				
				if(n.charAt(tamanho-1) == '-') {
					return 0 + soma(n, tamanho-1);
				}else {
					return Character.getNumericValue(n.charAt(tamanho-1)) + soma(n, tamanho-1);
				}
			}
	}
}
