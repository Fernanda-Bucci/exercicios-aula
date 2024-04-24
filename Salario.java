package br.com.fiap.exercicios;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		int quantidadePessoas = 0;
		double somaSalarios = 0.0;
		
		do {
			System.out.println("Informe o nome da pessoa: ");
			String nome = s.next();
			
			System.out.println("Informe o salário da pessoa: ");
			double salario = s.nextDouble();
			
			quantidadePessoas++;
			somaSalarios += salario;
			
			System.out.println("Deseja continuar? (s/n): ");
			String resposta = s.next();
			
			if (!resposta.equalsIgnoreCase("s")) {
				break;
		}
	
	} while(true);
		s.close();
		
		double mediaSalarios = somaSalarios / quantidadePessoas;
		
		System.out.println("Quantidade de pessoas informadas: " + quantidadePessoas);
		System.out.println("Media de Salarios: " + mediaSalarios);
}
}