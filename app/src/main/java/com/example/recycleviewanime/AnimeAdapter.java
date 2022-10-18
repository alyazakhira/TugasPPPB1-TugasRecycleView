package com.example.recycleviewanime;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder>{
    private final ArrayList<Anime> items;
    private final LayoutInflater inflater;

    public AnimeAdapter(Context context, ArrayList<Anime> values) {
        this.items = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AnimeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_anime, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeAdapter.ViewHolder holder, int position) {
        Anime anime = items.get(position);
        String a_title = anime.title;
        String a_genre = anime.genre;
        String a_status = anime.status_airing;
        String a_eps = Integer.toString(anime.episode_total);
        String a_season = Integer.toString(anime.season_total);
        String a_synopsis = anime.synopsis;
        holder.title.setText(a_title);
        holder.genre.setText(a_genre);
        holder.episode.setText(a_eps);

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(),DescAnimeActivity.class);
            intent.putExtra("TITLE",a_title);
            intent.putExtra("GENRE",a_genre);
            intent.putExtra("STATUS",a_status);
            intent.putExtra("EPISODE",a_eps);
            intent.putExtra("SEASON",a_season);
            intent.putExtra("SYNOPSIS",a_synopsis);
            view.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, genre, episode;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.i_title);
            genre = itemView.findViewById(R.id.i_genre);
            episode = itemView.findViewById(R.id.i_eps);
        }
    }
}
