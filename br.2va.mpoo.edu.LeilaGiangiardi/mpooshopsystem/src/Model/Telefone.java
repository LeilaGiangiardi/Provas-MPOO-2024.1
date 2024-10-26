package Model;

public class Telefone {
	private int ddd;
	private int ddi;
	private String numero;
	private Boolean isZap;
	
	public Telefone(int ddd, int ddi, String numero, Boolean isZap) {
		this.ddd = ddd;
		this.ddi = ddi;
		this.numero = numero;
		this.isZap = isZap;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getDdi() {
		return ddi;
	}
	public void setDdi(int ddi) {
		this.ddi = ddi;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Boolean getIsZap() {
		return isZap;
	}
	public void setIsZap(Boolean isZap) {
		this.isZap = isZap;
	} 
}

