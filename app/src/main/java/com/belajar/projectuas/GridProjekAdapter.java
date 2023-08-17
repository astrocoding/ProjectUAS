package com.belajar.projectuas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridProjekAdapter extends RecyclerView.Adapter<GridProjekAdapter.GridViewHolder> {
    private ArrayList<Projek> listProjek;
    private GridProjekAdapter.OnItemClickCallback onItemClickCallback;

    public GridProjekAdapter(ArrayList<Projek> list) {
        this.listProjek = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public GridProjekAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_projek, parent, false);
        return new GridViewHolder(view);
    }

    public interface OnItemClickCallback {
        void onItemClicked(Projek data);
    }

    @Override
    public void onBindViewHolder(@NonNull GridProjekAdapter.GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext()).load(listProjek.get(position).getPhoto()).apply(new RequestOptions().override(350, 550)).into(holder.imgPhoto);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listProjek.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listProjek.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
