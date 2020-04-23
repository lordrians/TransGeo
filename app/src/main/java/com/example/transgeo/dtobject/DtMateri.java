package com.example.transgeo.dtobject;

import com.example.transgeo.object.Materi;

import java.util.ArrayList;

public class DtMateri {



    private static String[] isiRefleksi = {
            "PENGERTIAN REFLEKSI",
            "SYARAT REFLEKSI",
            "lANGKAH REFLEKSI",
            "CONTOH REFLEKSI"
    };

    private static String[] photoRefleksi = {
            "https://drive.google.com/uc?id=1O_OX_tQ5c8chJf8GNOPmeg4PSYO8UGiJ",
            "https://drive.google.com/uc?id=1i8KecB_qGxGIxlItPQQmIieUX3pNZwq9",
            "https://drive.google.com/uc?id=1W-_9ULmWApuwZhyzQn_GP82TS4N3fC7u",
            "https://drive.google.com/uc?id=1hWK6rSDNQMXuQm_ttglHxkLMM_eGCf6I"
    };

    private static String[] isiTranslasi = {
            "PENGERTIAN TRANSLASI",
            "SYARAT TRANSLASI",
            "lANGKAH TRANSLASI",
            "CONTOH TRANSLASI"
    };

    private static String[] photoTranslasi = {
            "https://drive.google.com/uc?id=1O_OX_tQ5c8chJf8GNOPmeg4PSYO8UGiJ",
            "https://drive.google.com/uc?id=1i8KecB_qGxGIxlItPQQmIieUX3pNZwq9",
            "https://drive.google.com/uc?id=1W-_9ULmWApuwZhyzQn_GP82TS4N3fC7u",
            "https://drive.google.com/uc?id=1hWK6rSDNQMXuQm_ttglHxkLMM_eGCf6I"
    };

    private static String[] isiDilatasi = {
            "PENGERTIAN DILATASI",
            "SYARAT DILATASI",
            "lANGKAH DILATASI",
            "CONTOH DILATASI"
    };

    private static String[] photoDilatasi = {
            "https://drive.google.com/uc?id=1O_OX_tQ5c8chJf8GNOPmeg4PSYO8UGiJ",
            "https://drive.google.com/uc?id=1i8KecB_qGxGIxlItPQQmIieUX3pNZwq9",
            "https://drive.google.com/uc?id=1W-_9ULmWApuwZhyzQn_GP82TS4N3fC7u",
            "https://drive.google.com/uc?id=1hWK6rSDNQMXuQm_ttglHxkLMM_eGCf6I"
    };

    private static String[] isiRotasi = {
            "PENGERTIAN ROTASI",
            "SYARAT ROTASI",
            "lANGKAH ROTASI",
            "CONTOH ROTASI"
    };

    private static String[] photoRotasi = {
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8",
            "https://drive.google.com/uc?id=1-heByntq9DUOUQiQKGcZ39JZiFnPzRQ8"
    };

    private static String[] idVideo = {
            "AShoZP8ZYO4",
            "_yeNs4O3M3M",
            "k_RGlS9uLMQ",
            "OtzluC8qPds"
    };


    public static ArrayList<Materi> getVideo(){
        ArrayList<Materi> list = new ArrayList();
        for (int i = 0; i < idVideo.length ; i++){
            Materi materi = new Materi();
            materi.setVideo(idVideo[i]);
            list.add(materi);

        }
        return list;
    }


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

    public static ArrayList<Materi> getDataRotasi(){
        ArrayList<Materi> list = new ArrayList();
        for (int i = 0; i < isiRotasi.length ; i++){
            Materi materi = new Materi();
            materi.setIsiMateri(isiRotasi[i]);
            materi.setPhoto(photoRotasi[i]);
            list.add(materi);

        }
        return list;
    }

    public static ArrayList<Materi> getDataTranslasi(){
        ArrayList<Materi> list = new ArrayList();
        for (int i = 0; i < isiTranslasi.length ; i++){
            Materi materi = new Materi();
            materi.setIsiMateri(isiTranslasi[i]);
            materi.setPhoto(photoTranslasi[i]);
            list.add(materi);

        }
        return list;
    }

    public static ArrayList<Materi> getDataDilatasi(){
        ArrayList<Materi> list = new ArrayList();
        for (int i = 0; i < isiDilatasi.length ; i++){
            Materi materi = new Materi();
            materi.setIsiMateri(isiDilatasi[i]);
            materi.setPhoto(photoDilatasi[i]);
            list.add(materi);

        }
        return list;
    }
}
