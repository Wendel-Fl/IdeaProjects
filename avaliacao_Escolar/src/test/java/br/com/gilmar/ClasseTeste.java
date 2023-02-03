package br.com.gilmar;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Alunos:
 * Wendel Márcio de Oliveira Filho - 202105056
 * Alexandre Wagner Cardoso Rodrigues - 202000300
 */
public class ClasseTeste {
    Avaliacao avaliacao;
    
    @Before   
    public void setUp() {
        avaliacao = new Avaliacao();
    }

    @Test(expected = ValoresInvalidosException.class)
    public void teste001() {
        double nota1 = -0.01;
        double nota2 = 10.00;
        double cargaHoraria = 32.00; 
        double faltas = 5.00;
        String resultadoEsperado = "Valores Inválidos.";
        
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, cargaHoraria, faltas));
    }
    
    @Test
    public void teste002() {
        double nota1 = -0.01;
        double nota2 = 10.00;
        double cargaHoraria = 32.00; 
        double faltas = 5.00;
        String resultadoEsperado = "Valores Inválidos.";
        try {
            assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, cargaHoraria, faltas));
        } catch (ValoresInvalidosException vis) {
            vis.printStackTrace();
        }        
    }
    
    @Test
    public void teste003() {
        double nota1 = -0.01;
        double nota2 = 10.00;
        double cargaHoraria = 32.00; 
        double faltas = 5.00;
        String resultadoEsperado = "Valores Inválidos.";
        try {
            assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, cargaHoraria, faltas));
        } catch (ValoresInvalidosException vis) {
            assertTrue(vis instanceof ValoresInvalidosException);
        }        
    }
    
    @Test
    public void teste004() {
        double nota1 = 0.01;
        double nota2 = 10.00;
        double cargaHoraria = 32.00; 
        double faltas = 5.00;
        String resultadoEsperado = "Prova Extra.";
        
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, cargaHoraria, faltas));
    }
    
    @Test
    public void teste005() {
        double nota1 = 10.00;
        double nota2 = 10.00;
        double cargaHoraria = 64.00; 
        double faltas = 15.00;
        String resultadoEsperado = "Aprovado.";
        
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, cargaHoraria, faltas));
    }
    
    @Test
    public void teste006() {
        double nota1 = 10.00;
        double nota2 = 10.00;
        double cargaHoraria = 64.00; 
        double faltas = 16.00;
        String resultadoEsperado = "Aprovado.";
        
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, cargaHoraria, faltas));
    }
    
    @Test
    public void teste007() {
        double nota1 = 10.00;
        double nota2 = 10.00;
        double cargaHoraria = 64.00; 
        double faltas = 17.00;
        String resultadoEsperado = "Reprovado por Falta.";
        
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, cargaHoraria, faltas));
    }
    
    @Test
    public void teste44() {
        double nota1 = 2.99;
        double nota2 = 2.99;
        double cargaHoraria = 128.00; 
        double faltas = 32.00;
        String resultadoEsperado = "Reprovado por Média.";
        
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, cargaHoraria, faltas));
    }

    @Test
    public void teste45() {
        double nota1 = 3.00;
        double nota2 = 3.00;
        double cargaHoraria = 128.00; 
        double faltas = 32.00;
        String resultadoEsperado = "Prova Extra.";
        
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, cargaHoraria, faltas));
    }

    @Test(expected = ValoresInvalidosException.class)
    public void primeiroValorNegativo() {
        double nota1 = -8.00;
        double nota2 = 7.00;
        double cargaHoraria = 32.00; 
        double faltas = 1.00;
        
        avaliacao.avalia(nota1, nota2, cargaHoraria, faltas);
    }

    @Test(expected = ValoresInvalidosException.class)
        public void segundoValorNegativo() {
        double nota1 = 4.50;
        double nota2 = -7.00;
        double cargaHoraria = 32.00; 
        double faltas = 2.00;
        
        avaliacao.avalia(nota1, nota2, cargaHoraria, faltas);
    }

    @Test(expected = ValoresInvalidosException.class)
        public void terceiroValorNegativo() {
        double nota1 = 4.00;
        double nota2 = 7.00;
        double cargaHoraria = -32.00; 
        double faltas = 1.00;
        
        avaliacao.avalia(nota1, nota2, cargaHoraria, faltas);
    }

    @Test(expected = ValoresInvalidosException.class)
        public void quartoValorNegativo() {
        double nota1 = 4.00;
        double nota2 = 7.00;
        double cargaHoraria = 32.00; 
        double faltas = -2.00;
        
        avaliacao.avalia(nota1, nota2, cargaHoraria, faltas);
    }

    @Test(expected = ValoresInvalidosException.class)
        public void primeiroValorAcima() {
        double nota1 = 12.00;
        double nota2 = 7.00;
        double cargaHoraria = 32.00; 
        double faltas = 1.00;
        
        avaliacao.avalia(nota1, nota2, cargaHoraria, faltas);
    }

    @Test(expected = ValoresInvalidosException.class)
        public void segundoValorAcima() {
        double nota1 = 4.00;
        double nota2 = 18.00;
        double cargaHoraria = 32.00; 
        double faltas = 3.00;
        
        avaliacao.avalia(nota1, nota2, cargaHoraria, faltas);
    }

    @Test(expected = ValoresInvalidosException.class)
        public void quartoValorAcima() {
        double nota1 = 4.00;
        double nota2 = 6.00;
        double cargaHoraria = 32.00; 
        double faltas = 45.00;
        
        avaliacao.avalia(nota1, nota2, cargaHoraria, faltas);
    }
        
    @Test
        public void testeFalta() {
        double nota1 = 7.00;
        double nota2 = 8.00;
        double cargaHoraria = 32.00; 
        double faltas = 15.00;
        
        assertTrue(avaliacao.avalia(nota1, nota2, cargaHoraria, faltas).equals("Reprovado por Falta."));
    }

    @Test
        public void testeMedia() {
        double nota1 = 2.00;
        double nota2 = 1.00;
        double cargaHoraria = 32.00; 
        double faltas = 5.00;

        assertTrue(avaliacao.avalia(nota1, nota2, cargaHoraria, faltas).equals("Reprovado por Média."));
    }
        
    @Test
        public void testeProvaExtra() {
        double nota1 = 4.00;
        double nota2 = 5.00;
        double cargaHoraria = 32.00; 
        double faltas = 1.00;
        
        assertTrue(avaliacao.avalia(nota1, nota2, cargaHoraria, faltas).equals("Prova Extra."));
    }
        
    @Test
        public void testeAprovado() {
        double nota1 = 8.00;
        double nota2 = 7.00;
        double cargaHoraria = 32.00; 
        double faltas = 1.00;
        
        assertTrue(avaliacao.avalia(nota1, nota2, cargaHoraria, faltas).equals("Aprovado."));
    }

}
