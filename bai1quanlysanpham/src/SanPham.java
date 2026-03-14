public class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMaSP() { return maSP; }
    public String getTenSP() { return tenSP; }
    public double getGia() { return gia; }
    public int getSoLuong() { return soLuong; }

    // Phương thức thay thế cho toString (không dùng override)
    public void hienThiThongTin() {
        System.out.println("Mã: " + maSP + " | Tên: " + tenSP + 
                           " | Giá: " + gia + " | SL: " + soLuong);
    }
}

