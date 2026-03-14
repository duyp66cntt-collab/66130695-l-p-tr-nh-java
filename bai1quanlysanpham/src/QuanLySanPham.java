import java.util.ArrayList;

public class QuanLySanPham {
    private ArrayList<SanPham> danhSach = new ArrayList<>();

    public void themSP(SanPham sp) {
        danhSach.add(sp);
    }

    public boolean xoaTheoMa(String ma) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSP().equalsIgnoreCase(ma)) {
                danhSach.remove(i);
                return true;
            }
        }
        return false;
    }

    public void timTheoTen(String ten) {
        boolean timThay = false;
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getTenSP().toLowerCase().contains(ten.toLowerCase())) {
                danhSach.get(i).hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) System.out.println("Không tìm thấy sản phẩm nào.");
    }

    public void sapXepTheoGia(boolean tangDan) {
        for (int i = 0; i < danhSach.size() - 1; i++) {
            for (int j = i + 1; j < danhSach.size(); j++) {
                boolean dieuKien = tangDan ? 
                    danhSach.get(i).getGia() > danhSach.get(j).getGia() : 
                    danhSach.get(i).getGia() < danhSach.get(j).getGia();
                if (dieuKien) {
                    SanPham temp = danhSach.get(i);
                    danhSach.set(i, danhSach.get(j));
                    danhSach.set(j, temp);
                }
            }
        }
    }

    public double tinhTongGiaTri() {
        double tong = 0;
        for (int i = 0; i < danhSach.size(); i++) {
            tong += danhSach.get(i).getGia() * danhSach.get(i).getSoLuong();
        }
        return tong;
    }

    public void lietKeSapHetHang() {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getSoLuong() < 10) {
                danhSach.get(i).hienThiThongTin();
            }
        }
    }

    public void hienThiTatCa() {
        if (danhSach.isEmpty()) System.out.println("Danh sách trống.");
        for (int i = 0; i < danhSach.size(); i++) {
            danhSach.get(i).hienThiThongTin();
        }
    }
}
