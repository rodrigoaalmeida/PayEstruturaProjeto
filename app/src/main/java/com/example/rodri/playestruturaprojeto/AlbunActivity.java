package com.example.rodri.playestruturaprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlbunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_grid);

        final ArrayList<Music> musicList = getIntent().getParcelableArrayListExtra("musicList");

        //bloco de codigo para montagem de uma lista de albuns com apenas os albuns unicos
        //tirando assim as repetições
        int controle = 0;
        final ArrayList<Music> albunList = new ArrayList<>();
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

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sNameAlbun = albunList.get((int) parent.getItemIdAtPosition(position)).getNameAlbun();
                ArrayList<Music> musicAlbunList = new ArrayList<>();
                for (Music item : musicList){
                    if (sNameAlbun.equalsIgnoreCase(item.getNameAlbun())){
                        musicAlbunList.add(new Music(item.getImageMusicId(), item.getNameMusic(), item.getNameAlbun(), item.getNameArtist()));
                    }
                }
                Intent musicAlbunIntent = new Intent(AlbunActivity.this, MusicActivity.class);
                musicAlbunIntent.putParcelableArrayListExtra("musicList", musicAlbunList);
                startActivity(musicAlbunIntent);
            }
        });
    }
}
