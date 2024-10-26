package Model;

public class Cupom {
    private String codigo;
    private double valor;
    private Cliente cliente;
    private static int cuponsDisponiveis = 3;

    public Cupom(String codigo) {
        this.codigo = codigo;
        this.valor = 50.0; 
    }

    public Cupom(Cliente cliente) {
        this.cliente = cliente;
        this.codigo = "Desconhecido";
        this.valor = 50.0; 
    }

    public Cupom(String codigo, Cliente cliente) {
        this.codigo = codigo;
        this.valor = 50.0; 
        this.cliente = cliente;
    }

  
    public static boolean verificarDisponibilidade() {
        return cuponsDisponiveis > 0;
    }

    public static boolean usarCupom() {
        if (verificarDisponibilidade()) {
            cuponsDisponiveis--;
            return true;
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Desconto: " + valor + "%, Cliente: " + (cliente != null ? cliente.getNome() : "Nenhum");
    }
}
