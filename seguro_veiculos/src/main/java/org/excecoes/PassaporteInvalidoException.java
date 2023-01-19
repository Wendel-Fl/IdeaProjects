package org.excecoes;

public class PassaporteInvalidoException extends RuntimeException{
    public PassaporteInvalidoException(String message){
        super(message);
    }
}
