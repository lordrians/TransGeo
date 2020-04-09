package com.example.transgeo.dtobject;

import com.example.transgeo.object.Tokoh;

import java.util.ArrayList;

public class dtTokoh {
    private static String[] nama = {
            "Adhar Rizky M.",
            "Adhar Rizky M.",
            "Adhar Rizky M.",
            "Adhar Rizky M.",
            "Adhar Rizky M.",
            "Adhar Rizky M."
    };

    private static String[] bidang = {
            "Master Filsafat",
            "Master Filsafat",
            "Master Filsafat",
            "Master Filsafat",
            "Master Filsafat",
            "Master Filsafat"
    };

    private static String[] poto = {
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg"
    };

    private static String[] deskripsi = {
            "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya",
            "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya",
            "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya",
            "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya",
            "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya",
            "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya" +
                    "Dia adalah penemu geometri pertama didunia , sebelum firaun lahir ferian telah menciptakan ilmu tersebut , ini contoh ya"
    };


    public static ArrayList<Tokoh> getData(){
        ArrayList<Tokoh> arrayList = new ArrayList<>();
        for (int i = 0; i < nama.length; i++){
            Tokoh tokoh = new Tokoh();
            tokoh.setNama(nama[i]);
            tokoh.setBidang(bidang[i]);
            tokoh.setDeksripsi(deskripsi[i]);
            tokoh.setPoto(poto[i]);
            arrayList.add(tokoh);
        }
        return arrayList;
    }

}
