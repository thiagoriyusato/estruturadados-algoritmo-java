package com.thiago.estruturadados.fila.teste;

import com.thiago.estruturadados.fila.Fila;

public class Aula19 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		System.out.println(fila.estaVazia()); //true
		System.out.println(fila.tamanho()); // 0

	}

}