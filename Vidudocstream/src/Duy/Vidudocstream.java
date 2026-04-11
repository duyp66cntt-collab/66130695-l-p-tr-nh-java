package Duy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vidudocstream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream("baitho.txt");
		
		InputStreamReader ipReader = new InputStreamReader(fInput);
		
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		//System.out.print("Nhap mot chuoi bat ki: ");
		String line1 = bufReader.readLine();
		
		System.out.print(line1);

	}

}
