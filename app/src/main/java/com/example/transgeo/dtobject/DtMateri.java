package com.example.transgeo.dtobject;

import com.example.transgeo.object.Materi;

import java.util.ArrayList;

public class DtMateri {



    private static String[] isiRefleksi = {
            "Pencerminan (Refleksi) adalah suatu transformasi yang memindahkan setiap titik pada bidang dengan dengan menggunakan sifat bayangan cermim.",
            "-> Dua refleksi berturut-turut terhadap sebuah garis merupakan suatu identitas, artinya yang direfleksikan tidak berpindah.\n" +
                    "-> Pengerjaan dua refleksi terhadap dua sumbu yang sejajar, menghasilkan translasi (pergeseran) dengan sifat:\n" +
                    "   1. Jarak bangun asli dengan bangun hasil sama dengan dua kali jarak kedua sumbu pencerminan.\n" +
                    "   2. Arah translasi tegak lurus pada kedua sumbu sejajar, dari sumbu pertama ke sumbu kedua. Refleksi terhadap dua sumbu sejajar bersifat tidak komutatip.\n" +
                    "-> Pengerjaaan dua refleksi terhadap dua sumbu yang saling tegak lurus, menghasilkaan rotasi (pemutaran) setengah lingkaran terhadap titik potong dari kedua sumbu pencerminan. Refleksi terhadap dua sumbu yang saling tegak lures bersifat komutatif.\n" +
                    "-> Pengerjaan dua refleksi berurutan terhadap dua sumbu yang berpotongan akan menghasilkan rotasi (perputaran) yang bersifat:\n" +
                    "   1. Titik potong kedua sumbu pencerminan merupakan pusat perputaran.\n" +
                    "   2. Besar sudut perputaran sama dengan dua kali sudut antara kedua sumbu pencerminan.\n" +
                    "   3. Arah perputaran sama dengan arah dari sumbu pertama ke sumbu kedua.",
            "lANGKAH REFLEKSI",
            "CONTOH REFLEKSI"
    };

    private static String[] photoRefleksi = {
            "https://www.yuksinau.id/wp-content/uploads/2019/07/makalah-transformasi-geometri.jpg",
            "https://elnicovengeance.files.wordpress.com/2013/01/011913_1348_refleksipen1.png",
            "https://drive.google.com/uc?id=1W-_9ULmWApuwZhyzQn_GP82TS4N3fC7u",
            "https://drive.google.com/uc?id=1hWK6rSDNQMXuQm_ttglHxkLMM_eGCf6I"
    };

    private static String[] isiTranslasi = {
            "PENGERTIAN TRANSLASI" +
                    "adi, panjang AB = A’B’\n" +
                    "\tAA’ tegak lurus KL\n" +
                    "\tBB’ tegak lurus KL\tmaka AA’ ⟺ BB’\n" +
                    "<i>Dengan demikian, dapat disimpulkan sebagai berikut</i>" +
                    "Pada refleksi sumbu- x, diperoleh: <sup>2</sup>&frasl<sub>6</sub>\n" +
                    "\tA(4, 2) ⟺ A’(4, -2)\n" +
                    "\tJadi, P(a, b) ⟺ P’(a, -b)\n" +
                    "Pada refleksi sumbu- y, diperoleh:\n" +
                    "\tA(4, 2) ⟺ A”(-4, 2)\n" +
                    "\tJadi, P(a, b) ⟺ P’(-a, b)\n" +
                    "Dengan demikian, dapat disimpulkan sebagai berikut." +
                    "Bayangan titik A(x, y) pada translasi  adalah A’(x + a, y + b)",
            "SYARAT TRANSLASI",
            "lANGKAH TRANSLASI",
            "CONTOH TRANSLASI"
    };

    private static String[] photoTranslasi = {
            "https://elnicovengeance.files.wordpress.com/2013/01/011913_1348_refleksipen1.png",
            "https://drive.google.com/uc?id=1Yup-Ig6pEBMy7x1Dkudf7rWYVcb-DaUb",
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
            "https://elnicovengeance.files.wordpress.com/2013/01/011913_1348_refleksipen1.png",
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
            "https://elnicovengeance.files.wordpress.com/2013/01/011913_1348_refleksipen1.png",
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
