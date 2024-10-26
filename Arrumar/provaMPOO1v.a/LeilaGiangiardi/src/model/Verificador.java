package model;

import java.util.Calendar;
import java.util.Date;

public interface Verificador {
	public static boolean verificarVencimento(Date validadeProduto) {
	
	Date dateAtual = new Date(System.currentTimeMillis());
	Calendar calB = Calendar.getInstance();
	calB.setTime(dateAtual);
	dateAtual = calB.getTime();
	if(Produto.getValidade().before(dateAtual))
		return true;
	return false;
	}		
}
