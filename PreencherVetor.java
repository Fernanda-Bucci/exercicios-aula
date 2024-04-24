package br.com.fiap.exercicios;

public class PreencherVetor {

	public static void main(String[] args) {
		int tamanho = 15; //tamanho do vetor
		int[] vetor = new int[tamanho]; //crie um vetor de inteiros com 15 posições
		
		//preenche o vetor com numeros inteiros 
		
		for (int i = 0; i < tamanho; i++) {
			
			vetor [i] = i + 1; // preenche o vetor com numeros de 1 a 15
		}
		
		// apresenta os elementos do vetor 
		
		System.out.println("Elementos do Vetor: ");
		for (int i = 0; i < tamanho; i++) {
			System.out.println(vetor[i] + " ");
		}

	}

}
