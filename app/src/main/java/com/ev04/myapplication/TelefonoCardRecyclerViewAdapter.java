package com.ev04.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ev04.myapplication.network.ImageRequester;
import com.ev04.myapplication.network.TelefonoEntry;

import java.util.List;

public class TelefonoCardRecyclerViewAdapter extends RecyclerView.Adapter<TelefonoCardViewHolder> {
    private List<TelefonoEntry> telefonoList;
    private ImageRequester imageRequester;


    TelefonoCardRecyclerViewAdapter(List<TelefonoEntry> telefonoList) {
        this.telefonoList = telefonoList;
        imageRequester = ImageRequester.getInstance();
    }

    @NonNull
    @Override
    public TelefonoCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.telefono_card, parent, false);






        return new TelefonoCardViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull TelefonoCardViewHolder holder, int position) {
        if (telefonoList != null & position < telefonoList.size()) {
            TelefonoEntry telefono = telefonoList.get(position);
            holder.telefonoTitle.setText(telefono.title);
            holder.telefonoPrice.setText(telefono.price);
            imageRequester.setImageFromUrl(holder.telefonoImage, telefono.url);
        }

    }

    @Override
    public int getItemCount() {
        return telefonoList.size();
    }
}
