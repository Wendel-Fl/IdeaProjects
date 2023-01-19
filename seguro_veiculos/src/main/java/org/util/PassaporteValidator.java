package org.util;

import org.excecoes.PassaporteInvalidoException;
import org.model.Cliente;

import java.util.Arrays;
import java.util.List;

public class PassaporteValidator {
    public static Boolean validaPassaporte(String passaporte){
        boolean result = false;
        if(passaporte != null)
            result = true;
        else
            throw new PassaporteInvalidoException("Passaporte Inválido!");
        return result;
    }
}
