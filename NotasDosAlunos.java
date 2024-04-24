	package br.com.fiap.exercicios;
	
	import java.util.Scanner;
	
	public class NotasDosAlunos {
	
		public static void main(String[] args) {
			Scanner scann = new Scanner(System.in);
			
			int numeroDeAlunos = 20;
			int numeroDeDisciplinas = 5;
			
		// crie uma matriz para armazenar as notas
			double [][] notas = new double [numeroDeAlunos][numeroDeDisciplinas];
			
		// preencha a matriz com as notas dos alunos
			for (int aluno = 0; aluno<numeroDeAlunos; aluno++) {
				System.out.println("Digite as notas do aluno: " + (aluno+1) + ":");
				for (int disciplina = 0; disciplina < numeroDeDisciplinas; disciplina++) {
					System.out.println("Nota da disciplina:" + (disciplina+1) + ":");
					notas [aluno][disciplina] = scann.nextDouble();
						
				}
			}
			
		//exiba as notas dos alunos
			System.out.println("Notas dos alunos: ");
			for (int aluno = 0; aluno < numeroDeAlunos; aluno++) {
				System.out.println("Aluno " + (aluno+1) + ":");
				for (int disciplina = 0; disciplina < numeroDeDisciplinas; disciplina++) {
					System.out.println("Disciplina" + (disciplina+1) + ":" + notas[aluno][disciplina]);
				}
			}
			scann.close();
		}
	
	}
