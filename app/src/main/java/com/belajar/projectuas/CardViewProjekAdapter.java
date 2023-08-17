package com.belajar.projectuas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewProjekAdapter extends RecyclerView.Adapter<CardViewProjekAdapter.CardViewViewHolder> {
    private ArrayList<Projek> listProjek;
    public CardViewProjekAdapter(ArrayList<Projek> list) {
        this.listProjek = list;
    }


    @NonNull
    @Override
    public CardViewProjekAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_projek, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewProjekAdapter.CardViewViewHolder holder, int position) {
        Projek projek = listProjek.get(position);

        Glide.with(holder.itemView.getContext()).load(projek.getPhoto()).apply(new RequestOptions().override(350, 550)).into(holder.imgPhoto);

        holder.tvName.setText(projek.getName());
        holder.tvDesc.setText(projek.getDesc());

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " + listProjek.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Share " + listProjek.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listProjek.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        Button btnFavorite, btnShare;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_detail);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
