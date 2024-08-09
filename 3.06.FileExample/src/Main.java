import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("kod.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		String val = "asdasd";
		FileWriter fWriter = new FileWriter(file, false);

		BufferedWriter bWritter = new BufferedWriter(fWriter);

		bWritter.write(val);
		bWritter.write("\nJAVA");
		bWritter.close();

		FileReader fReader = new FileReader(file);
		String line;

		BufferedReader bReader = new BufferedReader(fReader);
		while ((line = bReader.readLine()) != null) {
			System.out.println(line);
		}
		bReader.close();

	}

}
