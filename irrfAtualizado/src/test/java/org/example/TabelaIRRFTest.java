package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TabelaIRRFTest {
    
    @Test
    public void TesteI() {
        double irrf = TabelaIRRF.calcularIRRF(30000.00, 3).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(6399.23).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteII() {
        double irrf = TabelaIRRF.calcularIRRF(25000.00, 2).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(5213.87).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteIII() {
        double irrf = TabelaIRRF.calcularIRRF(1903.98, 0).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(0.00).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteIV() {
        double irrf = TabelaIRRF.calcularIRRF(1903.99, 0).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(0.00).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteV() {
        double irrf = TabelaIRRF.calcularIRRF(2826.65, 0).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(48.00).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteVI() {
        double irrf = TabelaIRRF.calcularIRRF(2826.66, 0).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(48.00).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteVII() {
        double irrf = TabelaIRRF.calcularIRRF(3751.05, 0).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(151.59).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteVIII() {
        double irrf = TabelaIRRF.calcularIRRF(3751.06, 0).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(151.59).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteIX() {
        double irrf = TabelaIRRF.calcularIRRF(4664.68, 0).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(308.47).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteX() {
        double irrf = TabelaIRRF.calcularIRRF(4664.69, 0).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(308.47).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXI() {
        double irrf = TabelaIRRF.calcularIRRF(10500.94, 4).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(1521.07).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXII() {
        double irrf = TabelaIRRF.calcularIRRF(38900.74, 6).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(8445.75).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXIII() {
        double irrf = TabelaIRRF.calcularIRRF(9503.88, 3).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(1326.44).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXIV() {
        double irrf = TabelaIRRF.calcularIRRF(11200.52, 5).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(1642.08).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXV() {
        double irrf = TabelaIRRF.calcularIRRF(2500.00, 0).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(25.95).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXVI() {
        double irrf = TabelaIRRF.calcularIRRF(52400.33, 8).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(11682.62).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXVII() {
        double irrf = TabelaIRRF.calcularIRRF(21300.42, 2).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(4298.22).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXVIII() {
        double irrf = TabelaIRRF.calcularIRRF(14643.12, 3).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(2598.40).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXIX() {
        double irrf = TabelaIRRF.calcularIRRF(16102.22, 7).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(2750.98).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXX() {
        double irrf = TabelaIRRF.calcularIRRF(19450.38, 4).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(3736.06).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXXI() {
        double irrf = TabelaIRRF.calcularIRRF(3471.28, 2).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(63.07).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
    
    @Test
    public void TesteXXII() {
        double irrf = TabelaIRRF.calcularIRRF(4235.74, 1).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(188.59).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
}
