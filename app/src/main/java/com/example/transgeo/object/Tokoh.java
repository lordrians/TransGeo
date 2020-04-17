package com.example.transgeo.object;

import android.os.Parcel;
import android.os.Parcelable;

public class Tokoh implements Parcelable {
    private String nama, bidang, poto,deksripsi;

    public Tokoh(String nama, String bidang, String poto, String deksripsi) {
        this.nama = nama;
        this.bidang = bidang;
        this.poto = poto;
        this.deksripsi = deksripsi;
    }

    public Tokoh() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getPoto() {
        return poto;
    }

    public void setPoto(String poto) {
        this.poto = poto;
    }

    public String getDeksripsi() {
        return deksripsi;
    }

    public void setDeksripsi(String deksripsi) {
        this.deksripsi = deksripsi;
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    protected Tokoh(Parcel in) {
        nama = in.readString();
        bidang = in.readString();
        poto = in.readString();
        deksripsi = in.readString();
    }

    public static final Creator<Tokoh> CREATOR = new Creator<Tokoh>() {
        @Override
        public Tokoh createFromParcel(Parcel in) {
            return new Tokoh(in);
        }

        @Override
        public Tokoh[] newArray(int size) {
            return new Tokoh[size];
        }
    };

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(bidang);
        parcel.writeString(poto);
        parcel.writeString(deksripsi);
    }
}
