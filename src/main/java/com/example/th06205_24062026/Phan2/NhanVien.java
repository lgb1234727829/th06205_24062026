package com.example.th06205_24062026.Phan2;

public class NhanVien {
    private String maNV;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;

    public NhanVien(String maNV, String ten, int tuoi, float luong, int soNamLamViec) {
        this.maNV = maNV;

        setTen(ten);
        setTuoi(tuoi);
        setLuong(luong);
        setSoNamLamViec(soNamLamViec);

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
        if (ten == null || ten.isEmpty()) {

            throw new IllegalArgumentException("Ten khong duoc de trong");
        }

        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi < 0) {
            throw new IllegalArgumentException("Tuoi phai > 0");
        }
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        if (luong < 0) {

            throw new IllegalArgumentException("Luong phai > 0");
        }
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        if (soNamLamViec < 0) {

            throw new IllegalArgumentException("So nam lam viec phai > 0 ");
        }
        this.soNamLamViec = soNamLamViec;
    }
}
