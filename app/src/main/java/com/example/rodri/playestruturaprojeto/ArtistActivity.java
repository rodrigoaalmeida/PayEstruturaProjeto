package com.example.rodri.playestruturaprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_grid);

        final ArrayList<Music> musicList = getIntent().getParcelableArrayListExtra("musicList");

        //bloco de codigo para montagem de uma lista de artistas com apenas os artistas unicos
        //tirando assim as repetições
        int controle = 0;
        final ArrayList<Music> artistList = new ArrayList<>();
        String nameArtist = "";
        artistList.add(new Music(musicList.get(0).getImageMusicId(), musicList.get(0).getNameMusic(), musicList.get(0).getNameAlbun(), musicList.get(0).getNameArtist()));
        for (Music item : musicList) {
            if (!nameArtist.equalsIgnoreCase(item.getNameArtist())) {
                nameArtist = item.getNameArtist();
                for (Music artist : artistList) {
                    if (nameArtist.equalsIgnoreCase(artist.getNameArtist())) {
                        controle = 0;
                        break;
                    } else {
                        controle = 1;
                    }
                }
                if (controle == 1) {
                    artistList.add(new Music(item.getImageMusicId(), item.getNameMusic(), item.getNameAlbun(), item.getNameArtist()));

                }
            }
        }

        GridAdapter adapter = new GridAdapter(this, artistList, 0);

        GridView gridView = findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);

        //bloco de codigo que pega o nome do artista e mostra apenas as musicas referentes a ele
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sNameArtist = artistList.get((int) parent.getItemIdAtPosition(position)).getNameArtist();
                ArrayList<Music> musicArtistList = new ArrayList<>();
                for (Music item : musicList) {
                    if (sNameArtist.equalsIgnoreCase(item.getNameArtist())) {
                        musicArtistList.add(new Music(item.getImageMusicId(), item.getNameMusic(), item.getNameAlbun(), item.getNameArtist()));
                    }
                }
                Intent musicArtistIntent = new Intent(ArtistActivity.this, MusicActivity.class);
                musicArtistIntent.putParcelableArrayListExtra("musicList", musicArtistList);
                startActivity(musicArtistIntent);
            }
        });
    }
}
