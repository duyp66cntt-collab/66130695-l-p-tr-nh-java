
public class sinhvien {
    private String maSV;
    private String hoTen;
    private double diemTB;

    public sinhvien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getmaSV() { return maSV; }
    public String gethoTen() { return hoTen; }
    public double getdiemTB() { return diemTB; }

    @Override
    public String toString() {
        return String.format("Mã: %s | Tên: %-15s | Điểm: %.1f", maSV, hoTen, diemTB);
    }
}