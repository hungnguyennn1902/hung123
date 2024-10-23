package com.example.de2;

public class HoaDon_NgaySinh {
    private int ma;
    private String hoTenKhachHang;
    private String soPhong;
    private int donGia;
    private int soNgayLuuTru;

    public HoaDon_NgaySinh(int ma, String hoTenKhachHang, String soPhong, int donGia, int soNgayLuuTru) {
        this.ma = ma;
        this.hoTenKhachHang = hoTenKhachHang;
        this.soPhong = soPhong;
        this.donGia = donGia;
        this.soNgayLuuTru = soNgayLuuTru;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTenKhachHang() {
        return hoTenKhachHang;
    }

    public void setHoTenKhachHang(String hoTenKhachHang) {
        this.hoTenKhachHang = hoTenKhachHang;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoNgayLuuTru() {
        return soNgayLuuTru;
    }

    public void setSoNgayLuuTru(int soNgayLuuTru) {
        this.soNgayLuuTru = soNgayLuuTru;
    }
}
