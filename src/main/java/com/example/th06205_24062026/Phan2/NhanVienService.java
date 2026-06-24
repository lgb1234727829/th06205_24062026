package com.example.th06205_24062026.Phan2;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    private List<NhanVien> nhanViens = new ArrayList<>();

    public void addNhanVien(NhanVien nhanVien) {

        if (nhanVien == null) {

            throw new IllegalArgumentException("Nhan vien khong de trong");
        }

        nhanViens.add(nhanVien);
    }

    public void updateNhanVien(NhanVien nhanVien) {

        if (nhanVien == null) {

            throw new IllegalArgumentException("Nhan vien khong de trong");
        }

        for (int i = 0; i < nhanViens.size(); ++i) {

            if (nhanViens.get(i).getMaNV() == nhanVien.getMaNV()) {

                nhanViens.set(i, nhanVien);

                return;
            }
        }

        throw new IllegalArgumentException("Nhan vien " + nhanVien.getMaNV() + " khong ton tai");
    }

    public List<NhanVien> getAllNhanViens() {

        return nhanViens;
    }

    public NhanVien getNhanVienById(String maNV) {

        for (NhanVien nhanVien: nhanViens) {

            if (nhanVien.getMaNV() == maNV) {

                return nhanVien;
            }
        }

        return null;
    }


}
