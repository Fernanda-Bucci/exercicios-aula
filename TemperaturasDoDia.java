
package br.com.fiap.exercicios;

import java.util.Scanner;

public class TemperaturasDoDia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numeroDeMedicoes = 24; //24 medições, uma a cada hora.
		double[] temperaturas = new double[numeroDeMedicoes]; // vetor para armazenar as temperaturas
		
	// preenche o vetor com as temperaturas
		
		for (int i = 0; i < numeroDeMedicoes; i++) {
			System.out.println("Informe a temperatura às: " + i + "horas: ");
			temperaturas[i] = scan.nextDouble();
			
		}
		
	// calcula a temperatura média do dia
		double somaDasTemperaturas = 0.0;
		
		for (int i = 0; i < numeroDeMedicoes; i++) {
			somaDasTemperaturas += temperaturas[i];
			
		}
		
		int somaDasTemperatuas;
		double temperaturaMedia = somaDasTemperaturas / numeroDeMedicoes;
		
	// EXIBE a temperatura média do dia
		
		System.out.println("A temperatura média do dia foi: " + temperaturaMedia+ "graus Celsius");
		
		scan.close();

	}

}
