package org.test.wendel;

import org.junit.Test;
import org.junit.Before;
import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;
import static org.junit.Assert.assertTrue;

public class PremioSeguroTest {
    
    PremioSeguro premioSeguro;
    Cliente cliente;
    @Before
    public void setUp() {
        premioSeguro = new PremioSeguro();
        cliente = new Cliente();
    }
    
    @Test
    public void testFemininoSNI() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento(DataUtils.StringToDate("03/08/1998"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("91086498208");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();

        assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }
    
    @Test
    public void testFemininoSN() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento(DataUtils.StringToDate("12/12/2000"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("12345678");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();

        assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }
    
    @Test
    public void testFemininoSNS() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento(DataUtils.StringToDate("23/06/2004"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("77678743386");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();

        assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }
    
    @Test
    public void testFemininoSVI() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento(DataUtils.StringToDate("07/11/1996"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("31451544");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 15.00);
    }
    
    @Test
    public void testFemininoSV() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento(DataUtils.StringToDate("21/10/1975"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("27734425208");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 15.00);
    }
    
    @Test
    public void testFemininoSVS() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento(DataUtils.StringToDate("23/06/1962"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("34512654");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 15.00);
    }
    
    @Test
    public void testFemininoCNI() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento(DataUtils.StringToDate("25/05/1998"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("16136851814");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 10.00);
    }
    
    @Test
    public void testFemininoCN() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento(DataUtils.StringToDate("11/07/2003"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("35345898");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 10.00);
    }
    
    @Test
    public void testFemininoCNS() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento(DataUtils.StringToDate("16/07/2004"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("16136851814");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 10.00);
    }
    
    @Test
    public void testFemininoCVI() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento(DataUtils.StringToDate("25/05/1962"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("98765463");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 30.00);
    }
    
    @Test
    public void testFemininoCV() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento(DataUtils.StringToDate("09/08/1976"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("81955047529");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 30.00);
    }
    
    @Test
    public void testFemininoCVS() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento(DataUtils.StringToDate("02/04/1996"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("75643548");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 30.00);
    }
    
    @Test
    public void testMasculinoSNI() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento(DataUtils.StringToDate("15/10/2004"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("53920066987");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 0.00);
    }
    
    @Test
    public void testMasculinoSN() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento(DataUtils.StringToDate("24/07/1999"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("85465354");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 0.00);
    }
    
    @Test
    public void testMasculinoSNS() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento(DataUtils.StringToDate("17/03/1998"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("85444131102");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 0.00);
    }
    
    @Test
    public void testMasculinoSVI() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento(DataUtils.StringToDate("15/12/1996"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("654345865");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 10.00);
    }
    
    @Test
    public void testMasculinoSV() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento(DataUtils.StringToDate("07/09/1980"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("80739613502");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 10.00);
    }
    
    @Test
    public void testMasculinoSVS() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento(DataUtils.StringToDate("17/12/1962"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("35498784");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 10.00);
    }
    
    @Test
    public void testMasculinoCNI() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento(DataUtils.StringToDate("11/08/2004"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("48988627563");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }
    
    @Test
    public void testMasculinoCN() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento(DataUtils.StringToDate("25/10/1998"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("1234562");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }
    
    @Test
    public void testMasculinoCNS() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento(DataUtils.StringToDate("17/07/1998"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("73207351565");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }
    
    @Test
    public void testMasculinoCVI() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento(DataUtils.StringToDate("05/02/1996"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("325486552");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 20.00);
    }
    
    @Test
    public void testMasculinoCV() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento(DataUtils.StringToDate("19/03/1980"));
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("63766156861");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 20.00);
    }
    
    @Test
    public void testMasculinoCVS() {
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento(DataUtils.StringToDate("30/03/1962"));
        cliente.setNacionalidade("Estrangeira");
        cliente.setPassaporte("654551845");
        
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        
        assertTrue(premioSeguro.getPercentualDesconto() == 20.00);
    }
}
