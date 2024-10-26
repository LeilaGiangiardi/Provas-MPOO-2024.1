package model;

import java.util.Date;

public class Produto {
	public String codBarras;
	private String nome;
	private double preço;
	private static Date validade;
	private boolean perecivel;
	
	public Produto(String codBarras, String nome, double preço, Date validade, boolean perecivel) {
		super();
		this.codBarras = codBarras;
		this.nome = nome;
		this.preço = preço;
		this.validade = validade;
		this.perecivel = perecivel;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public static Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
		
	}


