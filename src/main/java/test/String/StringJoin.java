package test.String;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoin {

	// Main driver method
    public static void main(String[] args)
    {
        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<>();
 
        // Adding elements to above List
        al.add("Ram");
        al.add("Shyam");
        al.add("Alice");
        al.add("Bob");
 
        StringJoiner sj1 = new StringJoiner(",");
 
        System.out.println("empt value -> "+sj1);
 
        sj1.add(al.get(0)).add(al.get(1));
        System.out.println(sj1);
 
        // Using length() method
        System.out.println("Length of sj1 : "
                           + sj1.length());
 
        StringJoiner sj2 = new StringJoiner(":");
        sj2.add(al.get(2)).add(al.get(3));
        
        System.out.println(sj2);
 
        // Using merge() method
        sj1.merge(sj2);
 
        // Using toString() method
        System.out.println(sj1.toString());
 
        System.out.println("Length of new sj1 : "
                           + sj1.length());
}
};


















