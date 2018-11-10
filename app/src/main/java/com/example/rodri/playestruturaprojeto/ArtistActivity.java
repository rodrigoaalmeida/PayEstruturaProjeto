package com.example.rodri.playestruturaprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ArrayList<Music> artistList = new ArrayList<>();
        artistList.add(new Music(R.drawable.number_ten, "Senhor do tempo", "Charlie Brown Jr."));
        artistList.add(new Music(R.drawable.number_ten, "Darlin", "Avril Lavigne"));
        artistList.add(new Music(R.drawable.number_ten, "Anna Júlia", "Los Hermanos"));
        artistList.add(new Music(R.drawable.number_ten, "Apenas mais uma", "Nx Zero"));
        artistList.add(new Music(R.drawable.number_ten, "Na sua estante", "Pitty"));
        artistList.add(new Music(R.drawable.number_ten, "Epitáfio", "Titãs"));
        artistList.add(new Music(R.drawable.number_ten, "O tempo não pára", "Cazuza"));

        GridAdapter adapter = new GridAdapter(this, artistList);

        GridView gridView = findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);
    }
}
