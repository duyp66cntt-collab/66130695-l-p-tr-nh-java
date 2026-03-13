import java.util.List;

public class mainqlsinhvien {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG QUẢN LÝ SINH VIÊN ===\n");
        
        qlsinhvien qlsv = new qlsinhvien();

        // Thêm dữ liệu mẫu
        qlsv.themsinhvien(new sinhvien("SV001", "Nguyễn Văn A", 8.5));
        qlsv.themsinhvien(new sinhvien("SV002", "Trần Thị B", 7.2));
        qlsv.themsinhvien(new sinhvien("SV003", "Lê Văn C", 6.8));
        qlsv.themsinhvien(new sinhvien("SV004", "Phạm Thị D", 9.1));
        qlsv.themsinhvien(new sinhvien("SV005", "Hoàng Văn E", 5.5));

        qlsv.hienThiDanhSach();

        System.out.println("\n=== TÌM KIẾM SINH VIÊN ===");
        sinhvien sv = qlsv.timtheoma("SV003");
        System.out.println("Kết quả tìm SV003: " + (sv != null ? sv : "Không tìm thấy"));

        System.out.println("\n=== SINH VIÊN ĐIỂM CAO NHẤT ===");
        sinhvien svMax = qlsv.timdiemcaonhat();
        System.out.println(svMax != null ? svMax : "Danh sách trống");

        System.out.println("\n=== ĐIỂM TRUNG BÌNH LỚP ===");
        double dtbLop = qlsv.tinhDiemTrungBinhLop();
        System.out.printf("Điểm TB cả lớp: %.2f%n", dtbLop);

        // Sắp xếp
        System.out.println("\n=== SẮP XẾP GIẢM DẦN THEO ĐIỂM ===");
        qlsv.sapXepTheoDiemGiamDan();
        qlsv.hienThiDanhSach();

        // Xóa sinh viên
        System.out.println("\n=== XÓA SINH VIÊN ===");
        qlsv.xoaSinhVien("SV002");
        qlsv.hienThiDanhSach();
    }
}

