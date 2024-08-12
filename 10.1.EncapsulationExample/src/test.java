import java.util.Scanner;

import com.c.Numara;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Numara numara1 = new Numara();
		
		System.out.println("TC giriniz: ");
		
		String tc = scanner.nextLine();
		
		numara1.setKimlikNumarası(tc);
		
		

	}
	
	

}
