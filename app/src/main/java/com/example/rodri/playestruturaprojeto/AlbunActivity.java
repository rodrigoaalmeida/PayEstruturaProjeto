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

        ArrayList<Music> musicList = getIntent().getParcelableArrayListExtra("musicList");

        //bloco de codigo para montagem de uma lista de albuns com apenas os albuns unicos
        //tirando assim as repetições
        int controle = 0;
        ArrayList<Music> albunList = new ArrayList<>();
        String nameAlbun = "";
        albunList.add(new Music(musicList.get(0).getImageMusicId(), musicList.get(0).getNameMusic(), musicList.get(0).getNameAlbun(), musicList.get(0).getNameArtist()));
        for (Music item : musicList) {
            if (!nameAlbun.equalsIgnoreCase(item.getNameAlbun())) {
                nameAlbun = item.getNameAlbun();
                for (Music albun : albunList) {
                    if (nameAlbun.equalsIgnoreCase(albun.getNameAlbun())) {
                        controle = 0;
                        break;
                    }else {
                        controle = 1;
                    }
                }
                if (controle == 1){
                        albunList.add(new Music(item.getImageMusicId(), item.getNameMusic(), item.getNameAlbun(), item.getNameArtist()));

                }
            }
        }

        GridAdapter adapter = new GridAdapter(this, albunList, 1);

        GridView gridView = findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);
    }
}
