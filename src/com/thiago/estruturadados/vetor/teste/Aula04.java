package com.thiago.estruturadados.vetor.teste;

import com.thiago.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1");

		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
	}

}