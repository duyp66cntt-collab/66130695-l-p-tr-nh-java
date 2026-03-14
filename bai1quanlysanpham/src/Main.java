import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySanPham ql = new QuanLySanPham();
        int chon;

        do {
            System.out.println("\n--- MENU QUẢN LÝ SẢN PHẨM ---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm theo mã");
            System.out.println("3. Tìm sản phẩm theo tên");
            System.out.println("4. Sắp xếp sản phẩm theo giá");
            System.out.println("5. Tính tổng giá trị kho");
            System.out.println("6. Liệt kê sản phẩm sắp hết hàng (<10)");
            System.out.println("7. Hiển thị tất cả sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine(); // Xóa bộ nhớ đệm

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã SP: "); String ma = sc.nextLine();
                    System.out.print("Nhập tên SP: "); String ten = sc.nextLine();
                    System.out.print("Nhập giá: "); double gia = sc.nextDouble();
                    System.out.print("Nhập số lượng: "); int sl = sc.nextInt();
                    ql.themSP(new SanPham(ma, ten, gia, sl));
                    break;
                case 2:
                    System.out.print("Nhập mã cần xóa: "); String maXoa = sc.nextLine();
                    if (ql.xoaTheoMa(maXoa)) System.out.println("Xóa thành công!");
                    else System.out.println("Không tìm thấy mã.");
                    break;
                case 3:
                    System.out.print("Nhập tên cần tìm: "); String tenTim = sc.nextLine();
                    ql.timTheoTen(tenTim);
                    break;
                case 4:
                    System.out.print("1. Tăng dần | 2. Giảm dần: ");
                    int kieu = sc.nextInt();
                    ql.sapXepTheoGia(kieu == 1);
                    ql.hienThiTatCa();
                    break;
                case 5:
                    System.out.println("Tổng giá trị kho: " + ql.tinhTongGiaTri());
                    break;
                case 6:
                    ql.lietKeSapHetHang();
                    break;
                case 7:
                    ql.hienThiTatCa();
                    break;
            }
        } while (chon != 0);
    }
}
