package com.example.rodri.playestruturaprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ArrayList<Music> albunList = new ArrayList<>();
        albunList.add(new Music(R.drawable.number_ten, "Senhor do tempo", "Charlie Brown Jr."));
        albunList.add(new Music(R.drawable.number_ten, "Darlin", "Avril Lavigne"));
        albunList.add(new Music(R.drawable.number_ten, "Anna Júlia", "Los Hermanos"));
        albunList.add(new Music(R.drawable.number_ten, "Apenas mais uma", "Nx Zero"));
        albunList.add(new Music(R.drawable.number_ten, "Na sua estante", "Pitty"));
        albunList.add(new Music(R.drawable.number_ten, "Epitáfio", "Titãs"));
        albunList.add(new Music(R.drawable.number_ten, "O tempo não pára", "Cazuza"));

        GridAdapter adapter = new GridAdapter(this, albunList);

        GridView gridView = findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);
    }
}
