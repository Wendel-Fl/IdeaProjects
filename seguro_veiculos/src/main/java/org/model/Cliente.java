package org.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @NoArgsConstructor
public class Cliente {
    private String nome;
    private Date dataNascimento;
    private String sexo;
    private String estadoCivil;
    private String nacionalidade;
    private String cpf;
    private String passaporte;

    public Cliente(String nome, String cpf, Date DataNascimento, String sexo, String estadoCivil, String Nacionalidade, String passaporte){
        setNome(nome);
        setDataNascimento(DataNascimento);
        setSexo(sexo);
        setEstadoCivil(estadoCivil);
        setNacionalidade(nacionalidade);
        setCpf(cpf);
        setPassaporte(passaporte);
    }

}
