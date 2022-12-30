package com.thiago.estruturadados.pilhas.tarefa;

import java.util.Scanner;

import com.thiago.estruturadados.pilhas.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Pilha<Integer> pilha = new Pilha<Integer>();

		for(int i = 0; i<10; i++) {
			System.out.println("Digite um número:");
			int num = scan.nextInt();
			if(verificaNum(num)) {
				System.out.println("Empilhando o número " + num);
				pilha.empilha(num);
			}
			else {

				Integer desempilhado = pilha.desempilha();

				if (desempilhado == null){
					System.out.println("Pilha está vazia");
				} else {
					System.out.println("Número ímpar, desempilhando um elemento da pilha: "
							+ desempilhado);
				}
			}
		}

		System.out.println("Todos os número foram lidos, desempilhando números da pilha");

		while (!pilha.estaVazia()){

			System.out.println("Desempilhando um elemento da pilha: "
					+ pilha.desempilha());
		}

		System.out.println("Todos os elementos foram desempilhados");

	}

	public static boolean verificaNum(int num) {
		if(num%2!=0) {
			return true;
		}
		return false;
	}

}
