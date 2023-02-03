package states;

import org.example.model.Porta;

public class PortaFechada implements PortaStates{
    @Override
    public void abrir(Porta p) {
        p.setEstado(new PortaAberta());
        System.out.println("Porta aberta!");
    }

    @Override
    public void fechar(Porta p) {
        System.out.println("Já estou fechada!");
    }

    @Override
    public void trancar(Porta p) {
        p.setEstado(new PortaTrancada());
        System.out.println("Porta Trancada!");
    }

    @Override
    public void destrancar(Porta p) {
        System.out.println("Estou apenas fechada, não trancada!");
    }
}
