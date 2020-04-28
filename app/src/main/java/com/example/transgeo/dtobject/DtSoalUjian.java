package com.example.transgeo.dtobject;

import com.example.transgeo.object.Soal;

import java.util.ArrayList;
import java.util.Random;

public class DtSoalUjian {

    private static String[] soal = {
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "IIIIIIIIIIIIIIIIIIII "
    };

    private static String[] pgA = {
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "A. 1",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "A. 1"
    };

    private static String[] pgB = {
            "B. 2",
            "B. 2",
            "B. 1",
            "B. 1",
            "B. 2",
            "B. 2",
            "B. 1",
            "B. 1",
            "B. 2",
            "B. 2",
            "B. 1",
            "B. 1",
            "B. 2",
            "B. 2",
            "B. 1",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "B. 1",
            "B. 3"
    };

    private static String[] pgC = {
            "C. 3",
            "C. 3",
            "C. 1",
            "C. 1",
            "C. 3",
            "C. 3",
            "C. 1",
            "C. 1",
            "C. 3",
            "C. 3",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "C. 1",
            "C. 1",
            "C. 3",
            "C. 3",
            "C. 1",
            "C. 1",
            "C. 4"
    };

    private static String[] pgD = {
            "D. 4",
            "D. 4",
            "D. 1",
            "D. 1",
            "D. 4",
            "D. 4",
            "D. 1",
            "D. 1",
            "D. 4",
            "D. 4",
            "D. 1",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "D. 1",
            "D. 4",
            "D. 4",
            "D. 1",
            "D. 1",
            "D. 5"
    };

    private static String[] correctAns = {
            "A. 1",
            "B. 2",
            "C. 1",
            "D. 1",
            "A. 1",
            "B. 2",
            "C. 1",
            "D. 1",
            "A. 1",
            "B. 2",
            "C. 1",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "AAAAAAAAAAAAAAAAAAAA",
            "BBBBBBBBBBBBBBBBBBB",
            "CCCCCCCCCCCCCCC",
            "DDDDDDDDDDDDDDD ",
            "EEEEEEEEEEEEEEEEEEEE",
            "FFFFFFFFFFFFFFFFFF",
            "GGGGGGGGGGGGGGGGGGGGGG",
            "HHHHHHHHHHHHHHHHHHHHHH",
            "D. 1",
            "A. 1",
            "B. 2",
            "C. 1",
            "D. 1",
            "E. 5"
    };

    private static String[] photoSoal = {
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "",
            "",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
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
        for (int i = 0; i < 30; i++){
            int randomIndex = rand.nextInt(soalAwal.size());

            randomSoal.add(soalAwal.get(randomIndex));

            soalAwal.remove(randomIndex);

        }
        return randomSoal;
    }

}
