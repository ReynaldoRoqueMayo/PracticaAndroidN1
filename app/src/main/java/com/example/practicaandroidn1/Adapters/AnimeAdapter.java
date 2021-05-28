package com.example.practicaandroidn1.Adapters;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practicaandroidn1.Entidades.Anime;
import com.example.practicaandroidn1.R;
import com.squareup.picasso.Picasso;


import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {
    Boolean estado=false;
    List<Anime> listaAnm;

    public AnimeAdapter(List<Anime> listaAnm) {
        this.listaAnm = listaAnm;
    }

    @Override
    public AnimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime,parent,false);

        return new AnimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder( AnimeAdapter.AnimeViewHolder holder, int position) {
        View view =holder.itemView;

        Anime animeElement= listaAnm.get(position);


        ImageView imgV=view.findViewById(R.id.imgCaratula);
        //imgV.setImageDrawable(Drawable.createFromPath(animeElement.imagen));

        Picasso.with(holder.itemView.getContext())
                .load(animeElement.imagen)
                .into(imgV);


        TextView tvT=view.findViewById(R.id.tvTitulo);
        tvT.setText(animeElement.nombre);

        TextView tvD=view.findViewById(R.id.tvDesc);
        tvD.setText(animeElement.descripcion);


        ImageView imgChange=view.findViewById(R.id.ivFav);

        imgChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                estado=!estado;
               if(estado==true){
                    imgChange.setColorFilter(Color.argb(255, 0, 156, 38));
                }
                if(estado==false){
                    imgChange.setColorFilter(Color.argb(0, 0, 0, 0));
                }


                Log.i("CLICK", "HICISTE CLICK EN IMAGEN: ");
            }

        });



    }

    @Override
    public int getItemCount() {
        return listaAnm.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder{


        public AnimeViewHolder( View itemView) {
            super(itemView);
        }
    }

}
