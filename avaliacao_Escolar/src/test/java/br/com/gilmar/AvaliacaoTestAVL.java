package br.com.gilmar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by gilmario on 26/02/17.
 */
public class AvaliacaoTestAVL {
    private double nota1;
    private double nota2;
    private double faltas;
    private double cargaHoraria;
    private String resultadoEsperado;
    //private final Avaliacao avaliacao = new Avaliacao();

    private Avaliacao avaliacao;

    @Before
    public void setup(){
        avaliacao = new Avaliacao();
    }

    //cenários de teste:
    //nota1
    //1. Testar a nota1 = -0,01 - valores (-0.01,10.00,5.00,32.00)
    @Test(expected = ValoresInvalidosException.class)
    public void testNota1_001(){
        nota1 = -0.01;
        nota2 = 10.00;
        faltas = 5.00;
        cargaHoraria = 32.00;
        String resultadoEsperado = "Valores Inválidos.";
        assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
    }

    @Test()
    public void testNota1_001a(){
        nota1 = -0.01;
        nota2 = 10.00;
        faltas = 5.00;
        cargaHoraria = 32.00;
        String resultadoEsperado = "Valores Inválidos.";
        try{
            assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
        }catch (ValoresInvalidosException vie){
            assertTrue(vie != null);
        }
    }

    @Test()
    public void testNota1_001b(){
        nota1 = -0.01;
        nota2 = 10.00;
        faltas = 5.00;
        cargaHoraria = 32.00;
        String resultadoEsperado = "Valores Inválidos.";
        try{
            assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
        }catch (ValoresInvalidosException vie){
            assertTrue(vie instanceof ValoresInvalidosException);
        }
    }

    //2. Testar a nota1 = 0.00 - valores (0.00,10.00,5.00,32.00)
    @Test()
    public void testNota1_000(){
        nota1 = 0.0;
        nota2 = 10.00;
        faltas = 5.00;
        cargaHoraria = 32.00;
        String resultadoEsperado = "Prova Extra.";
        assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
    }

    //3. Testar a nota1 = 0.01 - valores (0.01,10.00,5.00,32.00)
    @Test()
    public void testNota1001(){
        nota1 = 0.01;
        nota2 = 10.00;
        faltas = 5.00;
        cargaHoraria = 32.00;
        String resultadoEsperado = "Prova Extra.";
        assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
    }
    //4. Testar a nota1 = 5.00 - valores (5.00,10.00,5.00,32.00)
    //5. Testar a nota1 = 9,99 - valores (9.99,10.00,5.00,32.00)
    //6. Testar a nota1 = 10.00 - valores (10.00,10.00,5.00,32.00)
    //7. Testar a nota1 = 10.01 - valores (10.01,10.00,5.00,32.00)

    //nota2
    //8. Testar a nota2 = -0,01 - valores (10.00,-0.01,5.00,32.00)
    //9. Testar a nota2 = 0.00 - valores (10.00,0.00,5.00,32.00)
    //10. Testar a nota2 = 0.01 - valores (10.00,0.01,5.00,32.00)
    //11. Testar a nota2 = 5.00 - valores (10.00,5.00,5.00,32.00)
    //12. Testar a nota2 = 9,99 - valores (10.00,9.99,5.00,32.00)
    //13. Testar a nota2 = 10.00 - valores (10.00,10.00,5.00,32.00)
    //14. Testar a nota2 = 10.01 - valores (10.00,10.01,5.00,32.00)
    //15. Testar quantidadeFaltas = -1.00
    //16. Testar quantidadeFaltas = 129
    //17. Testar cargaHoraria = -1.00
    //18. Testar cargaHoraria = 31.00
    //19. Testar cargaHoraria = 32.00
    //20. Testar cargaHoraria = 33.00
    //21. Testar cargaHoraria = 63.00
    //22. Testar cargaHoraria = 64.00
    //23. Testar cargaHoraria = 65.00
    //24. Testar cargaHoraria = 95.00
    //25. Testar cargaHoraria = 96.00
    //26. Testar cargaHoraria = 97.00
    //27. Testar cargaHoraria = 127.00
    //28. Testar cargaHoraria = 128.00
    //29. Testar cargaHoraria = 129.00

    //cargaHora x faltas
    //30. Testar cargaHoraria = 32.00 e quantidadeFaltas = 7.00 - valores (10.00,10.00,7.00,32.00)
    //31. Testar cargaHoraria = 32.00 e quantidadeFaltas = 8.00 - valores (10.00,10.00,8.00,32.00)
    //32. Testar cargaHoraria = 32.00 e quantidadeFaltas = 9.00 - valores (10.00,10.00,9.00,32.00)
    //33. Testar cargaHoraria = 64.00 e quantidadeFaltas = 15,00 - valores (10.00,10.00,15.00,64.00)
    @Test()
    public void test33(){
        nota1 = 10.00;
        nota2 = 10.00;
        faltas = 15.00;
        cargaHoraria = 64.00;
        String resultadoEsperado = "Aprovado.";
        assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
    }
    //34. Testar cargaHoraria = 64.00 e quantidadeFaltas = 16.00 - valores (10.00,10.00,16.00,64.00)
    @Test()
    public void test34(){
        nota1 = 10.00;
        nota2 = 10.00;
        faltas = 16.00;
        cargaHoraria = 64.00;
        String resultadoEsperado = "Aprovado.";
        assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
    }
    //35. Testar cargaHoraria = 64.00 e quantidadeFaltas = 17.00 - valores (10.00,10.00,17.00,64.00)
    @Test()
    public void test35(){
        nota1 = 10.00;
        nota2 = 10.00;
        faltas = 17.00;
        cargaHoraria = 64.00;
        String resultadoEsperado = "Reprovado por Falta.";
        assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
    }
    //36. Testar cargaHoraria = 96.00 e quantidadeFaltas = 23,00 - valores (10.00,10.00,23.00,96.00)
    //37. Testar cargaHoraria = 96.00 e quantidadeFaltas = 24.00 - valores (10.00,10.00,24.00,96.00)
    //38. Testar cargaHoraria = 96.00 e quantidadeFaltas = 25.00 - valores (10.00,10.00,25.00,96.00)
    //39. Testar cargaHoraria = 128.00 e quantidadeFaltas = 31,00 - valores (10.00,10.00,31.00,128.00)
    //40. Testar cargaHoraria = 128.00 e quantidadeFaltas = 32.00 - valores (10.00,10.00,32.00,128.00)
    //41. Testar cargaHoraria = 128.00 e quantidadeFaltas = 33.00 - valores (10.00,10.00,33.00,128.00)
    //media
    //42. Testar media = 0,00 - valores (0.00,0.00,32.00,128.00)
    //43. Testar media = 0,01 - valores (0.01,1.00,32.00,128.00)
    //44. Testar media = 2,99 - valores (2.99,2.99,32.00,128.00)
    @Test
    public void test44(){
        nota1 = 2.99;
        nota2 = 2.99;
        faltas = 32.00;
        cargaHoraria = 128.00;
        String resultadoEsperado = "Reprovado por Média.";
        assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
    }
    //45. Testar media = 3,00 - valores (3.00,3.00,32.00,128.00)
    @Test
    public void test45(){
        nota1 = 3.00;
        nota2 = 3.00;
        faltas = 32.00;
        cargaHoraria = 128.00;
        String resultadoEsperado = "Prova Extra.";
        assertEquals(resultadoEsperado,avaliacao.avalia(nota1,nota2,faltas,cargaHoraria));
    }
    //46. Testar media = 3,01 - valores (3.01,3.01,32.00,128.00)
    //47. Testar media = 5,99 - valores (5.99,5.99,32.00,128.00)
    //48. Testar media = 6,00 - valores (6.00,6.00,32.00,128.00)
    //49. Testar media = 6,01 - valores (6.01,6.01,32.00,128.00)
    //50. Testar media = 9,99 - valores (9.99,9.99,32.00,128.00)
    //51. Testar media = 10,00 - valores (10.00,10.00,32.00,128.00)

}
