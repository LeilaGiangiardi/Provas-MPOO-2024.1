package app;

import model.BaseDados;
import model.CampanhaQueimaEstoque;
import model.Compra;
import model.Gerente;
import view.TelaProdutos;

public class App {
    public static void main(String[] args) {
        // Inicializar a base de dados com os produtos
        BaseDados.inicializarBase();
        new TelaProdutos();

        // Criar o gerente
        Gerente gerente = Gerente.getInstancia("Jose Santos", "111.111.111-11", 3200.50);
        System.out.println("Gerente: " + gerente.getNome());

        // Exibir todos os produtos cadastrados com detalhes
        System.out.println("\nProdutos cadastrados:");
        BaseDados.exibirDetalhesProdutos();

        // Criar uma compra (compra de 5 feijões e 10 laranjas)
        Compra compra1 = new Compra();
        compra1.adicionarProduto(BaseDados.buscarProduto("PROD001"), 1); // Feijão
        System.out.println("\nResumo da Compra 1:");
        System.out.println(compra1);
        
     // Exibir produtos após a primeira compra (para verificar o ajuste no estoque)
        System.out.println("\nProdutos após a Compra 1:");
        BaseDados.exibirDetalhesProdutos();
        
        // Criar uma compra (compra de 5 feijões e 10 laranjas)
        Compra compra2 = new Compra();
        compra2.adicionarProduto(BaseDados.buscarProduto("PROD001"), 1); // Feijão
        compra2.adicionarProduto(BaseDados.buscarProduto("PROD003"), 10); // Laranja
        System.out.println("\nResumo da Compra 2:");
        System.out.println(compra2);
        
        // Exibir produtos após a segunda compra (para verificar o ajuste no estoque)
        System.out.println("\nProdutos após a Compra 2:");
        BaseDados.exibirDetalhesProdutos();

        // Criar uma segunda compra (100 biscoitos com pedido de desconto)
        Compra compra3 = new Compra();
        compra3.adicionarProduto(BaseDados.buscarProduto("PROD002"), 100); // Biscoito Treloso
        gerente.darDesconto(compra3); // Aplicar desconto de 10%
        System.out.println("\nResumo da Compra 3 com desconto:");
        System.out.println(compra3);

        // Exibir produtos após a segunda compra (para verificar o ajuste no estoque)
        System.out.println("\nProdutos após a Compra 3:");
        BaseDados.exibirDetalhesProdutos();

        // Criar uma terceira compra (compra de 100 laranjas com desconto da campanha)
        Compra compra4 = new Compra();
        compra4.adicionarProduto(BaseDados.buscarProduto("PROD003"), 100); // Laranja
        System.out.println("\nResumo da Compra 4 com desconto de campanha:");
        System.out.println(compra4);
        
        // Exibir produtos após a terceira compra (para verificar o ajuste no estoque)
        System.out.println("\nProdutos após a Compra 4:");
        BaseDados.exibirDetalhesProdutos();
     
        // Aplicar campanha de queima de estoque (50% de desconto para produtos próximos da validade)
        System.out.println("\nAplicando campanha de queima de estoque:");
        CampanhaQueimaEstoque.aplicarCampanha();

        // Exibir produtos após aplicar a campanha de queima de estoque
        System.out.println("\nProdutos após a campanha de queima de estoque:");
        BaseDados.exibirDetalhesProdutos();

     // Criar uma terceira compra (compra de 100 Arroz Urbano com desconto da campanha)
        Compra compraBonus = new Compra();
        compraBonus.adicionarProduto(BaseDados.buscarProduto("PROD004"), 100); // Arroz Urbano
        System.out.println("\nResumo da Compra 3:");
        System.out.println(compraBonus);
        
        // Exibir produtos após a terceira compra (para verificar o ajuste no estoque)
        System.out.println("\nProdutos após a Compra (Queima de estoque):");
        BaseDados.exibirDetalhesProdutos();

        // Remover produto (removendo Feijão da Serra)
        System.out.println("\nRemovendo produto Feijão da Serra...");
        BaseDados.removerProduto("PROD001");

        // Exibir produtos após a remoção
        System.out.println("\nProdutos após remoção do Feijão da Serra:");
        BaseDados.exibirDetalhesProdutos();

        // Verificar estoque de biscoitos (ver se tem quantidade suficiente para uma nova compra)
        System.out.println("\nVerificando estoque de Biscoito Treloso para 50 unidades:");
        boolean estoqueSuficiente = BaseDados.verificarEstoque("PROD002", 50);
        System.out.println("Estoque suficiente para 50 unidades de Biscoito Treloso? " + (estoqueSuficiente ? "Sim" : "Não"));

        // Ajustar o estoque de Biscoito Treloso manualmente (simulando uma entrada de novos produtos)
    }
}
