package Duy.hethonghinhhoc;

public class HinhTamGiac extends HinhHoc{
	private double canhA, canhB, canhC;
	
	public HinhTamGiac(String ten, String mausac, double a, double b, double c) {
		super(ten, mausac);
		this.canhA= a;
		this.canhB= b;
		this.canhC= c;
	}
	public boolean kiemtrahople() {
		return (canhA + canhB > canhC) &&  (canhA + canhC > canhB) && (canhB + canhC > canhA);
	}
	@Override
	public double tinhchuvi() {
		if(kiemtrahople()) {
			return canhA + canhB + canhC;
		}
		return 0;
	}
	@Override
	public double tinhdientich() {
		if(kiemtrahople()) {
			double p= tinhchuvi() / 2;
			return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
		}
		return 0;
	}

}
