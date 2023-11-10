package com.rafa.travelapp.ui.dataPass;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.rafa.travelapp.R;
import com.rafa.travelapp.model.PacoteModel;

public class PacoteDataPass {
    private final Context context;
    private final int imageViewId;
    private final int nomeLocalId;
    private final int diasId;
    private final int precoId;
    private final PacoteModel pacote;

    public PacoteDataPass(Context context, PacoteModel pacote, int imageViewId, int nomeLocalId, int diasId, int precoId) {
        this.context = context;
        this.imageViewId = imageViewId;
        this.nomeLocalId = nomeLocalId;
        this.diasId = diasId;
        this.precoId = precoId;
        this.pacote = pacote;
    }

    public void passData(ImageView imagePacote, TextView nomeLocal, TextView dias,
    TextView pacoteData, TextView preco)
    {
        passImage(imagePacote);
    }

    private void passImage(ImageView imageView)
    {
        Resources resources = context.getResources();
        int imageId = resources.getIdentifier(pacote.getImageSource(), "drawable", context.getPackageName());
        Drawable image = ContextCompat.getDrawable(context, imageId);
        imageView.setImageDrawable(image);
    }

    private void passNomeLocal(TextView nomeLocal)
    {
        nomeLocal.setText(pacote.getNomeLocal());
    }

    private void passDias(TextView dias)
    {
        dias.setText("" + pacote.getDias() + " " + (
                        pacote.getDias() > 1 ? "Dias" : "Dia"
                )
        );
    }
}
