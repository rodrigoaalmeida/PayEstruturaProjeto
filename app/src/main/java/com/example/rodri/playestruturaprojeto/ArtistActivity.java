package com.example.rodri.playestruturaprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_grid);

        ArrayList<Music> musicList = getIntent().getParcelableArrayListExtra("musicList");

        int controle = 0;
        ArrayList<Music> artistList = new ArrayList<>();
        String nameArtist = "";
        artistList.add(new Music(musicList.get(0).getImageMusicId(), musicList.get(0).getNameMusic(), musicList.get(0).getNameAlbun(), musicList.get(0).getNameArtist()));
        for (Music item : musicList) {
            if (!nameArtist.equalsIgnoreCase(item.getNameArtist())) {
                nameArtist = item.getNameArtist();
                for (Music artist : artistList) {
                    if (nameArtist.equalsIgnoreCase(artist.getNameArtist())) {
                        controle = 0;
                        break;
                    }else {
                        controle = 1;
                    }
                }
                if (controle == 1){
                    artistList.add(new Music(item.getImageMusicId(), item.getNameMusic(), item.getNameAlbun(), item.getNameArtist()));

                }
            }
        }

        GridAdapter adapter = new GridAdapter(this, artistList, 0);

        GridView gridView = findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);
    }
}
