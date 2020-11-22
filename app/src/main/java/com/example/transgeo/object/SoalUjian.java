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
            "A. 5 dan 9",
            "A. 5x - 2y - 43 = 0",
            "A. 7",
            "A. L”(15, 18)",
            "A. K’(-7, 10)",
            "A. (8, -38)",
            "A. R”(-28, -8)",
            "A. Segitiga",
            "A. –x + 2y - 3 = 0",
            "A. x = -2y^2 -3y + 5",
            "A. 2x - y + 8 = 0",
            "A. 45˚ dengan pusat R",
            "A. (-19, 6)",
            "A. (-2, 8)",
            "A. (20, -17)",
            "A. –y = -5x + 1",
            "A. 2y = x - 12",
            "A. 1 dan 3",
            "A. 162 cm(persegi)",
            "A. -2",
            "A. y = -2x + 9",
            "A. y = 12x^2",
            "A. y = -3x + 15",
            "A. P’(8, -18)",
            "A. (-10, -34)",
            "A. y = 3x^2 +5",
            "A. R’(18,16)",
            "A. S(11, 20)",
            "A. -6",
            "A. (8, -12)",
            "A. S’(13, -7)",
            "A. (-2, 9)",
            "A. (8, -1)",
            "A. (5, 3)",
            "A. (1, 2)",
            "A. A’(6, 12), B’(3, 9), C’(12, 6)",
            "A. (-33, 16)",
            "A. (1, 5)",
            "A. (8,3)",
            "A. (-7, -3)",
            "A. 8",
            "A. (10, 8)",
            "A. Garis y = x",
            "A. 16",
            "A. A(2, 4)",
            "A. 1 : 3",
            "A. A’(2, 3)",
            "A. (4, 2)",
            "A. (-5, 11) dan (13, 5)",
            "A. B”(-5, 12)",
            "A. B’(10, -30)",
            "A. (15, 18)",
            "A. K’(2, -2)",
            "A. E’(0, -3)",
            "A. F’(0, 0)",
            "A. 5/2"
    };

    private static String[] pgB = {
            "B. A’(2,-16)",
            "B. 5 dan 23",
            "B. R”(12, 10)",
            "B. S’(-25, 30)",
            "B. 5 dan 11",
            "B. 5x - 2y + 43 = 0",
            "B. 5",
            "B. L”(15, -18)",
            "B. K’(9, 10)",
            "B. (8, -6)",
            "B. R”(-16, 4)",
            "B. Persegi panjang",
            "B. –x + 2y + 3 = 0",
            "B. x = -2y^2 - 3y - 5",
            "B. 2x - 4y + 8 = 0",
            "B. -45˚ dengan pusat R",
            "B. (-11, 6)",
            "B. (2, 12)",
            "B. (17, -20)",
            "B. –y = 5x + 1",
            "B. 2y = x + 12",
            "B. 1 dan –3",
            "B. 324 cm(persegi)",
            "B. -3",
            "B. y = -2x + 15",
            "B. y = 6x^2",
            "B. y = -3x + 11",
            "B. P’(32, -18)",
            "B. (-10, -26)",
            "B. y = 3x^2 + 6",
            "B. R’(16, -18)",
            "B. S(11, -20)",
            "B. -4",
            "B. (-8, 12)",
            "B. S’(13, -19)",
            "B. (6, 9)",
            "B. (-8, -1)",
            "B. (-3, -5)",
            "B. (-2, 1)",
            "B. A’(6, 12), B’(3, -9), C’(8, 6)",
            "B. (-27, 18)",
            "B. (-5, 1)",
            "B. (-3, 8)",
            "B. (-7, 3)",
            "B. 24",
            "B. (10, -8)",
            "B. Sumbu -x",
            "B. 12",
            "B. A(2, 1)",
            "B. 3 : 1",
            "B. A’(3, 2)",
            "B. (4, -2)",
            "B. (-5, 11) dan (-13, 5)",
            "B. B”(13, 8)",
            "B. B’(-20, 20)",
            "B. (-15, 18)",
            "B. K’(-14, -2)",
            "B. E’(3, 0)",
            "B. F’(5, 5)",
            "B. -2/5"
    };

    private static String[] pgC = {
            "C. A’(-14, -2)",
            "C. -7 dan 23",
            "C. R”(14, 16)",
            "C. S’(25, 30)",
            "C. -1 dan 9",
            "C. 5x - 2y - 31 = 0",
            "C. -5",
            "C. L”(-15, 18)",
            "C. K’(9, 6)",
            "C. (6, -14)",
            "C. R”(4, 8)",
            "C. Jajargenjang",
            "C. x - 2y - 3 = 0",
            "C. x = 2y^2 - 3y + 10",
            "C. 2y - 4x + 8 = 0",
            "C. 90˚ dengan pusat O",
            "C. (19, -18)",
            "C. (18, 12)",
            "C. (-17, 20)",
            "C. y = 5x + 1",
            "C. 2y = x - 6",
            "C. -1 dan 3",
            "C. 486 cm(persegi)",
            "C. -4",
            "C. y = -2x - 9",
            "C. y = 3x^2",
            "C. y = -3x - 3",
            "C. P’(-32, 2)",
            "C. (-40, 4)",
            "C. y = -3x^2 + 5",
            "C. R’(-16, 18)",
            "C. S(-11, 20)",
            "C. 4",
            "C. (2, -3)",
            "C. S’(34, -7)",
            "C. (2, 9)",
            "C. (8, 1)",
            "C. (5, -3)",
            "C. (2, 1)",
            "C. A’(6, 12), B’(-3, -9), C’(12, 6)",
            "C. (27, 18)",
            "C. (1, -5)",
            "C. (3, -8)",
            "C. (7, -3)",
            "C. 32",
            "C. (8, 10)",
            "C. Sumbu -y",
            "C. 14",
            "C. A(3, 2)",
            "C. 1 : 4",
            "C. A’(-2, 3)",
            "C. (2, -4)",
            "C. (5, 11) dan (-13, 5)",
            "C. B”(-1, 12)",
            "C. B’(-30, -30)",
            "C. (15, -18)",
            "C. K’(2, -16)",
            "C. E’(-3, 0)",
            "C. F’(-10, 0)",
            "C. 2/5"

    };

    private static String[] pgD = {
            "D. A’(-14, -16)",
            "D. -7 dan 45",
            "D. R”(16,14)",
            "D. S’(30, -25)",
            "D. -1 dan 11",
            "D. 5x - 2y + 31 = 0",
            "D. -7",
            "D. L”(-15, -18)",
            "D. K’(23, 6)",
            "D. (-14, -14)",
            "D. R”(16,4)",
            "D. Layang-layang",
            "D. x - 2y + 3 = 0",
            "D. x = 2y^2 - 3y - 10",
            "D. 4x - 2y + 8 = 0",
            "D. -90˚ dengan pusat O",
            "D. (19, -6)",
            "D. (22, 8)",
            "D. (-20, 17)",
            "D. y = -5x - 1",
            "D. 2y = x + 6",
            "D. -1 dan -3",
            "D. 972 cm(persegi)",
            "D. -5",
            "D. y = -2x - 15",
            "D. y= x^2",
            "D. y = -3x - 7",
            "D. P’(-12, 46)",
            "D. (-20, 4)",
            "D. y = -3x^2 - 5",
            "D. R’(-18, -16)",
            "D. S(-11, -20)",
            "D. 6",
            "D. (-2, 3)",
            "D. S’(34, -19)",
            "D. (6, 3)",
            "D. (1, -8)",
            "D. (3, 5)",
            "D. (-2, -1)",
            "D. A’(6, 12), B’(-3, 9), C’(12, 6)",
            "D. (33, 16)",
            "D. (5, 1)",
            "D. (-8, 3)",
            "D. (3, 7)",
            "D. 16",
            "D. (-10, 8)",
            "D. Garis y = -x",
            "D. 10",
            "D. A(2, 3)",
            "D. 4 : 1",
            "D. A’(3, -2)",
            "D. (-2 , -4)",
            "D. (-5, 11) dan (-13, 10)",
            "D. B”(19, 8)",
            "D. B’(-20, 40)",
            "D. (-15, -18)",
            "D. K’(-14, -16)",
            "D. E’(0, 3)",
            "D. F’(-5, -5)",
            "D. -5/2"
    };

    private static String[] correctAns = {
            "B. A’(2,-16)",
            "B. 5 dan 23",
            "B. R”(12, 10)",
            "D. S’(30, -25)",
            "D. -1 dan 11",
            "A. 5x - 2y - 43 = 0",
            "D. -7",
            "C. L”(-15, 18)",
            "D. K’(23, 6)",
            "B. (8, -6)",
            "A. R”(-28, -8)",
            "D. Layang-layang",
            "C. x - 2y - 3 = 0",
            "C. x = 2y^2 - 3y + 10",
            "B. 2x - 4y + 8 = 0",
            "D. -90˚ dengan pusat O",
            "C. (19, -18)",
            "C. (18, 12)",
            "D. (-20, 17)",
            "B. –y = 5x + 1",
            "B. 2y = x + 12",
            "C. -1 dan 3",
            "C. 486 cm(persegi)",
            "D. -5",
            "B. y = -2x + 15",
            "C. y = 3x^2",
            "D. y = -3x - 7",
            "B. P’(32, -18)",
            "A. (-10, -34)",
            "C. y = -3x^2 + 5",
            "B. R’(16, -18)",
            "D. S(-11, -20)",
            "C. 4",
            "D. (-2, 3)",
            "A. S’(13, -7)",
            "A. (-2, 9)",
            "C. (8, 1)",
            "D. (3, 5)",
            "A. (1, 2)",
            "D. A’(6, 12), B’(-3, 9), C’(12, 6)",
            "A. (-33, 16)",
            "C. (1, -5)",
            "B. (-3, 8)",
            "B. (-7, 3)",
            "C. 32",
            "B. (10, -8)",
            "D. Garis y = -x",
            "B. 12",
            "B. A(2, 1)",
            "C. 1 : 4",
            "A. A’(2, 3)",
            "B. (4, -2)",
            "B. (-5, 11) dan (-13, 5)",
            "C. B”(-1, 12)",
            "D. B’(-20, 40)",
            "B. (-15, 18)",
            "B. K’(-14, -2)",
            "C. E’(-3, 0)",
            "A. F’(0, 0)",
            "D. -5/2"
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
