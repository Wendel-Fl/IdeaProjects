package states;

import org.example.model.Porta;

public class PortaAberta implements PortaStates {
    @Override
    public void abrir(Porta p) {
        System.out.println("Já estou aberta!");
    }

    @Override
    public void fechar(Porta p) {
        p.setEstado(new PortaFechada());
        System.out.println("Porta Fechada!");
    }

    @Override
    public void trancar(Porta p) {
        System.out.println("Nao posso ser trancada, pois estou aberta!");
    }

    @Override
    public void destrancar(Porta p) {
        System.out.println("Estou aberta, não trancada!");
    }
}
