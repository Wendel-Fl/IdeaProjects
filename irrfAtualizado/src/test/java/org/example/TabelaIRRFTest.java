package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TabelaIRRFTest {

    @Test
    public void testExemplo(){
        double irrf = TabelaIRRF.calcularIRRF(12997.45,3).doubleValue();
        BigDecimal resultadoObtido = new BigDecimal(irrf).setScale(2, RoundingMode.HALF_UP);
        BigDecimal resultadoEsperado = new BigDecimal(2191.10).setScale(2,RoundingMode.HALF_UP);
        assertEquals(resultadoObtido,resultadoEsperado);
    }
}
