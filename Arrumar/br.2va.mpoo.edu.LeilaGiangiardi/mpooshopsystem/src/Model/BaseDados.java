package Model;

import java.util.ArrayList;
import java.util.List;

public class BaseDados {

    private static List<Cliente> clientes = new ArrayList<>();
    private static int cuponsDisponiveis = 3; 

    public static void createBase() throws CPFException, CadastroExcepion, ClienteException, CupomEsgotadoException {
        inicializarBase();
    }

    public static void inicializarBase() throws CadastroExcepion, CPFException, ClienteException, CupomEsgotadoException {
        Cliente cliente1 = new Cliente("José Alvaes", "057.267.536-40", "jose@gmail.com"); //não foi pedido no construtor de cliente o parametro telefone
        adicionarCliente(cliente1);
        adicionarCupom(cliente1);

        Cliente cliente2 = new Cliente("Cliente 2", "987.654.321-00", "email2@example.com");
        adicionarCliente(cliente2);
        adicionarCupom(cliente2);
    }

    public static Cliente buscarEmail(String email) {
        return clientes.stream().filter(c -> c.getEmail().equals(email)).findFirst().orElse(null);
    }

    public static Cliente buscarCPF(String cpf) {
        return clientes.stream().filter(c -> c.getCpf().equals(cpf)).findFirst().orElse(null);
    }

    public static boolean isCliente(Cliente cliente) {
        return clientes.stream().anyMatch(c -> c.getCpf().equals(cliente.getCpf()));
    }

    public static boolean adicionarCliente(Cliente cliente) throws CadastroExcepion {
        if (isCliente(cliente)) {
            throw new CadastroExcepion("Cliente já cadastrado!");
        }
        clientes.add(cliente);
        return true;
    }

    public static boolean adicionarCupom(Cliente cliente) throws ClienteException, CupomEsgotadoException {
        if (!isCliente(cliente)) {
            throw new ClienteException("Cliente não cadastrado!");
        }
        if (cuponsDisponiveis <= 0) {
            throw new CupomEsgotadoException("Cupons esgotados!");
        }
        cliente.setCupom(new Cupom("CUPOM50")); 
        cuponsDisponiveis--; 
        return true;
    }

	public static boolean existeClientePorEmail(String email) {
		for (Cliente cliente : clientes) {
            if (cliente.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
}
