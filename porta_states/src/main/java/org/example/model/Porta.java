package org.example.model;

import states.PortaAberta;
import states.PortaStates;

public class Porta {
    private PortaStates estado;

    public Porta(PortaStates states){
        if(!(states instanceof PortaAberta)){
            System.out.println("Estado inicial inválido");
        }else {
            this.estado = states;
        }
    }

    public PortaStates getEstado(){
        return this.estado;
    }

    public void setEstado(PortaStates estado){
        this.estado = estado;
    }
    public void abrir(){
        this.estado.abrir(this);
    }

    public void fechar(){
        this.estado.fechar(this);
    }

    public void trancar(){
        this.estado.trancar(this);
    }

    public void destrancar(){
        this.estado.destrancar(this);
    }
}
