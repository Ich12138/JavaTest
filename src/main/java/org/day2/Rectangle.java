package org.day2;

public class Rectangle {
    private int lang;
    private int kuan;

    public Rectangle() {

    }

    public Rectangle(int lang, int kuan) {
        this.lang = lang;
        this.kuan = kuan;

    }

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }

    public int getKuan() {
        return kuan;
    }

    public void setKuan(int kuan) {
        this.kuan = kuan;
    }

    //计算周长和面积
    public int Length() {
        int l = (lang + kuan) * 2;

        return l;

    }

    public int Stace() {
        int s = lang * kuan;
        return s;
    }

}
