//Elabore um programa em java que calcule a sequencia de fibonacci ate o 30º termo. 
//A sequencia obedece o seguinte padrão: 1,1,2,3,5...n  

package br.com.fiap.exercicios;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 30; //o termo até o qual você deseja calcular a sequencia.
		long [] fibonacci = new long[n];
		
	// inicialize os dois primeiros termos
		fibonacci [0] = 1;
		fibonacci [1] = 1;
		
	// calcule os termos seguintes usando um loop;
		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci [i-1] + fibonacci [i-2];
	}
		
	// exiba a sequencia de Fibonacci até o 30º termo 
		System.out.println("Sequencia de Fibonacci até o 30º termo: ");
		for (int i = 0; i < n; i++) {
			System.out.println(fibonacci[i] + " ");
		}

    }
	
}
