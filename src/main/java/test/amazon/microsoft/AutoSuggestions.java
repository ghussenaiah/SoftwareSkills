package test.amazon.microsoft;

import java.util.ArrayList;
import java.util.List;

public class AutoSuggestions {
	
	
	
	static List<String> query(String queryStr, List<Student> list) {
        List<String> suggestion = new ArrayList<>();
        list.forEach(std -> {
            if (isMatched(queryStr, String.valueOf(std.rollno))) {
                suggestion.add(String.valueOf(std.rollno));
            }

            if (isMatched(queryStr, std.name)) {
                suggestion.add(std.name);
            }

            if (isMatched(queryStr, std.address)) {
                suggestion.add(std.address);
            }
        });

        return suggestion;
    }

    private static boolean isMatched(String query, String text) {
        return text.toLowerCase().contains(query.toLowerCase());
    }
    
    
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(101, "Abc ghi", "USA"));
        list.add(new Student(102, "DEF", "UST"));
        list.add(new Student(103, "Ghi ab", "DSjkD"));
        list.add(new Student(104, "jKL ut", "USN"));
        list.add(new Student(105, "MNP", "TSA101"));
        list.add(new Student(106, "UTC ABC", "ESA"));

        List<String> sugg = query("01", list);
        sugg.forEach(System.out::println);
    }

}
