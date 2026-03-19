package Duy.hethonghinhhoc;

public class HinhTron extends HinhHoc {
	private double bankinh;
	
	public HinhTron(String ten, String mausac, double bankinh) {
		super(ten, mausac);
		this.bankinh = bankinh;
	}
	@Override
	public double tinhdientich() {
		return Math.PI * bankinh * bankinh;
	}
	@Override
	public double tinhchuvi() {
		return 2*Math.PI * bankinh;
	}
}
