package practice2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("file2.txt");
		Scanner read = new Scanner(file);
		while(read.hasNextLine()) {
			String obj = read.nextLine();
			System.out.println(obj);
		}
		read.close();

	}

}
