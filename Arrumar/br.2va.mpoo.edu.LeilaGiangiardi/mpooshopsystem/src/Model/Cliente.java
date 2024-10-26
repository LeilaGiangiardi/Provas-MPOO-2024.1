package Model;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private Cupom cupom;
    private Telefone telefone;
	private boolean possuiCupom;

    public Cliente(String nome, String cpf, String email) throws CPFException {
        this.nome = nome;
        this.email = email;
        ValidadorCPF.validarCPF(cpf);
        this.cpf = cpf; 
        this.cupom = null; 
        this.telefone = null; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cupom getCupom() {
        return cupom;
    }

    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public boolean jaPossuiCupom() {
        return jaPossuiCupom();
    }

    public void receberCupom() {
        this.possuiCupom = true; 
    }
}
