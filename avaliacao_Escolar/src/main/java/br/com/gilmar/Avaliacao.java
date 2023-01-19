package br.com.gilmar;

/**
 * Created by gilmario on 26/02/17.
 */
public class Avaliacao {

    public String avalia(double nota1, double nota2, double faltas, double cargaHoraria) {
        String result;
        double percentualFaltas = (faltas/cargaHoraria);
        double media = (nota1 + nota2)/2;
        if((nota1 < 0.00 || nota1 > 10.00) ||
                (nota2 < 0.00 || nota2 > 10.00) ||
                (faltas < 0.00 || faltas > cargaHoraria) ||
                cargaHoraria < 0.00 || (cargaHoraria != 32.00 && cargaHoraria != 64.00 && cargaHoraria != 96.00 && cargaHoraria != 128.00)){
            throw new ValoresInvalidosException();//result = "Valores Inválidos.";
        }else if(percentualFaltas > 0.25){
            result = "Reprovado por Falta.";
        }else if(media < 3.00){
            result = "Reprovado por Média.";
        }else if(media >= 3.00 && media < 6.00){
            result = "Prova Extra.";
        }else{
            result = "Aprovado.";
        }
        return result;
    }

}
