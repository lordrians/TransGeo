package com.example.transgeo.dtobject;

import android.content.SharedPreferences;

import com.example.transgeo.activity.*;
import com.example.transgeo.object.Materi;

import java.util.ArrayList;

public class DtMateri {



    private static String[] isiRefleksi = {
            "PENGERTIAN",
            "SYARAT",
            "lANGKAH",
            "CONTOH"
    };

    private static String[] photoRefleksi = {
            "https://drive.google.com/uc?id=1O_OX_tQ5c8chJf8GNOPmeg4PSYO8UGiJ",
            "https://drive.google.com/uc?id=1i8KecB_qGxGIxlItPQQmIieUX3pNZwq9",
            "https://drive.google.com/uc?id=1W-_9ULmWApuwZhyzQn_GP82TS4N3fC7u",
            "https://drive.google.com/uc?id=1hWK6rSDNQMXuQm_ttglHxkLMM_eGCf6I"
    };

    private static String[] isiTranslasi = {
            "PENGERTIAN",
            "SYARAT",
            "lANGKAH",
            "CONTOH"
    };

    private static String[] photoTranslasi = {
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8"
    };

    private static String[] isiDilatasi = {
            "PENGERTIAN",
            "SYARAT",
            "lANGKAH",
            "CONTOH"
    };

    private static String[] photoDilatasi = {
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8"
    };

    private static String[] isiRotasi = {
            "PENGERTIAN",
            "SYARAT",
            "lANGKAH",
            "CONTOH"
    };

    private static String[] photoRotasi = {
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8"
    };


    public static ArrayList<Materi> getDataRefleksi(){
        ArrayList<Materi> list = new ArrayList();
        for (int i = 0; i < isiRefleksi.length ; i++){
            Materi materi = new Materi();
            materi.setIsiMateri(isiRefleksi[i]);
            materi.setPhoto(photoRefleksi[i]);
            list.add(materi);

        }
        return list;
    }

    public static ArrayList<Materi> getDataTranslasi(){
        ArrayList<Materi> list = new ArrayList();
        for (int i = 0; i < isiTranslasi.length ; i++){
            Materi materi = new Materi();
            materi.setIsiMateri(isiRefleksi[i]);
            materi.setPhoto(photoRefleksi[i]);
            list.add(materi);

        }
        return list;
    }

}
