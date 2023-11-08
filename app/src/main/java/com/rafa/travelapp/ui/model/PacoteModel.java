package com.rafa.travelapp.ui.model;

public class PacoteModel {
    private final String imageSource;
    private final String nomeLocal;
    private final int dias;
    private final double Preco;

    public PacoteModel(String imageSource, String nomeLocal, int dias, double preco) {
        this.imageSource = imageSource;
        this.nomeLocal = nomeLocal;
        this.dias = dias;
        Preco = preco;
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
        return Preco;
    }
}
