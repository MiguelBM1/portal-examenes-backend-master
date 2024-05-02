package com.sistema.examenes.excepciones;

public class UsuarioFoundException  extends Exception {

    public UsuarioFoundException() {
        super("Ya existe un usuario con ese username");
    }

    public UsuarioFoundException(String message) {
        super(message);
    }
}
