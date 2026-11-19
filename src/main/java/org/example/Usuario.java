package org.example;

public class Usuario {
    public boolean logar() {
        return UsuarioFacade.verficarAcessoUsuario(this);
    }
}
