package br.com.fiap.exercicios;

public class ManipulacaoDeString {

	public static void main(String[] args) {

		String palavra = "Bananada";
		
	// imprima "Ana" usando substring;
		String resultadoSubstring = palavra.substring(1,4);
		System.out.println("Resultado da substring: " + resultadoSubstring);

	// Substitua "BANANADA" por "BANDA" usando método replace;
		String novaPalavra = palavra.replace("bananada", "banda");
		System.out.println("Resultado da substituição: " + novaPalavra);

	// Indicar as posições de todos os "A"s na palavra;
		System.out.println("Indicar as posições de todos os 'A's na palavra: ");
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == 'a') {
				System.out.println(i + " ");
			}
		}
	}

}
