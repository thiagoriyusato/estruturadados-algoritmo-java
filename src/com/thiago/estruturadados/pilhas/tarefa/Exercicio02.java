package com.thiago.estruturadados.pilhas.tarefa;

import java.util.Scanner;

import com.thiago.estruturadados.pilhas.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);

		for (int i=1; i<=10; i++){
			
			System.out.println("Entre com um número: ");

			int num = scan.nextInt();

			if (num == 0){

				//pilha par

				Integer desempilhado = par.desempilha();

				if (desempilhado == null){
					System.out.println("Pilha par vazia");
				} else {
					System.out.println("Desempilhando da pilha par: " + desempilhado);
				}

				//pilha impar

				desempilhado = impar.desempilha();

				if (desempilhado == null){
					System.out.println("Pilha impar vazia");
				} else {
					System.out.println("Desempilhando da pilha impar: " + desempilhado);
				}


			} else if (verificaNum(num)){
				System.out.println("Número par, empilhando na pilha par: " + num);
				par.empilha(num);
			} else {
				System.out.println("Número ímpar, empilhando na pilha ímpar: " + num);
				impar.empilha(num);
			}
		}

		System.out.println("Desempilhando todos os números da pilhar par");

		while (!par.estaVazia()){
			System.out.println("Desempilhando da pilha par: " + par.desempilha());
		}

		System.out.println("Desempilhando todos os números da pilhar ímpar");

		while (!impar.estaVazia()){
			System.out.println("Desempilhando da pilha impar: " + impar.desempilha());
		}

	}
	
	public static boolean verificaNum(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}


}