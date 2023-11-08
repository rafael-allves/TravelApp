package com.rafa.travelapp.ui.dao;

import android.util.Log;

import androidx.annotation.NonNull;

import com.rafa.travelapp.ui.model.PacoteModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class PacoteDAO {
    private static final List<PacoteModel> pacotes = new ArrayList<>();

    private void salva(PacoteModel pacote)
    {
        if(pacote.valid())
            pacotes.add(pacote);
        else Log.i("com.rafa.travelapp.ui.dao.PacoteDAO",
                "Pacote inválido" + pacote.toString());
    }

    public void jsonToPacote(JSONObject jsontoRead) {
        try {
            JSONArray jsonResponse = jsontoRead.optJSONArray("response");
            if (jsonResponse != null) {
                readObjectsInJson(jsonResponse);
            }
        } catch (Exception e) {
            Log.e("com.rafa.travelapp.ui.dao.PacoteDAO", "Error parsing JSON", e);
        }
    }

    private void readObjectsInJson(JSONArray jsonResponse) {
        for (int i = 0; i < jsonResponse.length(); i++) {
            JSONObject jsonObject = jsonResponse.optJSONObject(i);
            if (jsonObject == null) continue;

            PacoteModel pacote = createPacote(jsonObject);
            if (pacote.valid()) {
                salva(pacote);
            } else {
                Log.i("com.rafa.travelapp.ui.dao.PacoteDAO", "Pacote inválido: " + pacote);
            }
        }
    }

    @NonNull
    private PacoteModel createPacote(JSONObject jsonObject) {
        String imageSource = jsonObject.optString("imageSource");
        String nomeLocal = jsonObject.optString("nomeLocal");
        int dias = jsonObject.optInt("dias");
        double preco = jsonObject.optDouble("preco");

        return new PacoteModel(imageSource, nomeLocal, dias, preco);
    }
}
