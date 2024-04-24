package br.com.fiap.exercicios;

import java.util.HashSet;

public class PalavrasDistintas {

	public static void main(String[] args) {
	String texto = "eu sou mais eu enquanto sou eu";
	
	//remova o ponto final e divida o texto em palavras usando espaços em branco como delimitadores 
	String [] palavras = texto.replace("\\.", "").split(" ");
	
	//Crie um HashSet para armazenar as palavras distindas;
	HashSet<String> palavrasDistintas = new HashSet<>();
	
	//Adicione as palavras ao HashSet;
	for (String palavra : palavras) {
		palavrasDistintas.add(palavra);
	}
	
	//imprime palavras distintas;
	System.out.println("Palavras distintas no texto: ");
	for (String palavra : palavrasDistintas) {
		System.out.println(palavra);
	}
	
	

	}

}
