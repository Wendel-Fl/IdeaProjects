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

package org.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.util.*;

import java.util.Date;

@Getter @Setter @NoArgsConstructor
public class PremioSeguro {

    private Double valorSeguro;

    private Double percentualDesconto;

    private Double valorSeguroComDesconto;

    private Cliente cliente;
    public PremioSeguro(Cliente cliente){
        setCliente(cliente);
    }
    public void obtemPercentualDesconto() {

        Date dataNascimento = cliente.getDataNascimento();
        String sexo = cliente.getSexo();
        String estadoCivil = cliente.getEstadoCivil();
        String nacionalidade = cliente.getNacionalidade();
        int idade = DataUtils.getIdade(dataNascimento,new Date());

        if (DataUtils.validaIdade(dataNascimento, new Date())){
            if(SexoValidator.validaSexo(sexo)) {
                if(EstadoCivilValidator.validaEstadoCivil(estadoCivil)) {
                    if (NacionalidadeValidator.validaNacionalidade(nacionalidade)) {
                        if (cliente.getNacionalidade().equals("Brasileira")) {
                            CpfValidator.isCPF(cliente.getCpf());
                        } else {
                            PassaporteValidator.validaPassaporte(cliente.getPassaporte());
                        }
                    }
                }
            }
        }
        //feminino, solteira, menor que 25 anos.
        if(sexo.equals("Feminino") && estadoCivil.equals("Solteira") && idade <= 25){
            percentualDesconto = 5.00;
        }
        //feminino, solteira, maior que 25 anos.
        else if(sexo.equals("Feminino") && estadoCivil.equals("Solteira") && idade > 25){
            percentualDesconto = 15.00;
        }
        //feminino, casada, menor que 25 anos.
        else if(sexo.equals("Feminino") && estadoCivil.equals("Casada") && idade <= 25){
            percentualDesconto = 10.00;
        }
        //feminino, casada, maior que 25 anos.
        else if(sexo.equals("Feminino") && estadoCivil.equals("Casada") && idade > 25){
            percentualDesconto = 30.00;
        }
        //masculino, solteiro, menor que 25 anos.
        if(sexo.equals("Masculino") && estadoCivil.equals("Solteiro") && idade <= 25){
            percentualDesconto = 0.00;
        }
        //masculino, solteiro, maior que 25 anos.
        else if(sexo.equals("Masculino") && estadoCivil.equals("Solteiro") && idade > 25){
            percentualDesconto = 10.00;
        }
        //Masculino, casado, menor que 25 anos.
        else if(sexo.equals("Masculino") && estadoCivil.equals("Casado") && idade <= 25){
            percentualDesconto = 5.00;
        }
        //Masculino, casado, maior que 25 anos.
        else if(sexo.equals("Masculino") && estadoCivil.equals("Casado") && idade > 25){
            percentualDesconto = 20.00;
        }
    }

    public void calculaValorComDesconto(){
        double valorDesconto = valorSeguro * (percentualDesconto / 100);
        valorSeguroComDesconto = valorSeguro - valorDesconto;
    }
}
