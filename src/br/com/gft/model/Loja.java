package br.com.gft.model;

import java.util.List;

public class Loja {
	String nome;
	String cnpj;
	List<Livro> livro;
	List<VideoGame> videogame;

	public Loja(String nome, String cnpj, List<Livro> livro, List<VideoGame> videogame, double patrimoniototal) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livro = livro;
		this.videogame = videogame;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

	public List<VideoGame> getVideogame() {
		return videogame;
	}

	public void setVideogame(List<VideoGame> videogame) {
		this.videogame = videogame;
	}

	public double patrimoniototal1 = 0;
	public double patrimoniototal2 = 0;

	public void videogame() {
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Jogos disponiveis nas lojas americanas:");
		if (livro.size() == 0) {
			System.out.println("A loja não tem jogos disponiveis no estoque");
		}

		for (int i = 0; i < videogame.size(); i++) {
			System.out.println("\t VideoGame: " + videogame.get(i).getNome()+ ", preço: R$" + videogame.get(i).getPreco() + " e "
					+ videogame.get(i).getQtd()+ " produtos em estoque");

		}
	}

	public void livro() {

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Livros disponiveis nas lojas americanas:");
		if (livro.size() == 0) {
			System.out.println("A loja não tem livro disponiveis  no estoque");
		}
		for (int i = 0; i < livro.size(); i++) {
			System.out.println("\t Titulo: " + livro.get(i).getNome() + ", preço: R$" + livro.get(i).getPreco() + " e "
					+ livro.get(i).getQtd() + " produtos em estoque");

		}
	}

	public double calculapatrimonio() {

		
		double result= 0;
		double result1= 0;
		
		for (int i = 0; i < livro.size(); i++) {
			result += (int) videogame.get(i).getPreco() * videogame.get(i).getQtd();
		}
		for (int i = 0; i < livro.size(); i++) {
			result1 += (int) livro.get(i).getPreco() * livro.get(i).getQtd();
		}
		
		System.out.println("Total de patrimonio: R$" + (result + result1));
		return result + result1; 
		
	}
}
