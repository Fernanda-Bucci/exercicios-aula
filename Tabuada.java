//Elabore um programa em java para fazer a tabuada de um numero fornecido pelo usuário, 
//variando de 0 a 12 e mostre o resultado de cada iteração. 

package br.com.fiap.exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner (System.in);
		
	//SOLICITA AO USUARIO O NUMERO PARA O QUAL DESEJA A TABUADA
	System.out.println("Digite um número para a tabuada: ");
		int numero = Scanner.nextInt();
		
	//LOOP PARA SOLICITAR O NUMERO DE 0 A 12
		for (int i=0; i<=12; i++) {
			int resultado = numero * i ;
			System.out.println(numero + "x" + i + "=" + resultado);
		}
		Scanner.close();
	}

}
