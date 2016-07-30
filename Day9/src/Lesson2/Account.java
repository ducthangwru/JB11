package Lesson2;

import java.util.Date;
public class Account {
    private int id;
    private double soDu;
    private double laiSuatNam;
    private Date ngaytao ;


    public Account(int id, double soDu) {
        this.id = id;
        this.soDu = soDu;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public double getLaiSuatNam() {
        return laiSuatNam;
    }

    public void setLaiSuatNam(double laiSuatNam) {
        this.laiSuatNam = laiSuatNam;
    }

    public double getLaiSuatThang() {
        return getLaiSuatNam()/12;
    }

    public double getLoiNhuanHangThang() {
        return getSoDu() * getLaiSuatThang();
    }

    public void rutTien(double value) {
        double soDu = getSoDu() - value;
        setSoDu(soDu);
    }

    public void napTien(double value) {
        double soDu = getSoDu() + value;
        setSoDu(soDu);
    }
}
