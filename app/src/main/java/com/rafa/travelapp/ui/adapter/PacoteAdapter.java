package com.rafa.travelapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rafa.travelapp.R;
import com.rafa.travelapp.model.PacoteModel;
import com.rafa.travelapp.ui.dataPass.PacoteDataPass;

import java.util.List;


public class PacoteAdapter extends BaseAdapter {

    private final List<PacoteModel> pacotes;
    private final Context context;

    public PacoteAdapter(List<PacoteModel> pacotes, Context context) {
        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public PacoteModel getItem(int i) {

        return pacotes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View pacote = LayoutInflater.from(context)
                .inflate(R.layout.activity_lista_pacotes_item_pacote, viewGroup, false);

        ImageView imageView = pacote.findViewById(R.id.item_pacote_image);
        TextView nomeLocal = pacote.findViewById(R.id.item_pacote_nome_local);
        TextView dias = pacote.findViewById(R.id.item_pacote_dias);
        TextView preco = pacote.findViewById(R.id.item_pacote_preco);

        new PacoteDataPass(context, pacotes.get(i))
                .bindContent(imageView, nomeLocal, dias, preco);

        return pacote;
    }
}
