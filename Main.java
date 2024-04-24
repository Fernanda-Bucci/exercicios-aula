//elabore um programa para ler 20 valores inteiros fornecidos pelo usuário e calcular a soma delas.
//apresente o resultado no final.

package br.com.fiap.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//crie um objeto SCANNER para ler a opção de entrada do usuário
		Scanner sc = new Scanner(System.in);
		
		//crie uma variável para armazenar a soma
		int soma = 0;
		
		//use um loop para ler 20 valores inteiros
		
		for (int i = 1; i<=20; i++) {
			System.out.println("Digite um valor " + i + ":");
			int valor = sc.nextInt();
			soma += valor;	
		}
		
	//eche o scanner após o uso
		sc.close();

	//exibe o resultado da soma
		System.out.println("A soma dos 20 valores inteiros é: " + soma);
	}

}
