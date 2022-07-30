package practice2;

import java.io.File;


public class CreateFile {

	public static void main(String[] args) {
		
		File file = new File("file1.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("file is created");
			}
			else {
				System.out.println("already exists");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
