package org.test.gilmar;

import org.excecoes.EstadoCivilInvalidoException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.util.EstadoCivilValidator;

public class EstadoCivilTest {

    //validação 1
    @Test(expected = EstadoCivilInvalidoException.class)
    public void validaEstadoCivil(){
        assertTrue(EstadoCivilValidator.validaEstadoCivil("CasadA"));
    }
}
