package br.com.fiap.exercicios;

import java.util.Scanner;

public class TemperaturasDoMes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numeroDeDias = 30;
		int numeroDeHoras = 24;
		double[][] temperaturas = new double[numeroDeDias][numeroDeHoras];

		// Preenche a matriz com as temperaturas
		
		for (int dia = 0; dia < numeroDeDias; dia++) {
			for (int hora = 0; hora < numeroDeHoras; hora++) {
				System.out.print("Informe a temperatura para o dia " + (dia + 1) + ", hora " + hora + ": ");
				temperaturas[dia][hora] = scanner.nextDouble();
			}
		}

		// Inicializa as temperaturas máxima e mínima com valores iniciais
		double temperaturaMaxima = temperaturas[0][0];
		double temperaturaMinima = temperaturas[0][0];

		// Calcula a soma de todas as temperaturas para calcular a média
		double somaDasTemperaturas = 0.0;

		// Percorre a matriz para encontrar a temperatura máxima, mínima e calcular a
		// soma
		for (int dia = 0; dia < numeroDeDias; dia++) {
			for (int hora = 0; hora < numeroDeHoras; hora++) {
				double temperaturaAtual = temperaturas[dia][hora];
				somaDasTemperaturas += temperaturaAtual;

				if (temperaturaAtual > temperaturaMaxima) {
					temperaturaMaxima = temperaturaAtual;
				}

				if (temperaturaAtual < temperaturaMinima) {
					temperaturaMinima = temperaturaAtual;
				}
			}
		}

		// Calcula a temperatura média
		double temperaturaMedia = somaDasTemperaturas / (numeroDeDias * numeroDeHoras);

		// Exibe os resultados
		System.out.println("Maior temperatura registrada: " + temperaturaMaxima);
		System.out.println("Menor temperatura registrada: " + temperaturaMinima);
		System.out.println("Temperatura média do mês: " + temperaturaMedia);

		scanner.close();

	}

}
