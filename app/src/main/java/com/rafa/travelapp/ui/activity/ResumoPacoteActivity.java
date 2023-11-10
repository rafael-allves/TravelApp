package com.rafa.travelapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rafa.travelapp.R;
import com.rafa.travelapp.dao.PacoteDAO;
import com.rafa.travelapp.model.PacoteModel;

import java.util.ArrayList;
import java.util.List;

public class ResumoPacoteActivity extends AppCompatActivity {

    private ImageView imagePacote;
    private TextView nomeLocal;
    private TextView dias;
    private TextView pacoteData;
    private TextView preco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacotes);
    }

    private void bindFields()
    {
        Intent fromListaPacotes = new Intent();
        if(fromListaPacotes.hasExtra("pacote")){
            int pacotePos = fromListaPacotes.getIntExtra("pacote", 0);
            PacoteModel pacote = PacoteDAO.lista().get(pacotePos);
        }else {
            Log.e("ResumoPacoteActivity receive pacote", "Pacote Nulo Recebido");
            startActivity(new Intent(this, ListaPacotesActivity.class));
        }

    }
}
