package com.rafa.travelapp.dao;

import com.rafa.travelapp.model.PacoteModel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacoteDAO {

    public static List<PacoteModel> lista() {
        return new ArrayList<>(Arrays.asList(
                new PacoteModel("São Paulo", "sao_paulo_sp", 2, new BigDecimal(243.99)),
                new PacoteModel("Belo Horizonte", "belo_horizonte_mg", 3, new BigDecimal(421.50)),
                new PacoteModel("Recife", "recife_pe", 4, new BigDecimal(754.20)),
                new PacoteModel("Rio de Janeiro", "rio_de_janeiro_rj", 6, new BigDecimal(532.55)),
                new PacoteModel("Salvador", "salvador_ba", 5, new BigDecimal(899.99)),
                new PacoteModel("Foz do Iguaçu", "foz_do_iguacu_pr", 1, new BigDecimal(289.90))));
    }
}