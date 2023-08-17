package com.belajar.projectuas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListProjekAdapter extends RecyclerView.Adapter<ListProjekAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Projek> listProjek;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListProjekAdapter(ArrayList<Projek> list){
        this.listProjek = list;
    }

    @NonNull
    @Override
    public ListProjekAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_projek, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListProjekAdapter.ListViewHolder holder, int position) {
        Projek projek = listProjek.get(position);
        Glide.with(holder.itemView.getContext()).load(projek.getPhoto()).apply(new RequestOptions().override(55, 55)).into(holder.imgPhoto);
        holder.tvName.setText(projek.getName());
        holder.tvDesc.setText(projek.getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailProjekAdapter.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", projek.getName());
                bundle.putString("detail", projek.getDetail());
                bundle.putString("desc", projek.getDesc());
                bundle.putString("link", projek.getLink());
                bundle.putInt("photo", projek.getPhoto());
                intent.putExtras(bundle);
                context.startActivity(intent);
                Toast.makeText(holder.itemView.getContext(), "" + listProjek.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Projek data);
    }

    @Override
    public int getItemCount() {
        return listProjek.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
