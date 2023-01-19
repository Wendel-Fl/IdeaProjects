package org.util;

import org.excecoes.EstadoCivilInvalidoException;

import java.util.Arrays;
import java.util.List;

public class EstadoCivilValidator {
    public static Boolean validaEstadoCivil(String estadoCivil) {
        boolean result = false;
        List<String> estadosCivisValidos = Arrays.asList(
                "Solteiro","Solteira",
                "Casado", "Casada",
                "Viuvo", "Viuva",
                "Desquitado","Desquitada",
                "Divorciado","Divorciada");
        if (estadosCivisValidos.contains(estadoCivil))
            result = true;
        else
            throw new EstadoCivilInvalidoException("Estado Civil Inválido!");
        return result;
    }
}
