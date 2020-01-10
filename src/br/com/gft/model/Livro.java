package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	String autor;
	String tema;
	int qtdPag;

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaimposto() {
		if (tema == "educativo") {
			System.out.println("Livro educativo não tem imposto: " + nome);
		return (0);
		}
		else {
			System.out.println("R$ " +  preco*0.10  + " sobre o livro " + nome);
			return (preco*0.10);
		}
	}


}


