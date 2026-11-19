package org.example;

public class Escrita extends Acesso {
    private static Escrita escrita = new Escrita();

    private Escrita() {};

    public static Escrita getInstance() {
        return escrita;
    }
}
