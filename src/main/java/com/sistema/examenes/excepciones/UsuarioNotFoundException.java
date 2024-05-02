package com.sistema.examenes.excepciones;

public class UsuarioNotFoundException extends Exception {

    public UsuarioNotFoundException() {
        super("No existe el usuario con ese username");
    }

    public UsuarioNotFoundException(String message) {
        super(message);
    }

}
