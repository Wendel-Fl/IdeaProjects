package org.model;

import org.util.DataUtils;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        /*
        Cliente cliente = new Cliente();
        cliente.setNome("Robert Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento(DataUtils.StringToDate("20/10/1995"));
        cliente.setCpf("191");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(2000.0);
        ps.obtemPercentualDesconto();
        //System.out.println("O percentual de desconto é: " + ps.getPercentualDesconto());
        //System.out.println("O Valor do seguro com desconto é: " + ps.getValorSeguroComDesconto());
        ps.calculaValorComDesconto();
*/

        String data = "31/06/2022";
        String dados[] = data.split("/");
        int dia = Integer.parseInt(dados[0]);
        int mes = Integer.parseInt(dados[1]);
        int ano = Integer.parseInt(dados[2]);
        int[] mesesTrintaDias = {4,6,9,11};
        for(int i = 0; i < mesesTrintaDias.length; i++){
            if(mes == mesesTrintaDias[i] && dia > 30);
        }
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);
    }
}
