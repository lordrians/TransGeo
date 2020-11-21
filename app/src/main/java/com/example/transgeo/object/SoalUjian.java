package com.example.transgeo.object;

import java.util.ArrayList;
import java.util.Random;

public class SoalUjian {

    //html location
    public static final String BASE_LOCATION_HTML = "file:///android_asset/ujian/";

    public static final String HTML_Soal1 = BASE_LOCATION_HTML +"Soal_1.html";
    public static final String HTML_Soal2 = BASE_LOCATION_HTML +"Soal_2.html";
    public static final String HTML_Soal3 = BASE_LOCATION_HTML +"Soal_3.html";
    public static final String HTML_Soal4 = BASE_LOCATION_HTML +"Soal_4.html";
    public static final String HTML_Soal5 = BASE_LOCATION_HTML +"Soal_5.html";

    private static String[] soal = {
            HTML_Soal1,
            HTML_Soal2,
            HTML_Soal3,
            HTML_Soal4,
            HTML_Soal5
    };

    private static String[] pgA = {
            "A. A’(2, -2)",
            "A. 5 dan -7",
            "A. R”(10, 12)",
            "A. S’(-30, 25)",
            "A. 5 dan 9"
    };

    private static String[] pgB = {
            "B. A’(2,-16)",
            "B. 5 dan 23",
            "B. R”(12, 10)",
            "B. S’(-25, 30)",
            "B. 5 dan 11"
    };

    private static String[] pgC = {
            "C. A’(-14, -2)",
            "C. -7 dan 23",
            "C. R”(14, 16)",
            "C. S’(25, 30)",
            "C. -1 dan 9"
    };

    private static String[] pgD = {
            "D. A’(-14, -16)",
            "D. -7 dan 45",
            "D. R”(16,14)",
            "D. S’(30, -25)",
            "D. -1 dan 11"
    };

    private static String[] correctAns = {
            "B. A’(2,-16)",
            "B. 5 dan 23",
            "B. R”(12, 10)",
            "D. S’(30, -25)",
            "D. -1 dan 11"
    };

    private static String[] photoSoal = {
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            ""
    };

    public static ArrayList<Soal> getSoalUjian(){
        ArrayList<Soal> list = new ArrayList<>();
        for (int i = 0; i < soal.length; i++){
            Soal question = new Soal();
            question.setSoal(soal[i]);
            question.setPgA(pgA[i]);
            question.setPgB(pgB[i]);
            question.setPgC(pgC[i]);
            question.setPgD(pgD[i]);
            question.setCorrectAns(correctAns[i]);
            question.setPhotoSoal(photoSoal[i]);
            list.add(question);

        }
        return list;
    }

    public static ArrayList<Soal> randSoal(){
        Random rand = new Random();
        ArrayList<Soal> soalAwal = getSoalUjian();

        ArrayList<Soal> randomSoal = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            int randomIndex = rand.nextInt(soalAwal.size());

            randomSoal.add(soalAwal.get(randomIndex));

            soalAwal.remove(randomIndex);

        }
        return randomSoal;
    }

}
