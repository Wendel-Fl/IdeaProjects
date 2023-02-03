package states;

import org.example.model.Porta;

public class PortaTrancada implements PortaStates{
    @Override
    public void abrir(Porta p) {
        System.out.println("Estou trancada, preciso ser destrancada primeiro!");
    }

    @Override
    public void fechar(Porta p) {
        System.out.println("Estou trancada, não posso ser fechada!");
    }

    @Override
    public void trancar(Porta p) {
        System.out.println("Já estou trancada!");
    }

    @Override
    public void destrancar(Porta p) {
        p.setEstado(new PortaFechada());
        System.out.println("Porta destrancada!");
    }
}
