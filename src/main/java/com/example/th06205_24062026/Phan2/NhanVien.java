package com.example.th06205_24062026.Phan2;

public class NhanVien {
    private String maNV;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;

    public NhanVien(String maNV, String ten, int tuoi, float luong, int soNamLamViec) {
        this.maNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
        this.soNamLamViec = soNamLamViec;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }
}
