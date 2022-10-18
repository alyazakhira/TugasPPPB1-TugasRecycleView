package com.example.recycleviewanime;

public class Anime {
    String title;
    String genre;
    String status_airing;
    int episode_total;
    int season_total;
    String synopsis;

    public Anime(String title, String genre, String status_airing, int episode_total, int season_total, String synopsis) {
        this.title = title;
        this.genre = genre;
        this.status_airing = status_airing;
        this.episode_total = episode_total;
        this.season_total = season_total;
        this.synopsis = synopsis;
    }
}
