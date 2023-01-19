package org.test.wendel;

/*
feminino -> solteira -> 18 <= idade <= 25 -> 5%
feminino -> solteira -> 26 <= idade <= 60 -> 15%
feminino -> casada -> 18 <= idade <= 25 -> 10%
feminino -> casada -> 26 <= idade <= 60 -> 30%
masculino -> solteiro -> 18 <= idade <= 25 -> 0%
masculino -> solteiro -> 26 <= idade <= 60 -> 10
masculino -> casado -> 18 <= idade <= 25 -> 5%
masculino -> casado -> 26 <= idade <= 60 -> 20%
 */

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

public class PremioSeguroTest {
    
    PremioSeguro premioSeguro;
    Cliente cliente;
    @Before
    public void setUp() {
        premioSeguro = new PremioSeguro();
        cliente = new Cliente();
    }
    
    @Test
    public void test() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setCpf("191");
        cliente.setDataNascimento(DataUtils.StringToDate("17/06/2002"));
        cliente.setNacionalidade("Brasileira");
        premioSeguro.setCliente(cliente);
        premioSeguro.setValorSeguro(2000.00);
        premioSeguro.obtemPercentualDesconto();
        assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }
    
//    @Test
//    public void test2() {
//        cliente.setSexo("Feminino");
//        cliente.setEstadoCivil("Solteira");
//        cliente.setDataNascimento(DataUtils.StringToDate("17/06/2002"));
//        assertTrue(premioSeguro.);
//    }
}
