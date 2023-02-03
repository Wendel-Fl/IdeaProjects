package states;

import org.example.model.Porta;

public interface PortaStates {
    void abrir(Porta p);
    void fechar(Porta p);

    void trancar(Porta p);

    void destrancar(Porta p);
}
