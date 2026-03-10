
public class ChuNhat {
	private double dai;
	private double rong;
	
	public ChuNhat() {
		dai=10;
		rong=5;
	}
	public ChuNhat(double dai, double rong) {
		this.dai=dai;
		this.rong=rong;
	}
	double getdai() {
		return dai;
	}
	double getrong() {
		return rong;
	}
	void setdai(double daiM) {
		this.dai=daiM;
	}
	void setrong(double rongM) {
		this.rong= rongM;
	}
	public String toString() {
		String s="hinh nay co chieu dai= ";
		s = s + dai;
		s= s + "va chieu rong = " + rong;
		 s="hinh nay co chieu dai= " + dai +" va chieu rong =" + rong; 
		
		return s;
	}

}
