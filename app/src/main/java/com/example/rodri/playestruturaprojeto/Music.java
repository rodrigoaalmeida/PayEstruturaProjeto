package com.example.rodri.playestruturaprojeto;

public class Music {

    private int mImageMusicId;
    private String mNameMusic;
    private String mNameArtist;

    public Music(int imageMusicId, String nameMusic, String nameArtist){
        mImageMusicId = imageMusicId;
        mNameMusic = nameMusic;
        mNameArtist = nameArtist;
    }

    public Music(int imageMusicId, String nameArtist){
        mImageMusicId = imageMusicId;
        mNameArtist = nameArtist;
    }

    public int getImageMusicId() {
        return mImageMusicId;
    }

    public String getNameMusic() {
        return mNameMusic;
    }

    public String getNameArtist() {
        return mNameArtist;
    }
}
