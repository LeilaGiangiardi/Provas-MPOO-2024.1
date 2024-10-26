package model;

public class Gerente extends Funcionario{
	
	private static double SALARIO = 3200.50;

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.SALARIO = salario;
	}


	public double getSalario() {
		return SALARIO;
	}

//	@Override
//	public void calcularSalario() {
//	}

	public double darDesconto(Double valor, Double desconto) {
		if (valor > 100) {
			return (desconto = valor*0.10);
		}
		
		else {
//			 return ("Desconto não permitido");
		}
		return desconto;
	}


	@Override
	public String toString() {
		return "Gerente [Salario()=" + getSalario() + super.toString() + "]";
	}
	
		
	}
	