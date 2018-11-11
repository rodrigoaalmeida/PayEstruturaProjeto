package com.example.rodri.playestruturaprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        final ArrayList<Music> playMusic = getIntent().getParcelableArrayListExtra("playMusic");

        ImageView imageView = findViewById(R.id.image_play);
        TextView musicView  = findViewById(R.id.music_play);
        TextView artistView = findViewById(R.id.artist_play);

        imageView.setImageResource(playMusic.get(0).getImageMusicId());
        musicView.setText(playMusic.get(0).getNameMusic());
        artistView.setText(playMusic.get(0).getNameArtist());
    }
}
