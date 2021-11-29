package test.file;

import java.io.*;  
import java.util.*;  

class Copyfile {
	public static void main(String arg[]) throws Exception {

		FileReader fin = new FileReader("D:\\my\\readfile.txt");
		FileWriter fout = new FileWriter("D:\\my\\readfile1.txt", true);
		int c;
		while ((c = fin.read()) != -1) {
			fout.write(c);
		}
		System.out.println("Copy finish...");
		fin.close();
		fout.close();
	}
}
