package com.example.rodri.playestruturaprojeto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridAdapter extends ArrayAdapter<Music> {

    private int mTipo = 0;

    public GridAdapter(Context context, List<Music> musicList, int tipo) {
        super(context, 0, musicList);
        mTipo = tipo;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listViewItem = convertView;
        if (listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.grid_layout, parent, false);
        }

        Music atualMusic = getItem(position);

        ImageView musicImage = listViewItem.findViewById(R.id.image_grid);
        musicImage.setImageResource(atualMusic.getImageMusicId());

        TextView nameAlbun = listViewItem.findViewById(R.id.name_grid);
        if (mTipo == 1){
            nameAlbun.setText(atualMusic.getNameAlbun());
            nameAlbun.setVisibility(View.VISIBLE);
        }else {
            nameAlbun.setVisibility(View.GONE);
        }

        TextView nameArtist = listViewItem.findViewById(R.id.grid_name_artist);
        nameArtist.setText(atualMusic.getNameArtist());

        return listViewItem;
    }
}
