package practice2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter Write = new FileWriter("file2.txt");
		
		Write.write("this is the writer file");
		Write.close();
		System.out.println("file is written");

	}

}
