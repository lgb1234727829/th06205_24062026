package com.example.th06205_24062026.Phan2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    private NhanVienService nhanVienService;

    @BeforeEach
    void setUp() {

        nhanVienService = new NhanVienService();
    }

    // addStudent()
    @Test
    void addNhanVienWithValidNhanVien() {

        NhanVien nhanVien = new NhanVien("nv01", "abc", 19, 13, 3);
        nhanVienService.addNhanVien(nhanVien);

        assertEquals(1, nhanVienService.getAllNhanViens().size());
    }

    @Test
    void addNhanVienWithNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> nhanVienService.addNhanVien(null));

        assertEquals("Nhan vien khong de trong", exception.getMessage());
    }

    @Test
    void addNhanVienWithInvalidAge() {

        Exception exception = assertThrows(IllegalArgumentException.class, ()
                -> nhanVienService.addNhanVien(new NhanVien("nv01", "abc", -5, 13, 3)));

        assertEquals("Tuoi phai > 0", exception.getMessage());
    }

    @Test
    void updateNhanVienWithValidNhanVien() {

        NhanVien nhanVien = new NhanVien("nv01", "abc", 19, 13, 3);
        nhanVienService.addNhanVien(nhanVien);

        nhanVien.setTen("TT");
        nhanVien.setTuoi(21);
        nhanVien.setLuong(8);

        nhanVienService.updateNhanVien(nhanVien);

        assertEquals("TT", nhanVienService.getNhanVienById("nv01").getTen());
        assertEquals(21, nhanVienService.getNhanVienById("nv01").getTuoi());
        assertEquals(8, nhanVienService.getNhanVienById("nv01").getLuong());
    }


    @Test
    void updateNhanVienWithNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> nhanVienService.updateNhanVien(null));
        assertEquals("Nhan vien khong de trong", exception.getMessage());
    }


    @Test
    void updateNhanVienWithInvalidTen() {

        NhanVien nhanVien = new NhanVien("nv01", "abc", 19, 13, 3);
        nhanVienService.addNhanVien(nhanVien);

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> nhanVienService.updateNhanVien(new NhanVien("nv01", "", 19, 13, 3)));
        assertEquals("Nhan vien khong de trong", exception.getMessage());
    }
}