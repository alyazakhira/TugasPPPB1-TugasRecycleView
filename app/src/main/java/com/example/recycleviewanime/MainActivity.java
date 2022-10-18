package com.example.recycleviewanime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Anime> anime_watched = new ArrayList<>();
    private AnimeAdapter animeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addAnimeData();
        animeAdapter = new AnimeAdapter(this, anime_watched);
        recyclerView = findViewById(R.id.rv_anime);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(animeAdapter);
    }

    public void addAnimeData(){
        anime_watched.add(new Anime("Shigatsu wa Kimi no Uso","Romance","Finished",24,1,"Kousei Arima is a child prodigy known as the \"Human Metronome\" for playing the piano with precision and perfection. Guided by a strict mother and rigorous training, Kousei dominates every competition he enters, earning the admiration of his musical peers and praise from audiences. When his mother suddenly passes away, the subsequent trauma makes him unable to hear the sound of a piano, and he never takes the stage thereafter.\n" +
                "\n" +
                "Nowadays, Kousei lives a quiet and unassuming life as a junior high school student alongside his friends Tsubaki Sawabe and Ryouta Watari. While struggling to get over his mother's death, he continues to cling to music. His monochrome life turns upside down the day he encounters the eccentric violinist Kaori Miyazono, who thrusts him back into the spotlight as her accompanist. Through a little lie, these two young musicians grow closer together as Kaori tries to fill Kousei's world with color."));
        anime_watched.add(new Anime("Kimetsu no Yaiba","Action","Finished",26,2,"Ever since the death of his father, the burden of supporting the family has fallen upon Tanjirou Kamado's shoulders. Though living impoverished on a remote mountain, the Kamado family are able to enjoy a relatively peaceful and happy life. One day, Tanjirou decides to go down to the local village to make a little money selling charcoal. On his way back, night falls, forcing Tanjirou to take shelter in the house of a strange man, who warns him of the existence of flesh-eating demons that lurk in the woods at night.\n" +
                "\n" +
                "When he finally arrives back home the next day, he is met with a horrifying sight—his whole family has been slaughtered. Worse still, the sole survivor is his sister Nezuko, who has been turned into a bloodthirsty demon. Consumed by rage and hatred, Tanjirou swears to avenge his family and stay by his only remaining sibling. Alongside the mysterious group calling themselves the Demon Slayer Corps, Tanjirou will do whatever it takes to slay the demons and protect the remnants of his beloved sister's humanity."));
        anime_watched.add(new Anime("Noragami","Action","Finished",12,2,"In times of need, if you look in the right place, you just may see a strange telephone number scrawled in red. If you call this number, you will hear a young man introduce himself as the Yato God.\n" +
                "\n" +
                "Yato is a minor deity and a self-proclaimed \"Delivery God,\" who dreams of having millions of worshippers. Without a single shrine dedicated to his name, however, his goals are far from being realized. He spends his days doing odd jobs for five yen apiece, until his weapon partner becomes fed up with her useless master and deserts him.\n" +
                "\n" +
                "Just as things seem to be looking grim for the god, his fortune changes when a middle school girl, Hiyori Iki, supposedly saves Yato from a car accident, taking the hit for him. Remarkably, she survives, but the event has caused her soul to become loose and hence able to leave her body. Hiyori demands that Yato return her to normal, but upon learning that he needs a new partner to do so, reluctantly agrees to help him find one. And with Hiyori's help, Yato's luck may finally be turning around."));
        anime_watched.add(new Anime("Jujutsu Kaisen","Action","Finished",24,1,"Idly indulging in baseless paranormal activities with the Occult Club, high schooler Yuuji Itadori spends his days at either the clubroom or the hospital, where he visits his bedridden grandfather. However, this leisurely lifestyle soon takes a turn for the strange when he unknowingly encounters a cursed item. Triggering a chain of supernatural occurrences, Yuuji finds himself suddenly thrust into the world of Curses—dreadful beings formed from human malice and negativity—after swallowing the said item, revealed to be a finger belonging to the demon Sukuna Ryoumen, the \"King of Curses.\"\n" +
                "\n" +
                "Yuuji experiences first-hand the threat these Curses pose to society as he discovers his own newfound powers. Introduced to the Tokyo Metropolitan Jujutsu Technical High School, he begins to walk down a path from which he cannot return—the path of a Jujutsu sorcerer."));
        anime_watched.add(new Anime("Ansatsu Kyoushitsu","Comedy","Finished",24,2,"Tucked in the mountains near the elite Kunugigaoka Middle School lies a small derelict building that houses the delinquents and dropouts of Class 3-E.\n" +
                "\n" +
                "Looked down upon by their peers, the students in this class appear to have little hope in advancing their academic careers. That is, until the national government tasks them with eliminating the greatest threat to their planet: their new teacher.\n" +
                "\n" +
                "Having already destroyed the moon, the octopus-like professor—dubbed \"Koro-sensei\"—has now threatened to destroy the Earth by March of the following year. In light of their mission, the students have found that killing him is easier said than done. \n" +
                "\n" +
                "Not only can Koro-sensei move at speeds of up to Mach 20, but he can also resist almost every earthly weapon. Ironically, he also proves to be one of the best teachers Class 3-E has ever had. Training the class to excel in both their studies as students and skills as assassins, Koro-sensei is confident that his students' ingenuity and indomitable will could return them to the main campus.\n" +
                "\n" +
                "Through trial and error, Nagisa Shiota, as well as the other students of Class 3-E, must figure out Koro-sensei's weaknesses—and fast, for the very fate of the world depends upon it."));
    }

}