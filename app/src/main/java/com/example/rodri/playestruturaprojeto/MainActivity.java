package com.example.rodri.playestruturaprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView music = findViewById(R.id.text_music);
        TextView albun = findViewById(R.id.text_albun);
        TextView artista = findViewById(R.id.text_artista);
        TextView play = findViewById(R.id.text_play);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(musicIntent);
            }
        });

        albun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albunIntent = new Intent(MainActivity.this, AlbunActivity.class);
                startActivity(albunIntent);
            }
        });

        artista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(MainActivity.this, PlayMusicActivity.class);
                startActivity(playIntent);
            }
        });
    }
}
