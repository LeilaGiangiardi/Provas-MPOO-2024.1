package Model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Produto> listaProdutos;

	public static void createBase() {
		listaProdutos = new ArrayList();
	}

	public static void inicializarBase() {

	}
	public static Produto buscarProduto(String codBarras) {
		for (Produto produto : listaProdutos) {
			if (produto.getCodBarras().equals(codBarras)) {
				return produto; 
	            }
	        }
		System.out.println("Produto não encontrado!");
		return null;
	}
	 public static boolean addProduto(Produto produto){
		 if buscarProduto(codBarras).produto.get
	 }
	}
	
	


}
