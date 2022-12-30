package com.thiago.estruturadados.pilhas.tarefa;

public class Livro {
	
	private String isbn;
	private String autor;
	private int anoLancamento;
	private String nome;
	
	
	
	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", autor=" + autor + ", anoLancamento=" + anoLancamento + ", nome=" + nome + "]";
	}
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
