package br.com.gilmar;

import static org.junit.Assert.assertEquals;

import br.com.gilmar.Avaliacao;
import org.junit.Test;

/**
 * Created by gilmario on 26/02/17.
 */
public class AvaliacaoTest {
    private double nota1;
    private double nota2;
    private double faltas;
    private double cargaHoraria;
    private String resultadoEsperado;
    private final Avaliacao avaliacao = new Avaliacao();

    @Test(expected = ValoresInvalidosException.class)
    public void testaValoresInvalidos1(){
        nota1 = -1;
        nota2 = 0;
        faltas = 17;
        cargaHoraria = 64;
        resultadoEsperado = "Valores Inválidos.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }

    @Test(expected = ValoresInvalidosException.class)
    public void testaValoresInvalidos2(){
        nota1 = 0;
        nota2 = -1;
        faltas = 17;
        cargaHoraria = 64;
        resultadoEsperado = "Valores Inválidos.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }

    @Test(expected = ValoresInvalidosException.class)
    public void testaValoresInvalidos3(){
        nota1 = 0;
        nota2 = 0;
        faltas = -1;
        cargaHoraria = 64;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test(expected = ValoresInvalidosException.class)
    public void testaValoresInvalidos4(){
        nota1 = 0;
        nota2 = 0;
        faltas = 16;
        cargaHoraria = -64;
        avaliacao.avalia(nota1, nota2, faltas, cargaHoraria);
    }

    @Test
    public void testaReprovacaoPorFalta(){
        nota1 = 0;
        nota2 = 0;
        faltas = 17;
        cargaHoraria = 64;
        resultadoEsperado = "Reprovado por Falta.";
        try {
            assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testaReprovacaoPorMedia(){
        nota1 = 0.00;
        nota2 = 0.00;
        faltas = 16.00;
        cargaHoraria = 64.00;
        resultadoEsperado = "Reprovado por Média.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }

    @Test
    public void testaProvaExtra1(){
        nota1 = 3;
        nota2 = 3;
        faltas = 16;
        cargaHoraria = 64;
        resultadoEsperado = "Prova Extra.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }

    @Test
    public void testaProvaExtra2(){
        nota1 = 5.99;
        nota2 = 6.00;
        faltas = 16;
        cargaHoraria = 64;
        resultadoEsperado = "Prova Extra.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }

    @Test
    public void testaAprovacao(){
        nota1 = 6.00;
        nota2 = 6;
        faltas = 16;
        cargaHoraria = 64;
        resultadoEsperado = "Aprovado.";
        assertEquals(resultadoEsperado, avaliacao.avalia(nota1, nota2, faltas, cargaHoraria));
    }
}
