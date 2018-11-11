package com.example.rodri.playestruturaprojeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_music);

        final ArrayList<Music> musicList = getIntent().getParcelableArrayListExtra("musicList");

        AdapterMusic adapter = new AdapterMusic(this, musicList);

        ListView listView = findViewById(R.id.list_music);

        listView.setAdapter(adapter);

        //https://stackoverflow.com/questions/8615417/how-can-i-set-onclicklistener-on-arrayadapter
        //onclick da lista de musicas
        //retorna em um array de um unico objeto a musica clicada para o play
        //que vai mostrar o nome da musica, nome do artista e a imagem da musica
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //o evento recupera a posição da musica na lista que vem em forma de endereço
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Nova lista para a musica clicada ser armazenada
                ArrayList<Music> playMusic = new ArrayList<>();
                //o for é usado para pecorrer a lista de musicas para achar a musica clicada
                for (Music play : musicList) {
                    //o if compara o nome da musica recuperado pelo toString com os nomes na lista
                    if (parent.getItemAtPosition(position).toString().equalsIgnoreCase(play.getNameMusic())) {
                        //adiciona ela no novo array e o break para encerra o loop
                        playMusic.add(new Music(play.getImageMusicId(), play.getNameMusic(), play.getNameAlbun(), play.getNameArtist()));
                        break;
                    }
                }
                //chama o play de musica e passa os dados da musica a ser executada
                Intent playIntent = new Intent(MusicActivity.this, PlayMusicActivity.class);
                playIntent.putParcelableArrayListExtra("playMusic", playMusic);
                startActivity(playIntent);
            }
        });
    }
}
