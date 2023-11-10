package com.rafa.travelapp.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.rafa.travelapp.R;
import com.rafa.travelapp.model.PacoteModel;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;


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
        PacoteModel data = pacotes.get(i);

        View pacote = LayoutInflater.from(context)
                .inflate(R.layout.activity_lista_pacotes_item_pacote, viewGroup, false);

        ImageView imageView = pacote.findViewById(R.id.item_pacote_image);
        TextView nomeLocal = pacote.findViewById(R.id.item_pacote_nome_local);
        TextView dias = pacote.findViewById(R.id.item_pacote_dias);


        TextView preco = pacote.findViewById(R.id.item_pacote_preco);
        NumberFormat brazilianFormat = DecimalFormat
                .getCurrencyInstance(new Locale("pt", "br"));
        preco.setText(brazilianFormat.format(data.getPreco()));

        return pacote;
    }
}
