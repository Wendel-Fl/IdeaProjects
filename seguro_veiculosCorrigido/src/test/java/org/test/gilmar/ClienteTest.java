package org.test.gilmar;

import org.excecoes.DataInvalidaException;
import org.excecoes.EstadoCivilInvalidoException;
import org.excecoes.IdadeInvalidaException;
import org.excecoes.NacionalidadeInvalidaException;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.model.Cliente;
import org.util.DataUtils;
import org.util.EstadoCivilValidator;
import org.util.NacionalidadeValidator;

import java.util.Date;

public class ClienteTest {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente();
    }
    //Exemplo de caso de teste para capturar uma exceção, quando se passa uma data inválida para ser a data de nascimento do cliente.
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento(DataUtils.StringToDate("31/02/2000"));
    }

    //Exemplo de Caso de Teste para capturar uma exceção quando a nacionalidade do cliente não é válida
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidade(){
        cliente.setNacionalidade("Germânica");
        assertTrue(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
    }

    //Exemplo de Caso de teste para capturar uma exceção quando o estado civil do cliente não é válido
    @Test(expected = EstadoCivilInvalidoException.class)
    public void validaEstadoCivil(){
        cliente.setEstadoCivil("Amasiado");
        assertTrue(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil()));
    }
    //Exemplo de caso de teste para validar uma estado civil inválido
    @Test()
    public void validaEstadoCivil1(){
        cliente.setEstadoCivil("Amasiado");
        try {
            assertFalse(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil()));
        }catch (EstadoCivilInvalidoException ecie){
            assertTrue(ecie != null);
        }
    }

    //Exemplo de caso de teste para validar uma estado civil válido
    @Test
    public void validaEstadoCivil2(){
        cliente.setEstadoCivil("Divorciada");
        assertTrue(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil()));
    }

    //Exemplo de caso de teste para validar a idade do cliente, acima do limite superior
    @Test(expected = IdadeInvalidaException.class)
    public void validaIdade(){
        cliente.setDataNascimento(DataUtils.StringToDate("25/12/1941"));
        assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(),new Date()));
    }
}
