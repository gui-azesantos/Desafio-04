package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
	String marca;
	String modelo;
	boolean isUsado;

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaimposto() {
		if (isUsado = true) {
		double imposto = preco*0.25;
		System.out.println( "Imposto "+ nome + ", " + imposto);
		return (0);
			}
		else {
		double imposto = preco*0.45;
		System.out.println( "Imposto "+ nome + ", " + imposto);
		return (0);
		}
	}
}
