package Duy.hethonghinhhoc;

public class HinhChuNhat extends HinhHoc {
	private double chieudai;
    private double chieurong;

    public HinhChuNhat(String ten, String mausac, double chieudai, double chieurong) {
        super(ten, mausac);
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    @Override
    public double tinhdientich() {
    	return chieudai * chieurong;
    }
    @Override
    public double tinhchuvi() {
    	return(chieudai + chieurong) * 2;
    	
    }
}
