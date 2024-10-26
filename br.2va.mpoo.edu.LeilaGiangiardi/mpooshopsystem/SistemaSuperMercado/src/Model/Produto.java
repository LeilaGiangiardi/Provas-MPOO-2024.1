package Model;

import java.util.Date;

public class Produto {
	public String codBarras;
	private String nome;
	protected double preço;
	private Date validade;
	private boolean perecível;
	private Estoque estoque;
	
	public Produto(String codBarras, String nome, double preço, Date validade, boolean perecível, Estoque estoque) {
		this.codBarras = codBarras;
		this.nome = nome;
		this.preço = preço;
		this.validade = validade;
		this.perecível = perecível;
		this.estoque = estoque;
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

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public boolean isPerecível() {
		return perecível;
	}

	public void setPerecível(boolean perecível) {
		this.perecível = perecível;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
}
