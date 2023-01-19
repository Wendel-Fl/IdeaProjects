package org.test.gilmar;

import static org.junit.Assert.*;
import org.junit.Test;
import org.util.CpfValidator;
import org.util.CpfValidatorRefactored;

public class CpfTeste {
    //Testar quantidade de dígitos maior que 11
    //Testar quantidade de dígitos menor que 3
    //Testar se existe algum caracter que não seja dígito
    //Testar se todos os números são iguais
    //Testar um CPF válido
    //Testar um CPF inválido (usar um válido com algum dígito alterado)

    @Test
    public void testaCpf(){
        assertTrue(CpfValidator.isCPF("191"));
    }

    @Test
    public void testaCpf1(){
        assertTrue(CpfValidatorRefactored.isCPF("191"));
    }
}
