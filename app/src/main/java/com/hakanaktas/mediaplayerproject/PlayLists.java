package com.hakanaktas.mediaplayerproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hakanaktas.mediaplayerproject.databinding.ActivityMediaGalleryBinding;
import com.hakanaktas.mediaplayerproject.databinding.ActivityPlayListsBinding;

import java.util.ArrayList;

public class PlayLists extends AppCompatActivity {
    public ActivityPlayListsBinding binding;
    ArrayList<Audio> songsList=new ArrayList<>();
    Audio audio ;
    MediaPlayer music;
    Button createPlaylistButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlayListsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        music = MediaPlayer.create(PlayLists.this,R.raw.blindidlights);
        audio = new Audio(Integer.toString(R.raw.blindidlights),"Blindid Lights",Integer.toString(music.getDuration()),R.drawable.weekndalbum,"The Weeknd" );
        songsList.add(audio);

        music = MediaPlayer.create(PlayLists.this,R.raw.daylight);
        audio = new Audio(Integer.toString(R.raw.daylight),"Daylight", Integer.toString(music.getDuration()),R.drawable.daylightalbum,"Joji" );
        songsList.add(audio);

        music = MediaPlayer.create(PlayLists.this,R.raw.gorobot);
        audio = new Audio(Integer.toString(R.raw.gorobot),"Go Robot", Integer.toString(music.getDuration()),R.drawable.gorobotalbum,"Red Hot Chilli Peppers" );
        songsList.add(audio);

        music = MediaPlayer.create(PlayLists.this,R.raw.karmapolice);
        audio = new Audio(Integer.toString(R.raw.karmapolice),"Karma Police", Integer.toString(music.getDuration()),R.drawable.karmapolicealbum,"Radiohead" );
        songsList.add(audio);

        music = MediaPlayer.create(PlayLists.this,R.raw.letithappen);
        audio = new Audio(Integer.toString(R.raw.letithappen),"Let It Happen", Integer.toString(music.getDuration()),R.drawable.letithappenalbum,"Tame Impala" );
        songsList.add(audio);

        music = MediaPlayer.create(PlayLists.this,R.raw.saveyourtears);
        audio = new Audio(Integer.toString(R.raw.saveyourtears),"Save Your Tears", Integer.toString(music.getDuration()),R.drawable.weekndalbum,"The Weeknd" );
        songsList.add(audio);

        music = MediaPlayer.create(PlayLists.this,R.raw.starlight);
        audio = new Audio(Integer.toString(R.raw.starlight),"Starlight", Integer.toString(music.getDuration()),R.drawable.musealbum,"Muse" );
        songsList.add(audio);

        music = MediaPlayer.create(PlayLists.this,R.raw.supermassiveblackhole);
        audio = new Audio(Integer.toString(R.raw.supermassiveblackhole),"Supermassive Black Hole", Integer.toString(music.getDuration()),R.drawable.musealbum,"Muse" );
        songsList.add(audio);

        music = MediaPlayer.create(PlayLists.this,R.raw.veridisquo);
        audio = new Audio(Integer.toString(R.raw.veridisquo),"Veridis Quo", Integer.toString(music.getDuration()),R.drawable.veridisquoalbum,"Daft Punk" );
        songsList.add(audio);

        String playlistTitle = getIntent().getStringExtra("PlaylistName");

        binding.recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView1.setAdapter(new MusicChooseAdapter(binding,songsList,getApplicationContext(),playlistTitle));
    }
}