package com.example.transgeo.object;


public class Soal {
    private String soal, pgA, pgB, pgC, pgD, correctAns, photoSoal , Jawaban;

    public String getJawaban() {
        return Jawaban;
    }

    public void setJawaban(String jawaban) {
        Jawaban = jawaban;
    }

    public String getPhotoSoal() {
        return photoSoal;
    }

    public void setPhotoSoal(String photoSoal) {
        this.photoSoal = photoSoal;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getPgA() {
        return pgA;
    }

    public void setPgA(String pgA) {
        this.pgA = pgA;
    }

    public String getPgB() {
        return pgB;
    }

    public void setPgB(String pgB) {
        this.pgB = pgB;
    }

    public String getPgC() {
        return pgC;
    }

    public void setPgC(String pgC) {
        this.pgC = pgC;
    }

    public String getPgD() {
        return pgD;
    }

    public void setPgD(String pgD) {
        this.pgD = pgD;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }
}
