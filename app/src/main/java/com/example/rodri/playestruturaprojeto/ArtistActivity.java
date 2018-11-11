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

        ArrayList<Music> musicList = getIntent().getParcelableArrayListExtra("musicList");

        GridAdapter adapter = new GridAdapter(this, musicList, 0);

        GridView gridView = findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);
    }
}
