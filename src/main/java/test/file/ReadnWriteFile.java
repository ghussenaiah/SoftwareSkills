package test.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ReadnWriteFile {
	public static void main(String[] args) throws IOException {
		// variable declaration
		int ch;

		// check if File exists or not

		FileWriter fw = new FileWriter("D:\\my\\readfile.txt");
		fw.append("******* hello wolrd **************");
		fw.close();

		FileReader fr = null;
		try {
			fr = new FileReader("D:\\my\\readfile.txt");
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}
		// read from FileReader till the end of file
		while ((ch = fr.read()) != -1)
			System.out.print((char) ch);

		// close the file
		fr.close();
	}
}
