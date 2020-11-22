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
    public static final String HTML_Soal6 = BASE_LOCATION_HTML +"Soal_6.html";
    public static final String HTML_Soal7 = BASE_LOCATION_HTML +"Soal_7.html";
    public static final String HTML_Soal8 = BASE_LOCATION_HTML +"Soal_8.html";
    public static final String HTML_Soal9 = BASE_LOCATION_HTML +"Soal_9.html";
    public static final String HTML_Soal10 = BASE_LOCATION_HTML +"Soal_10.html";
    public static final String HTML_Soal11 = BASE_LOCATION_HTML +"Soal_11.html";
    public static final String HTML_Soal12 = BASE_LOCATION_HTML +"Soal_12.html";
    public static final String HTML_Soal13 = BASE_LOCATION_HTML +"Soal_13.html";
    public static final String HTML_Soal14 = BASE_LOCATION_HTML +"Soal_14.html";
    public static final String HTML_Soal15 = BASE_LOCATION_HTML +"Soal_15.html";
    public static final String HTML_Soal16 = BASE_LOCATION_HTML +"Soal_16.html";
    public static final String HTML_Soal17 = BASE_LOCATION_HTML +"Soal_17.html";
    public static final String HTML_Soal18 = BASE_LOCATION_HTML +"Soal_18.html";
    public static final String HTML_Soal19 = BASE_LOCATION_HTML +"Soal_19.html";
    public static final String HTML_Soal20 = BASE_LOCATION_HTML +"Soal_20.html";
    public static final String HTML_Soal21 = BASE_LOCATION_HTML +"Soal_21.html";
    public static final String HTML_Soal22 = BASE_LOCATION_HTML +"Soal_22.html";
    public static final String HTML_Soal23 = BASE_LOCATION_HTML +"Soal_23.html";
    public static final String HTML_Soal24 = BASE_LOCATION_HTML +"Soal_24.html";
    public static final String HTML_Soal25 = BASE_LOCATION_HTML +"Soal_25.html";
    public static final String HTML_Soal26 = BASE_LOCATION_HTML +"Soal_26.html";
    public static final String HTML_Soal27 = BASE_LOCATION_HTML +"Soal_27.html";
    public static final String HTML_Soal28 = BASE_LOCATION_HTML +"Soal_28.html";
    public static final String HTML_Soal29 = BASE_LOCATION_HTML +"Soal_29.html";
    public static final String HTML_Soal30 = BASE_LOCATION_HTML +"Soal_30.html";
    public static final String HTML_Soal31 = BASE_LOCATION_HTML +"Soal_31.html";
    public static final String HTML_Soal32 = BASE_LOCATION_HTML +"Soal_32.html";
    public static final String HTML_Soal33 = BASE_LOCATION_HTML +"Soal_33.html";
    public static final String HTML_Soal34 = BASE_LOCATION_HTML +"Soal_34.html";
    public static final String HTML_Soal35 = BASE_LOCATION_HTML +"Soal_35.html";
    public static final String HTML_Soal36 = BASE_LOCATION_HTML +"Soal_36.html";
    public static final String HTML_Soal37 = BASE_LOCATION_HTML +"Soal_37.html";
    public static final String HTML_Soal38 = BASE_LOCATION_HTML +"Soal_38.html";
    public static final String HTML_Soal39 = BASE_LOCATION_HTML +"Soal_39.html";
    public static final String HTML_Soal40 = BASE_LOCATION_HTML +"Soal_40.html";
    public static final String HTML_Soal41 = BASE_LOCATION_HTML +"Soal_41.html";
    public static final String HTML_Soal42 = BASE_LOCATION_HTML +"Soal_42.html";
    public static final String HTML_Soal43 = BASE_LOCATION_HTML +"Soal_43.html";
    public static final String HTML_Soal44 = BASE_LOCATION_HTML +"Soal_44.html";
    public static final String HTML_Soal45 = BASE_LOCATION_HTML +"Soal_45.html";
    public static final String HTML_Soal46 = BASE_LOCATION_HTML +"Soal_46.html";
    public static final String HTML_Soal47 = BASE_LOCATION_HTML +"Soal_47.html";
    public static final String HTML_Soal48 = BASE_LOCATION_HTML +"Soal_48.html";
    public static final String HTML_Soal49 = BASE_LOCATION_HTML +"Soal_49.html";
    public static final String HTML_Soal50 = BASE_LOCATION_HTML +"Soal_50.html";
    public static final String HTML_Soal51 = BASE_LOCATION_HTML +"Soal_51.html";
    public static final String HTML_Soal52 = BASE_LOCATION_HTML +"Soal_52.html";
    public static final String HTML_Soal53 = BASE_LOCATION_HTML +"Soal_53.html";
    public static final String HTML_Soal54 = BASE_LOCATION_HTML +"Soal_54.html";
    public static final String HTML_Soal55 = BASE_LOCATION_HTML +"Soal_55.html";
    public static final String HTML_Soal56 = BASE_LOCATION_HTML +"Soal_56.html";
    public static final String HTML_Soal57 = BASE_LOCATION_HTML +"Soal_57.html";
    public static final String HTML_Soal58 = BASE_LOCATION_HTML +"Soal_58.html";
    public static final String HTML_Soal59 = BASE_LOCATION_HTML +"Soal_59.html";
    public static final String HTML_Soal60 = BASE_LOCATION_HTML +"Soal_60.html";

    private static String[] soal = {
            HTML_Soal1,
            HTML_Soal2,
            HTML_Soal3,
            HTML_Soal4,
            HTML_Soal5,
            HTML_Soal6,
            HTML_Soal7,
            HTML_Soal8,
            HTML_Soal9,
            HTML_Soal10,
            HTML_Soal11,
            HTML_Soal12,
            HTML_Soal13,
            HTML_Soal14,
            HTML_Soal15,
            HTML_Soal16,
            HTML_Soal17,
            HTML_Soal18,
            HTML_Soal19,
            HTML_Soal20,
            HTML_Soal21,
            HTML_Soal22,
            HTML_Soal23,
            HTML_Soal24,
            HTML_Soal25,
            HTML_Soal26,
            HTML_Soal27,
            HTML_Soal28,
            HTML_Soal29,
            HTML_Soal30,
            HTML_Soal31,
            HTML_Soal32,
            HTML_Soal33,
            HTML_Soal34,
            HTML_Soal35,
            HTML_Soal36,
            HTML_Soal37,
            HTML_Soal38,
            HTML_Soal39,
            HTML_Soal40,
            HTML_Soal41,
            HTML_Soal42,
            HTML_Soal43,
            HTML_Soal44,
            HTML_Soal45,
            HTML_Soal46,
            HTML_Soal47,
            HTML_Soal48,
            HTML_Soal49,
            HTML_Soal50,
            HTML_Soal51,
            HTML_Soal52,
            HTML_Soal53,
            HTML_Soal54,
            HTML_Soal55,
            HTML_Soal56,
            HTML_Soal57,
            HTML_Soal58,
            HTML_Soal59,
            HTML_Soal60
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
