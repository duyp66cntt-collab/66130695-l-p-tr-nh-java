
public class run {

	public static void main(String[] args) {
		ChuNhat cn1 = new ChuNhat();
		ChuNhat cn2 = new ChuNhat(20, 15);
		ChuNhat hv = new ChuNhat(20, 20);
		double cn1_dai=cn1.getdai();
		double cn1_rong=cn1.getrong();
		System.out.print("Hinh chu nhat co chieu dai la: ");
		System.out.print(cn1_dai);
		System.out.print("Hinh chu nhat co chieu rong la: " + cn1_rong);
		
		cn1.setdai(50);
		System.out.print("sau khi thay doi chieu dai \n");
		cn1_dai=cn1.getdai();
	    cn1_rong=cn1.getrong();
		System.out.print("Hinh chu nhat co chieu dai la: ");
		System.out.print(cn1_dai);
		System.out.print("Hinh chu nhat co chieu rong la: " + cn1_rong);
		System.out.print(cn1.toString());
		
		

	}

}
