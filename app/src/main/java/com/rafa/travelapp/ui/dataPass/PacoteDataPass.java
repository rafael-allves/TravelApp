package com.rafa.travelapp.ui.dataPass;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.rafa.travelapp.model.PacoteModel;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PacoteDataPass {
    private final Context context;
    private final PacoteModel pacote;

    public PacoteDataPass(Context context, PacoteModel pacote) {
        this.context = context;
        this.pacote = pacote;
    }

    public void bindContent(ImageView imagePacote, TextView nomeLocal, TextView dias,
                         TextView pacoteData, TextView preco) {
        passImage(imagePacote);
        passNomeLocal(nomeLocal);
        passDias(dias);

        passPreco(preco);
    }

    public void bindContent(ImageView imagePacote, TextView nomeLocal, TextView dias, TextView preco) {
        passImage(imagePacote);
        passNomeLocal(nomeLocal);
        passDias(dias);
        passPreco(preco);
    }

    private void passImage(ImageView imageView) {
        Resources resources = context.getResources();
        int imageId = resources.getIdentifier(pacote.getImageSource(), "drawable", context.getPackageName());
        Drawable image = ContextCompat.getDrawable(context, imageId);
        imageView.setImageDrawable(image);
    }

    private void passNomeLocal(TextView nomeLocal) {
        nomeLocal.setText(pacote.getNomeLocal());
    }

    private void passDias(TextView dias) {
        dias.setText("" + pacote.getDias() + " " + (
                        pacote.getDias() > 1 ? "Dias" : "Dia"
                )
        );
    }

    private void passPreco(TextView preco) {
        NumberFormat brazilianFormat = DecimalFormat
                .getCurrencyInstance(new Locale("pt", "br"));
        preco.setText(brazilianFormat.format(pacote.getPreco()));
    }
}
