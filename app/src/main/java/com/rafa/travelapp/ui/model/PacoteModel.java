package com.rafa.travelapp.ui.model;

public class PacoteModel {
    private final String imageSource;
    private final String nomeLocal;
    private final int dias;
    private final double preco;

    public PacoteModel(String imageSource, String nomeLocal, int dias, double preco) {
        this.imageSource = imageSource;
        this.nomeLocal = nomeLocal;
        this.dias = dias;
        this.preco = preco;
    }

    public String getImageSource() {
        return imageSource;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public int getDias() {
        return dias;
    }

    public double getPreco() {
        return preco;
    }

    public boolean valid() {
        return ((!imageSource.isEmpty()) &&
                (!nomeLocal.isEmpty()) &&
                (dias > 0) &&
                (preco > 0));
    }

    @Override
    public String toString()
    {
        return "imageSource: " + imageSource +
                " nomeLocal: " + nomeLocal +
                " dias: " + dias +
                " preco: " + preco;
    }
}
