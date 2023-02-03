package org.example;

import org.example.model.Porta;
import states.PortaAberta;
import states.PortaFechada;
import states.PortaTrancada;

public class Demo {
    public static void main(String[] args) {
        Porta p = new Porta(new PortaAberta());
        System.out.println("O Estado atual da Porta é: " + p.getEstado().getClass().getSimpleName());
        p.abrir();
        p.fechar();
        p.trancar();
        p.destrancar();

        p.setEstado(new PortaAberta());
        p.setEstado(new PortaFechada());
        System.out.println("\nO Estado atual da Porta é: " + p.getEstado().getClass().getSimpleName());
        p.abrir();
        p.fechar();
        p.trancar();
        p.destrancar();

        p.setEstado(new PortaAberta());
        p.setEstado(new PortaTrancada());
        System.out.println("\nO Estado atual da Porta é: " + p.getEstado().getClass().getSimpleName());
        p.abrir();
        p.fechar();
        p.trancar();
        p.destrancar();

    }
}