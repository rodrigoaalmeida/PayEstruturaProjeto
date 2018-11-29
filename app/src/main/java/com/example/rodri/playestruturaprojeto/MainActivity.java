package com.example.rodri.playestruturaprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView music = findViewById(R.id.text_music);
        TextView albun = findViewById(R.id.text_albun);
        TextView artista = findViewById(R.id.text_artista);
        TextView play = findViewById(R.id.text_play);

        final ArrayList<Music> musicList = new ArrayList<>();
        musicList.add(new Music(R.drawable.charlie_brown, "Senhor do Tempo", "Imunidade Musical", "Charlie Brown Jr."));
        musicList.add(new Music(R.drawable.charlie_brown, "Só os loucos sabem", "Camisa 10 Joga Bola Até na Chuva", "Charlie Brown Jr."));
        musicList.add(new Music(R.drawable.charlie_brown, "Papo reto", "Bocas Ordinárias", "Charlie Brown Jr."));
        musicList.add(new Music(R.drawable.charlie_brown, "Só por uma noite", "Bocas Ordinárias", "Charlie Brown Jr."));
        musicList.add(new Music(R.drawable.avril, "Darlin", "Goodbye Lullaby", "Avril Lavigne"));
        musicList.add(new Music(R.drawable.avril, "Girlfriend", "The Best Damn Thing", "Avril Lavigne"));
        musicList.add(new Music(R.drawable.avril, "Bad Reputation", "Goodbye Lullaby", "Avril Lavigne"));
        musicList.add(new Music(R.drawable.los_hermanos, "Anna Júlia", "Los Hermanos", "Los Hermanos"));
        musicList.add(new Music(R.drawable.nx_zero, "Apenas mais uma de amor", "Agora", "Nx Zero"));
        musicList.add(new Music(R.drawable.nx_zero, "Daqui pra frente", "Agora", "Nx Zero"));
        musicList.add(new Music(R.drawable.nx_zero, "Cartas pra você", "Agora", "Nx Zero"));
        musicList.add(new Music(R.drawable.nx_zero, "Diferenças", "Agora", "Nx Zero"));
        musicList.add(new Music(R.drawable.nx_zero, "Só rezo", "Sete Chaves", "Nx Zero"));
        musicList.add(new Music(R.drawable.nx_zero, "Cedo ou tarde", "Agora", "Nx Zero"));
        musicList.add(new Music(R.drawable.pitty, "Na sua estante", "Anacrônico", "Pitty"));
        musicList.add(new Music(R.drawable.pitty, "Equalize", "Admirável Chip Novo", "Pitty"));
        musicList.add(new Music(R.drawable.pitty, "Memórias", "Anacrônico", "Pitty"));
        musicList.add(new Music(R.drawable.pitty, "Semana que vem", "Admirável Chip Novo", "Pitty"));
        musicList.add(new Music(R.drawable.pitty, "Teto de vidro", "Admirável Chip Novo", "Pitty"));
        musicList.add(new Music(R.drawable.titas, "Epitáfio", "A Melhor Banda de Todos os Tempos da Última Semana", "Titãs"));
        musicList.add(new Music(R.drawable.titas, "Porque eu sei que é amor", "Sacos Plásticos", "Titãs"));
        musicList.add(new Music(R.drawable.titas, "É preciso saber viver", "Volume Dois", "Titãs"));
        musicList.add(new Music(R.drawable.cazuza, "O tempo não pára", "O tempo não pára", "Cazuza"));
        musicList.add(new Music(R.drawable.cazuza, "Exagerado", "Exagerado", "Cazuza"));
        musicList.add(new Music(R.drawable.cazuza, "Bete balanço", "Maior Abandonado", "Cazuza"));
        musicList.add(new Music(R.drawable.cazuza, "Pro dia nascer feliz", "Barão vermelho 2", "Cazuza"));

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);
                musicIntent.putParcelableArrayListExtra("musicList", musicList);
                startActivity(musicIntent);
            }
        });

        albun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albunIntent = new Intent(MainActivity.this, AlbunActivity.class);
                albunIntent.putParcelableArrayListExtra("musicList", musicList);
                startActivity(albunIntent);
            }
        });

        artista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                artistIntent.putParcelableArrayListExtra("musicList", musicList);
                startActivity(artistIntent);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(MainActivity.this, PlayMusicActivity.class);
                playIntent.putParcelableArrayListExtra("playMusic", musicList);
                startActivity(playIntent);
            }
        });
    }
}
