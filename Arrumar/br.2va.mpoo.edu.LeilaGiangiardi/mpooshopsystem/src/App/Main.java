package App;

import Model.BaseDados;
import Model.CPFException;
import Model.CadastroExcepion;
import Model.ClienteException;
import Model.CupomEsgotadoException;
import View.TelaAbertura;

public class Main {

    public static void main(String[] args) throws CadastroExcepion, CPFException, ClienteException, CupomEsgotadoException {
        
        BaseDados.inicializarBase();
        TelaAbertura telaAbertura = new TelaAbertura();
        telaAbertura.setVisible(true);
    }
}
