package com.rafa.travelapp.model;

import java.math.BigDecimal;

public class PacoteModel {
    private final String imageSource;
    private final String nomeLocal;
    private final int dias;
    private final BigDecimal preco;

    public PacoteModel(String nomeLocal, String imageSource, int dias, BigDecimal preco) {
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

    public BigDecimal getPreco() {
        return preco;
    }

    public boolean valid() {
        return ((!imageSource.isEmpty()) &&
                (!nomeLocal.isEmpty()) &&
                (dias > 0));
    }
}
