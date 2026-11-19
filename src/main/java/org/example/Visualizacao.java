package org.example;

public class Visualizacao extends Acesso {
    private static Visualizacao visualizacao = new Visualizacao();

    private Visualizacao() {};

    public static Visualizacao getInstance() {
        return visualizacao;
    }
}
