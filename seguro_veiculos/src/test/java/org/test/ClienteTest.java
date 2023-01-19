package org.test;

import java.util.Date;
import org.model.Cliente;
import org.excecoes.CpfInvalidoException;
import org.excecoes.SexoInvalidoException;
import org.excecoes.DataInvalidaException;
import org.excecoes.IdadeInvalidaException;
import org.excecoes.PassaporteInvalidoException;
import org.excecoes.EstadoCivilInvalidoException;
import org.excecoes.NacionalidadeInvalidaException;
import org.junit.Test;
import org.junit.Before;
import org.util.DataUtils;
import org.util.CpfValidator;
import org.util.SexoValidator;
import org.util.PassaporteValidator;
import org.util.EstadoCivilValidator;
import org.util.NacionalidadeValidator;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClienteTest {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente();
    }
    /*Exemplo de caso de teste para capturar uma exceção, quando se passa uma
    data inválida para ser a data de nascimento do cliente.*/
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento(DataUtils.StringToDate("31/02/2000"));
    }
    
    @Test(expected = IdadeInvalidaException.class)
    public void testaIdadeInvalidaSuperior() {
        cliente.setDataNascimento(DataUtils.StringToDate("25/12/1941"));
        assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test(expected = IdadeInvalidaException.class)
    public void testaIdadeInvalidaInferior() {
        cliente.setDataNascimento(DataUtils.StringToDate("23/12/2005"));
        assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test
    public void testaIdade() {
        cliente.setDataNascimento(DataUtils.StringToDate("17/03/1990"));
        assertTrue(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalidoM() {
        cliente.setSexo("Macho");
        assertFalse(SexoValidator.validaSexo(cliente.getSexo()));
    }
    
    @Test
    public void testaSexoM() {
        cliente.setSexo("Masculino");
        assertTrue(SexoValidator.validaSexo(cliente.getSexo()));
    }

    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalidoF() {
        cliente.setSexo("Femea");
        assertFalse(SexoValidator.validaSexo(cliente.getSexo()));
    }
    
    @Test
    public void testaSexoF() {
        cliente.setSexo("Feminino");
        assertTrue(SexoValidator.validaSexo(cliente.getSexo()));
    }
    
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido() {
        cliente.setEstadoCivil("Namorado");
        assertFalse(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil()));
    }
    
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida() {
        cliente.setNacionalidade("Japonesa");
        assertFalse(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
    }
    
    @Test
    public void testaNacionalidadeBr() {
        cliente.setNacionalidade("Brasileira");
        assertTrue(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
    }
    
    @Test
    public void testaNacionalidadeEs() {
        cliente.setNacionalidade("Estrangeira");
        assertTrue(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
    }
    
    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido() {
        cliente.setCpf("12345");
        assertFalse(CpfValidator.isCPF(cliente.getCpf()));
    }
    
    @Test
    public void testaCpf() {
        cliente.setCpf("02116490405");
        assertTrue(CpfValidator.isCPF(cliente.getCpf()));
    }
    
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido() {
        cliente.setPassaporte(null);
        assertFalse(PassaporteValidator.validaPassaporte(cliente.getPassaporte()));
    }
    
    @Test
    public void testaPassaporte() {
        cliente.setPassaporte("584531518");
        assertTrue(PassaporteValidator.validaPassaporte(cliente.getPassaporte()));
    }
    
}
