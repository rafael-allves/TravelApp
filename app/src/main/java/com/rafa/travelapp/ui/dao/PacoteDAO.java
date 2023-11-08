package com.rafa.travelapp.ui.dao;

import android.util.Log;

import com.rafa.travelapp.ui.model.PacoteModel;

import java.util.ArrayList;
import java.util.List;

public class PacoteDAO {
    private static final List<PacoteModel> pacotes = new ArrayList<>();

    private void salva(PacoteModel pacote)
    {
        if(pacote.valid())
            pacotes.add(pacote)
        else Log.i("com.rafa.travelapp.ui.dao.PacoteDAO",
                "Pacote inválido" + pacote.toString());
    }
}
