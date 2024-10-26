package model;

import java.util.ArrayList;
import java.util.Date;

public class BaseDados {

	private static ArrayList<Produto> produtos;

	public static void createBase() {
		produtos = new ArrayList<Produto>();
	}

	public static void inicializarBase() {
		
		produtos.add(new Produto("PROD001","Feijão da Serra", 9,00, new Date(12/10/2022), false));
		
	}

	private static Produto buscarProduto(Produto produto) {
		for (Produto produtoCurrent : produtos) {
			if (produtoCurrent.getCodBarras().equalsIgnoreCase(produtoCurrent.codBarras)) {
				return (Produto) produtoCurrent;
			}

		}
		return null;
	}

	public static boolean isProduto(String codBarras) {
//		if (buscarProduto(produto) =! null)
		
//		(buscarProduto(new Produto(null, null, 0, null, false))
		
		return true;	
		}
	
	public static String addProduto(Produto produto) {
		if(buscarProduto(produto).equals(produto)) {
			return ("Produto já cadastrado!");
		}
		else{ 
			produtos.add(produto);
			return ("Produto cadastrado com sucesso!");
		}
		
	}
	
	public static boolean removerProduto(Produto produto) {
		if(buscarProduto(produto).equals(produto)) {
			produtos.remove(produto);
		}
		return false;
	}

	
	public static ArrayList<String> exibirProduto(){
		System.out.println("Exibir produtos cadastrados");
		for (Produto produtoCurrent: produtos) {
			System.out.println(produtoCurrent.getNome());
		}
		return null;
}
	}


