import java.util.ArrayList;
import java.util.List;

public class qlsinhvien {
    private List<sinhvien> danhsachSV;

    // SỬA LỖI: Tên constructor phải giống tên Class (qlsinhvien)
    public qlsinhvien() {
        danhsachSV = new ArrayList<>();
    }

    // 1. Thêm sinh viên
    public void themsinhvien(sinhvien sv) {
        danhsachSV.add(sv);
        System.out.println("Đã thêm: " + sv.gethoTen());
    }

    // 2. Tìm sinh viên theo mã
    public sinhvien timtheoma(String maSV) {
        for (sinhvien sv : danhsachSV) {
            if (sv.getmaSV().equalsIgnoreCase(maSV)) { // Dùng equalsIgnoreCase để linh hoạt hơn
                return sv;
            }
        }
        return null;
    }

    // 3. Tìm sinh viên có điểm cao nhất
    public sinhvien timdiemcaonhat() {
        if (danhsachSV.isEmpty()) return null;

        sinhvien svCaoNhat = danhsachSV.get(0);
        for (sinhvien sv : danhsachSV) {
            if (sv.getdiemTB() > svCaoNhat.getdiemTB()) {
                svCaoNhat = sv;
            }
        }
        return svCaoNhat;
    }

    // 4. Tính điểm trung bình cả lớp
    public double tinhDiemTrungBinhLop() {
        if (danhsachSV.isEmpty()) return 0;
        double tong = 0;
        for (sinhvien sv : danhsachSV) {
            tong += sv.getdiemTB();
        }
        return tong / danhsachSV.size();
    }

    // 5. Sắp xếp theo điểm giảm dần (Bubble Sort)
    public void sapXepTheoDiemGiamDan() {
        int n = danhsachSV.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (danhsachSV.get(j).getdiemTB() < danhsachSV.get(j + 1).getdiemTB()) {
                    sinhvien temp = danhsachSV.get(j);
                    danhsachSV.set(j, danhsachSV.get(j + 1));
                    danhsachSV.set(j + 1, temp);
                }
            }
        }
    }

    // 6. Hiển thị danh sách
    public void hienThiDanhSach() {
        if (danhsachSV.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
        System.out.printf("%-5s %-10s %-20s %-10s%n", "STT", "Mã SV", "Họ tên", "Điểm TB");
        for (int i = 0; i < danhsachSV.size(); i++) {
            sinhvien sv = danhsachSV.get(i);
            System.out.printf("%-5d %-10s %-20s %-10.2f%n", 
                (i + 1), sv.getmaSV(), sv.gethoTen(), sv.getdiemTB());
        }
    }

    // 7. Xóa sinh viên
    public boolean xoaSinhVien(String maSV) {
        for (int i = 0; i < danhsachSV.size(); i++) {
            if (danhsachSV.get(i).getmaSV().equalsIgnoreCase(maSV)) {
                sinhvien svBiXoa = danhsachSV.remove(i);
                System.out.println("Đã xóa: " + svBiXoa.gethoTen());
                return true;
            }
        }
        System.out.println("Không tìm thấy mã: " + maSV);
        return false;
    }
}

