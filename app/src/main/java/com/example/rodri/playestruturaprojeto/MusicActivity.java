package com.example.rodri.playestruturaprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_music);

        ArrayList<Music> musicList = new ArrayList<>();
        musicList.add(new Music(R.drawable.number_nine, "Senhor do tempo", "Charlie Brown Jr."));
        musicList.add(new Music(R.drawable.number_nine, "Só os loucos sabem", "Charlie Brown Jr."));
        musicList.add(new Music(R.drawable.number_nine, "Papo reto", "Charlie Brown Jr."));
        musicList.add(new Music(R.drawable.number_nine, "Só por uma noite", "Charlie Brown Jr."));
        musicList.add(new Music(R.drawable.number_nine, "Darlin", "Avril Lavigne"));
        musicList.add(new Music(R.drawable.number_nine, "Girlfriend", "Avril Lavigne"));
        musicList.add(new Music(R.drawable.number_nine, "Bad Reputation", "Avril Lavigne"));
        musicList.add(new Music(R.drawable.number_nine, "Anna Júlia", "Los Hermanos"));
        musicList.add(new Music(R.drawable.number_nine, "Apenas mais uma de amor", "Nx Zero"));
        musicList.add(new Music(R.drawable.number_nine, "Daqui pra frente", "Nx Zero"));
        musicList.add(new Music(R.drawable.number_nine, "Cartas pra você", "Nx Zero"));
        musicList.add(new Music(R.drawable.number_nine, "Diferenças", "Nx Zero"));
        musicList.add(new Music(R.drawable.number_nine, "Só rezo", "Nx Zero"));
        musicList.add(new Music(R.drawable.number_nine, "Cedo ou tarde", "Nx Zero"));
        musicList.add(new Music(R.drawable.number_nine, "Na sua estante", "Pitty"));
        musicList.add(new Music(R.drawable.number_nine, "Equalize", "Pitty"));
        musicList.add(new Music(R.drawable.number_nine, "Memórias", "Pitty"));
        musicList.add(new Music(R.drawable.number_nine, "Semana que vem", "Pitty"));
        musicList.add(new Music(R.drawable.number_nine, "Teto de vidro", "Pitty"));
        musicList.add(new Music(R.drawable.number_nine, "Epitáfio", "Titãs"));
        musicList.add(new Music(R.drawable.number_nine, "Porque eu sei que é amor", "Titãs"));
        musicList.add(new Music(R.drawable.number_nine, "É preciso saber viver", "Titãs"));
        musicList.add(new Music(R.drawable.number_nine, "O tempo não pára", "Cazuza"));
        musicList.add(new Music(R.drawable.number_nine, "Exagerado", "Cazuza"));
        musicList.add(new Music(R.drawable.number_nine, "Bete balanço", "Cazuza"));
        musicList.add(new Music(R.drawable.number_nine, "Pro dia nascer feliz", "Cazuza"));

        AdapterMusic adapter = new AdapterMusic(this, musicList);

        ListView listView = findViewById(R.id.list_music);

        listView.setAdapter(adapter);
    }
}
