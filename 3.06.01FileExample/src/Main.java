import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String path = "C:\\I am learning JAVA\\3.06.01FileÖrnek\\urunler.txt";
		FileInputStream fis = new FileInputStream(path);
		
		while(fis.read() != -1) {
			System.out.print((char)fis.read());
			
		}
 	}
}
