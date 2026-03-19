package Duy.hethonghinhhoc;

public class Run {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat("Hình Chữ Nhật ", " Đỏ ", 5, 10);
		hcn.hienthithongtin();
		HinhTron ht = new HinhTron("Hình Tròn", "Xanh", 3);
		ht.hienthithongtin();
		HinhTamGiac htg = new HinhTamGiac("Hình Tam Giác", "Vàng", 3, 4, 5);
        if(htg.kiemtrahople()) {
            htg.hienthithongtin();
        } else {
            System.out.println("\nTam giác không hợp lệ!");
        }

	}

}
