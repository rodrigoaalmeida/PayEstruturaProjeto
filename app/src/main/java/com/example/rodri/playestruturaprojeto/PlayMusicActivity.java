package com.example.rodri.playestruturaprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlayMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        ImageView buttonPrevious = findViewById(R.id.button_previous_play);
        ImageView buttonNext = findViewById(R.id.button_next_play);
        final ImageView buttonPause = findViewById(R.id.button_pause_play);
        final ImageView buttonPlay = findViewById(R.id.button_play_play);

        buttonPause.setVisibility(View.GONE);

        final ArrayList<Music> playMusic = getIntent().getParcelableArrayListExtra("playMusic");

        ImageView imageView = findViewById(R.id.image_play);
        TextView musicView = findViewById(R.id.music_play);
        TextView artistView = findViewById(R.id.artist_play);

        imageView.setImageResource(playMusic.get(0).getImageMusicId());
        musicView.setText(playMusic.get(0).getNameMusic());
        artistView.setText(playMusic.get(0).getNameArtist());

        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Musica Anterior", Toast.LENGTH_SHORT).show();
            }
        });

        buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Musica Pausada", Toast.LENGTH_SHORT).show();
                buttonPlay.setVisibility(View.VISIBLE);
                buttonPause.setVisibility(View.GONE);
            }
        });

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Musica em execução", Toast.LENGTH_SHORT).show();
                buttonPlay.setVisibility(View.GONE);
                buttonPause.setVisibility(View.VISIBLE);
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Próxima musica", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
