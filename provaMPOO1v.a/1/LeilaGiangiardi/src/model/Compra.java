package model;

import java.util.ArrayList;

public class Compra {
	public int id;
	private double valor;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	
	public Compra(int id, double valor, ArrayList<Produto> produtos) {
		this.id = id;
		this.valor = valor;
		this.produtos = produtos;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public ArrayList<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	

}
