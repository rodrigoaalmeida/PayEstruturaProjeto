package com.example.rodri.playestruturaprojeto;

import android.os.Parcel;
import android.os.Parcelable;

public class Music implements Parcelable {

    //https://pt.stackoverflow.com/questions/27175/enviar-um-arraylist-de-objetos-para-uma-activity

    private int mImageMusicId;
    private String mNameMusic;
    private String mNameAlbun;
    private String mNameArtist;

    public Music(int imageMusicId, String nameMusic, String nameAlbun, String nameArtist) {
        mImageMusicId = imageMusicId;
        mNameMusic = nameMusic;
        mNameAlbun = nameAlbun;
        mNameArtist = nameArtist;
    }

    public Music(Parcel in) {
        mImageMusicId = in.readInt();
        mNameMusic = in.readString();
        mNameAlbun = in.readString();
        mNameArtist = in.readString();
    }

    public int getImageMusicId() {
        return mImageMusicId;
    }

    public String getNameMusic() {
        return mNameMusic;
    }

    public String getNameAlbun() {
        return mNameAlbun;
    }

    public String getNameArtist() {
        return mNameArtist;
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Music createFromParcel(Parcel in) {
            return new Music(in);
        }

        public Music[] newArray(int size) {
            return new Music[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageMusicId);
        dest.writeString(mNameMusic);
        dest.writeString(mNameAlbun);
        dest.writeString(mNameArtist);
    }

    @Override
    public String toString() {
        return mNameMusic;
    }

}
