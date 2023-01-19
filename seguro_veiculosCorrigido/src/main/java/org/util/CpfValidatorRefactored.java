package org.util;

import org.excecoes.CpfInvalidoException;

public class CpfValidatorRefactored {



    public static boolean isCPF(String cpf){

        boolean result = false;

        int primeiroDigito = 0;

        int segundoDigito = 0;

        int[] numerosCpf = new int[11];

        int quantidadeZeros = obtemQuantidadeZeros(cpf);

        if(validaQuantidadeMaiorOnze(cpf, result)){
            if (existeNaoDigito(cpf, result)){
                numerosCpf = preencheZero(numerosCpf,quantidadeZeros);
                numerosCpf = preencheVetor(cpf, numerosCpf,quantidadeZeros);
                if(validaIgualdade(numerosCpf,result)){
                    primeiroDigito = calculaPrimeiroDigito(numerosCpf);
                    calculaSegundoDigito(numerosCpf);
                }
            }
        }

        result = (primeiroDigito == numerosCpf[9]) && (segundoDigito ==  numerosCpf[10]);

        if(!result)
            throw new CpfInvalidoException("CPF inválido!");

        return result;
    }

    private static boolean validaQuantidadeMaiorOnze(String cpf, boolean result) {
        //valida se a quantidade de dígitos informados é maior de 11
        if(cpf.length() > 11){
            result = false;
        }
        return result;
    }

    private static int obtemQuantidadeZeros(String cpf){
        return 11 - cpf.length();
    }

    //validar se existe algum caracter que não seja dígito
    private static boolean existeNaoDigito(String cpf, boolean result){
        int contaNaoDigito = 0;
        for(int i = 0; i < cpf.length(); i++){
            if(!Character.isDigit(cpf.charAt(i))){
                contaNaoDigito++;
            }
        }
        if(contaNaoDigito > 0){
            result = false;
        }
        return result;
    }

    //preenche as posições iniciais do vetor com o valor zero
    private static int[] preencheZero(int[] numerosCpf, int quantidadeZeros){
        for(int i = 0; i < quantidadeZeros; i++){
            numerosCpf[i] = 0;
        }
        return numerosCpf;
    }

    //preenche as posições finais do vetor com os numeros do cpf.
    private static int[] preencheVetor(String cpf, int[] numerosCpf, int quantidadeZeros){
        int j = 0;
        for(int i = quantidadeZeros; i < 11; i++){
            numerosCpf[i] = Integer.parseInt(cpf.substring(j,j+1));
            j++;
        }
        return numerosCpf;
    }

    //valida se todos os números são iguais
    private static boolean validaIgualdade(int[] numerosCpf, boolean result){
        if(numerosCpf[0] == numerosCpf[1] &&
                numerosCpf[1] == numerosCpf[2] &&
                numerosCpf[2] == numerosCpf[3] &&
                numerosCpf[3] == numerosCpf[4] &&
                numerosCpf[4] == numerosCpf[5] &&
                numerosCpf[5] == numerosCpf[6] &&
                numerosCpf[6] == numerosCpf[7] &&
                numerosCpf[7] == numerosCpf[8] &&
                numerosCpf[8] == numerosCpf[9] &&
                numerosCpf[9] == numerosCpf[10]){
            result = false;
        }
        return result;
    }

    //calculo do primeiro dígito
    private static int calculaPrimeiroDigito(int[] numerosCpf){
        int soma = 0;
        for(int i = 0; i < numerosCpf.length-2; i++){
            soma += numerosCpf[i] * (10-i);
        }

        int restoDivisaoPrimeiroDigito = (soma%11);

        int primeiroDigito = 0;
        if(restoDivisaoPrimeiroDigito < 2){
            primeiroDigito = 0;
        }else{
            primeiroDigito = 11 - restoDivisaoPrimeiroDigito;
        }
        return primeiroDigito;
    }

    private static int calculaSegundoDigito(int[] numerosCpf){
        //Cálculo do segundo dígito
        int soma = 0;
        for(int i = 0; i < numerosCpf.length-1; i++){
            soma += numerosCpf[i] * (11-i);
        }

        int restoDivisaoSegundoDigito = (soma%11);

        int segundoDigito = 0;
        if(restoDivisaoSegundoDigito < 2){
            segundoDigito = 0;
        }else{
            segundoDigito = 11 - restoDivisaoSegundoDigito;
        }
        return segundoDigito;
    }

}
