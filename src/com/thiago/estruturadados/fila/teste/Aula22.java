package com.thiago.estruturadados.fila.teste;

import com.thiago.estruturadados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<>();

		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);

		System.out.println(fila);

		System.out.println(fila.desenfileira());

		System.out.println(fila);

		System.out.println(fila.desenfileira());

		System.out.println(fila);

		System.out.println(fila.desenfileira());

		System.out.println(fila);
	}

}