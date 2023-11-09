package com.rafa.travelapp.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rafa.travelapp.R;
import com.rafa.travelapp.dao.PacoteDAO;

public class ListaPacotesActivity extends AppCompatActivity {

    private final PacoteDAO pacotedao = new PacoteDAO();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pacotes);
    }
}
