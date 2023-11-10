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
import com.rafa.travelapp.ui.bind.PacoteBinder;

public class ResumoPacoteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacotes);
        configureUI();
    }

    private void configureUI() {
        Intent fromListaPacotes = new Intent();
        if (!fromListaPacotes.hasExtra("pacote")) {
            int pacotePos = fromListaPacotes.getIntExtra("pacote", 0);
            PacoteModel pacote = PacoteDAO.lista().get(pacotePos);
            bindFields(pacote);
        } else {
            Log.e("ResumoPacoteActivity receive pacote", "Pacote Nulo Recebido");
            startActivity(new Intent(this, ListaPacotesActivity.class));
        }
    }

    private void bindFields(PacoteModel pacote) {
        ImageView imageView = findViewById(R.id.resumo_pacote_image);
        TextView nomeLocal = findViewById(R.id.resumo_pacote_nome_local);
        TextView dias = findViewById(R.id.resumo_pacote_dias);
        TextView data = findViewById(R.id.resumo_pacote_data);
        TextView preco = findViewById(R.id.resumo_pacote_preco);

        new PacoteBinder(this, pacote)
                .bindContent(imageView, nomeLocal, dias, data, preco);
    }
}
