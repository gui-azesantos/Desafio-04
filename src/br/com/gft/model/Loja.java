package br.com.gft.model;

import java.util.List;

public class Loja  {
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
		this.patrimoniototal = patrimoniototal;
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
	
	public double patrimoniototal = 0; 
	
	public void videogame() {
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Jogos disponiveis nas lojas americanas:");
		if (livro.size() == 0) {
			System.out.println("A loja não tem jogos disponiveis no estoque");
		}
		
		for (int i = 0; i < videogame.size(); i++) {
			System.out.println("\t VideoGame: " + videogame.get(i).nome + ", preço: R$" + videogame.get(i).preco + " e "
					+ videogame.get(i).qtd + " produtos em estoque");
					 patrimoniototal += (videogame.get(i).preco * videogame.get(i).qtd);
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
			System.out.println("\t Titulo: " + livro.get(i).nome + ", preço: R$" + livro.get(i).preco + " e "
					+ livro.get(i).qtd + " produtos em estoque");
					 patrimoniototal += (livro.get(i).preco * livro.get(i).qtd);
		}
	}

	public double calculapatrimonio() {
		
		System.out.println("Patrimonio Total:" +patrimoniototal);
		return 0; 
	}

}
