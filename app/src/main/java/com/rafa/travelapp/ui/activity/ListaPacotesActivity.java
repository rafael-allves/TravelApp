package com.rafa.travelapp.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.rafa.travelapp.R;
import com.rafa.travelapp.dao.PacoteDAO;
import com.rafa.travelapp.ui.adapter.PacoteAdapter;

public class ListaPacotesActivity extends Activity {
    private final PacoteAdapter adapter = new PacoteAdapter(PacoteDAO.lista(), this);
    private ListView listaPacotes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
        setListaPacotes();
    }

    private void setListaPacotes() {
        listaPacotes = findViewById(R.id.lista_pacotes_lista);
        listaPacotes.setAdapter(adapter);
    }

}
