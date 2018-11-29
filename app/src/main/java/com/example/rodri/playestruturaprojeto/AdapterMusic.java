package com.example.rodri.playestruturaprojeto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMusic extends ArrayAdapter<Music> {

    public AdapterMusic(Context context, List<Music> musicList) {
        super(context, 0, musicList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.activity_music, parent, false);
        }


        Music atualMusic = getItem(position);

        ImageView musicImage = listViewItem.findViewById(R.id.image_music);
        musicImage.setImageResource(atualMusic.getImageMusicId());

        TextView nameMusic = listViewItem.findViewById(R.id.name_music);
        nameMusic.setText(atualMusic.getNameMusic());
        nameMusic.setVisibility(View.VISIBLE);


        TextView nameArtist = listViewItem.findViewById(R.id.name_artist);
        nameArtist.setText(atualMusic.getNameArtist());

        return listViewItem;
    }
}
