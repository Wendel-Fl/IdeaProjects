package org.util;

import org.excecoes.SexoInvalidoException;

import java.util.Arrays;
import java.util.List;

public class SexoValidator {
    public static Boolean validaSexo(String sexo){
        boolean result;
        List<String> sexosValidos = Arrays.asList("Feminino","Masculino");
        if(sexosValidos.contains(sexo))
            result = true;
        else
            throw new SexoInvalidoException("Sexo Inválido!");
        return result;
    }
}
