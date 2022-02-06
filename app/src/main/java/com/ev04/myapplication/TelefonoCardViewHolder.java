package com.ev04.myapplication;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;
import com.google.android.material.card.MaterialCardView;

public class TelefonoCardViewHolder extends RecyclerView.ViewHolder {

    public NetworkImageView telefonoImage;
    public TextView telefonoTitle;
    public TextView telefonoPrice;

    public TelefonoCardViewHolder(@NonNull View itemView) {
        super(itemView);

        telefonoImage = itemView.findViewById(R.id.telefono_image);
        telefonoTitle = itemView.findViewById(R.id.telefono_title);
        telefonoPrice = itemView.findViewById(R.id.telefono_price);
    }
}
