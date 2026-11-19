package org.example;

public class UsuarioFacade {
    public static boolean verficarAcessoUsuario(Usuario usuario) {
        if(Visualizacao.getInstance().verificarAcesso(usuario)) {
            return false;
        }
        if(Escrita.getInstance().verificarAcesso(usuario)) {
            return false;
        }
        return true;
    }
}
