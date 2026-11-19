package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Acesso {
    private List<Usuario> usuariosBloqueados = new ArrayList<>();

    public void bloqueiaUsuario(Usuario usuario) {
        this.usuariosBloqueados.add(usuario);
    }

    public boolean verificarAcesso(Usuario usuario) {
        return this.usuariosBloqueados.contains(usuario);
    }
}
