package test.logics;

import java.io.Serializable;




//Java program to demonstrate transient keyword
//Filename Test.java
import java.io.*;
class SerializableClass implements Serializable
{
	// Normal variables
	int i = 10, j = 20;

	// Transient variables
	transient int k = 30;

	// Use of transient has no impact here
	transient static int l = 40;
	transient final int m = 50;

	public static void main(String[] args) throws Exception
	{
		SerializableClass input = new SerializableClass();

		// serialization
		FileOutputStream fos = new FileOutputStream("/home/husenaiah/Downloads/abc1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(input);

		// de-serializatione
		FileInputStream fis = new FileInputStream("/home/husenaiah/Downloads/abc1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializableClass output = (SerializableClass)ois.readObject();
		System.out.println("i = " + output.i);
		System.out.println("j = " + output.j);
		System.out.println("k = " + output.k);
		System.out.println("l = " + output.l);
		System.out.println("m = " + output.m);
	}
}
