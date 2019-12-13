package com.example.timnasplayer;

import android.os.Parcel;
import android.os.Parcelable;


public class KantorItem implements Parcelable {
    private String kantor, alamat, nomortlpn, Poster;

    public KantorItem(String kantor, String alamat, String nomortlpn, String Poster ) {
        this.kantor = kantor;
        this.alamat = alamat;
        this.nomortlpn = nomortlpn;
        this.Poster = Poster;
    }


    public String getKantor() {
        return kantor;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomortlpn(){
        return nomortlpn;
    }

    public String getPoster() {
        return Poster;
    }

    public void setKantor(String kantor) { this.kantor = kantor; }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomortlpn(String nomortlpn) {
        this.nomortlpn = nomortlpn;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.kantor);
        parcel.writeString(this.alamat);
        parcel.writeString(this.nomortlpn);
        parcel.writeString(this.Poster);
    }

    public KantorItem(){
    }

    protected KantorItem(Parcel in ){
        this.kantor = in.readString();
        this.alamat = in.readString();
        this.nomortlpn = in.readString();
        this.Poster = in.readString();
    }

    public static final Parcelable.Creator<KantorItem> CREATOR = new Parcelable.Creator<KantorItem>(){

        @Override
        public KantorItem createFromParcel(Parcel source) {
            return new KantorItem(source);
        }

        @Override
        public KantorItem[] newArray(int size) {
            return new KantorItem[size];
        }
    };
}