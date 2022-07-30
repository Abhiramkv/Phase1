package practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
	
	public static void append(String filename,String str) throws IOException {
		
		BufferedWriter output = new BufferedWriter(new FileWriter(filename,true)); 
		output.write(str);
		output.close();
	}

	public static void main(String[] args) throws IOException {
		
		String filename = "file2.txt";
		String str = " this is the process done by append";
		append(filename,str);
		
		try {
			BufferedReader in = new BufferedReader(
				new FileReader("file2.txt"));

			String mystring;
			while ((mystring = in.readLine()) != null) {
				System.out.println(mystring);
			}
		}

		catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
	}





}



