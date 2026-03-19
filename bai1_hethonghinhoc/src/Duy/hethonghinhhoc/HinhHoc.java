package Duy.hethonghinhhoc;

public class HinhHoc {
	protected String ten;
	protected String mausac;
	
	public HinhHoc(String ten, String mausac) {
		this.ten= ten;
		this.mausac = mausac;
	}
	public double tinhdientich() {
		return 0;
	}
	public double tinhchuvi() {
		return 0;
	}
	public void hienthithongtin() {
		System.out.print("\nTên hình: " + ten);
		System.out.print("\nMàu sắc: " + mausac);
		System.out.print("\nChu vi: " + tinhchuvi());
		System.out.print("\nDiện tích: " + tinhdientich());
	}
}
