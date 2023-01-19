package org.test.gilmar;

import org.excecoes.DataInvalidaException;
import org.junit.Test;
import org.util.DataUtils;

import static org.junit.Assert.*;

public class DataTest {
    //validar uma data com um dia inválido
    @Test
    public void validaDiaInvalido(){
        try{
            DataUtils.validaData("31/06/2022");
        }catch (DataInvalidaException die){
            assertTrue(die != null);
        }
    }

    @Test
    public void validaDiaInvalido1(){
        try{
            DataUtils.validaData("31/06/2022");
        }catch (DataInvalidaException die){
            assertTrue(die instanceof DataInvalidaException);
        }
    }

    @Test(expected = DataInvalidaException.class)
    public void validaDiaInvalido2(){
        DataUtils.validaData("31/06/2022");
    }
    //validar uma data com um mês inválido
    @Test(expected = DataInvalidaException.class)
    public void validaMesInvalido(){
        DataUtils.validaData("31/13/2022");
    }
    //validar uma data com um ano inválido
    @Test(expected = DataInvalidaException.class)
    public void validaAnoInvalido(){
        DataUtils.validaData("31/05/1899");
    }

    //validar uma data válida
    @Test
    public void validaDataValida(){
        assertTrue(DataUtils.validaData("25/06/2022"));
    }
}
