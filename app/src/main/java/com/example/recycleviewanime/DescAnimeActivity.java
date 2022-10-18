package com.example.recycleviewanime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DescAnimeActivity extends AppCompatActivity {
    TextView title;
    TextView genre;
    TextView eps;
    TextView total_season;
    TextView synopsis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_anime);

        Bundle bundle = getIntent().getExtras();
        String ATitle = bundle.getString("TITLE");
        String AGenre = bundle.getString("GENRE");
        String AEps = bundle.getString("EPISODE");
        String ASeason = bundle.getString("SEASON");
        String ASyn = bundle.getString("SYNOPSIS");

        title = findViewById(R.id.d_title);
        genre = findViewById(R.id.d_genre);
        eps = findViewById(R.id.d_eps);
        total_season = findViewById(R.id.d_season);
        synopsis = findViewById(R.id.d_synopsis);

        title.setText(ATitle);
        genre.setText(AGenre);
        eps.setText(AEps);
        total_season.setText(ASeason);
        synopsis.setText(ASyn);
    }
}