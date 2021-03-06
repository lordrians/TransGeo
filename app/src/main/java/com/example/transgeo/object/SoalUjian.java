package com.example.transgeo.object;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class SoalUjian {

    //html location
    public static final String BASE_HTML = "file:///android_asset/";
    public static final String BASES_LOCATION_HTML = "file:///android_asset/";
    public static final String BASE_UJIAN = "ujian/";
    public static final String BASE_LAT_MUDAH = "latihan_mudah/";
    public static final String BASE_LAT_SEDANG = "latihan_sedang/";
    public static final String BASE_LAT_SUSAH = "latihan_susah/";



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
            "A. -6",
            "A. 2x - y + 8 = 0",
            "A. 45˚ dengan pusat R",
            "A. (-19, 6)",
            "A. (-2, 8)",
            "A. (20, -17)",
            "A. –y = -5x + 1",
            "A. 2y = x - 12",
            "A. 1 dan 3",
            "A. 162 cm persegi",
            "A. -2",
            "A. y = -2x + 9",
            "A. 3y = -4x - 36",
            "A. y = -3x + 15",
            "A. P’(8, -18)",
            "A. (-10, -34)",
            "A. 3y = -2x + 12",
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
            "B. -4",
            "B. 2x - 4y + 8 = 0",
            "B. -45˚ dengan pusat R",
            "B. (-11, 6)",
            "B. (2, 12)",
            "B. (17, -20)",
            "B. –y = 5x + 1",
            "B. 2y = x + 12",
            "B. 1 dan –3",
            "B. 324 cm persegi",
            "B. -3",
            "B. y = -2x + 15",
            "B. 3y = -4x + 36",
            "B. y = -3x + 11",
            "B. P’(32, -18)",
            "B. (-10, -26)",
            "B. 3y = -2x + 3",
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
            "C. 4",
            "C. 2y - 4x + 8 = 0",
            "C. 90˚ dengan pusat O",
            "C. (19, -18)",
            "C. (18, 12)",
            "C. (-17, 20)",
            "C. y = 5x + 1",
            "C. 2y = x - 6",
            "C. -1 dan 3",
            "C. 486 cm persegi",
            "C. -4",
            "C. y = -2x - 9",
            "C. 3y = 4x - 36",
            "C. y = -3x - 3",
            "C. P’(-32, 2)",
            "C. (-40, 4)",
            "C. 3y = 2x - 3",
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
            "D. 6",
            "D. 4x - 2y + 8 = 0",
            "D. -90˚ dengan pusat O",
            "D. (19, -6)",
            "D. (22, 8)",
            "D. (-20, 17)",
            "D. y = -5x - 1",
            "D. 2y = x + 6",
            "D. -1 dan -3",
            "D. 972 cm persegi",
            "D. -5",
            "D. y = -2x - 15",
            "D. 3y = 4x + 36",
            "D. y = -3x - 7",
            "D. P’(-12, 46)",
            "D. (-20, 4)",
            "D. 3y = 2x - 12",
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
            "C. 4",
            "B. 2x - 4y + 8 = 0",
            "D. -90˚ dengan pusat O",
            "C. (19, -18)",
            "C. (18, 12)",
            "D. (-20, 17)",
            "B. –y = 5x + 1",
            "B. 2y = x + 12",
            "C. -1 dan 3",
            "C. 486 cm persegi",
            "D. -5",
            "B. y = -2x + 15",
            "A. 3y = -4x - 36",
            "D. y = -3x - 7",
            "B. P’(32, -18)",
            "A. (-10, -34)",
            "B. 3y = -2x + 3",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "https://drive.google.com/uc?id=1ctHsUfbPN1T7uxI6wbtuWR7X2oz7my72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };


    private static String[] nullPhoto = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    private static String[] photoLatMudah = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "https://drive.google.com/uc?id=1MDLBomAwztTnY3FS14Cc-nwtf8-wulKc",
            "",
            ""
    };
    public static ArrayList<Soal> getSoalUjian(){
        ArrayList<String> soal = new ArrayList<>();
        for (int i = 1; i <= 60; i++){
            soal.add(BASE_HTML + BASE_UJIAN + "Soal_"+ i + ".html");
        }

        ArrayList<Soal> soalList = new ArrayList<>();
        for (int i = 0; i < 60; i++ ){
            Soal question = new Soal();
            question.setSoal(soal.get(i));
            question.setPgA(pgA[i]);
            question.setPgB(pgB[i]);
            question.setPgC(pgC[i]);
            question.setPgD(pgD[i]);
            question.setCorrectAns(correctAns[i]);
            question.setPhotoSoal(photoSoal[i]);
            soalList.add(question);
        }
        return soalList;
    }

    public static ArrayList<Soal> getLatihan(int lev_soal, Context mContext){
        ArrayList<String> soal = new ArrayList<>();
        ArrayList<String> jawaban = new ArrayList<>();
        Random rand = new Random();
        ArrayList<Soal> soalList = new ArrayList<>();
        ArrayList<Soal> randomSoal = new ArrayList<>();

        if (lev_soal == 0){
            Toast.makeText(mContext, "Mudah", Toast.LENGTH_SHORT).show();
            for (int i = 1; i <= 12; i++){
                soal.add(BASE_HTML + BASE_LAT_MUDAH + "Soal_"+ i + ".html");
                jawaban.add(BASE_HTML + BASE_LAT_MUDAH + "Jawaban_"+ i + ".html");
            }

            for (int i = 0; i < 12; i++ ){
                Soal question = new Soal();
                question.setSoal(soal.get(i));
                question.setPhotoSoal(photoLatMudah[i]);
                question.setJawaban(jawaban.get(i));
                soalList.add(question);
            }

        } else if (lev_soal == 1){
            Toast.makeText(mContext, "Sedang", Toast.LENGTH_SHORT).show();
            for (int i = 1; i <= 12; i++){
                soal.add(BASE_HTML + BASE_LAT_SEDANG + "Soal_"+ i + ".html");
                jawaban.add(BASE_HTML + BASE_LAT_SEDANG + "Jawaban_"+ i + ".html");
            }

            for (int i = 0; i < 12; i++ ){
                Soal question = new Soal();
                question.setSoal(soal.get(i));
                question.setJawaban(jawaban.get(i));
                question.setPhotoSoal(nullPhoto[i]);
                soalList.add(question);
            }
        } else {
            Toast.makeText(mContext, "Susah", Toast.LENGTH_SHORT).show();
            for (int i = 1; i <= 12; i++){
                soal.add(BASE_HTML + BASE_LAT_SUSAH + "Soal_"+ i + ".html");
                jawaban.add(BASE_HTML + BASE_LAT_SUSAH + "Jawaban_"+ i + ".html");
            }
            for (int i = 0; i < 12; i++ ){
                Soal question = new Soal();
                question.setSoal(soal.get(i));
                question.setJawaban(jawaban.get(i));
                question.setPhotoSoal(nullPhoto[i]);
                soalList.add(question);
            }
        }


        for (int i = 0; i < 12; i++){
            int randomIndex = rand.nextInt(soalList.size());

            randomSoal.add(soalList.get(randomIndex));

            soalList.remove(randomIndex);

        }
        return randomSoal;
    }

    public static ArrayList<Soal> randSoal(int jmlSoal){
        Random rand = new Random();
        ArrayList<Soal> soalAwal = getSoalUjian();

        ArrayList<Soal> randomSoal = new ArrayList<>();
        for (int i = 0; i < jmlSoal; i++){
            int randomIndex = rand.nextInt(soalAwal.size());

            randomSoal.add(soalAwal.get(randomIndex));

            soalAwal.remove(randomIndex);

        }
        return randomSoal;
    }

}
