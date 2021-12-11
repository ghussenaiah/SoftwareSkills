package test.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String ename;
	int eno;
	public int marks;

	public Student(String ename, int eno) {
		super();
		this.ename = ename;
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "Student [ename=" + ename + ", eno=" + eno + "]";
	}

}

/*
 * class StudentNo implements Comparator<Student> {
 * 
 * @Override public int compare(Student arg0, Student arg1) {
 * 
 * return arg0.eno - arg1.eno; }
 * 
 * }
 * 
 * class StudentName implements Comparator<Student> {
 * 
 * @Override public int compare(Student arg0, Student arg1) {
 * 
 * return arg0.ename.compareTo(arg1.ename); } }
 */
 
public class ComparatorUsingStudentObj {
	
	
	void test() {
		System.out.println("Heloo");
	}

	public static void main(String args[]) {

		List<Student> slist = new ArrayList<Student>();

		slist.add(new Student("David1", 100));
		slist.add(new Student("David4", 500));
		slist.add(new Student("David3", 800));
		slist.add(new Student("David2", 50));

/*
 * System.out.println(slist); Collections.sort(slist,new StudentNo());
 * System.out.println(slist); Collections.sort(slist,new StudentName());
 * System.out.println(slist);
 */

		System.out.println(slist);
		Comparator<Student> eno = (arg0, arg1) -> arg0.eno - arg1.eno;
		Collections.sort(slist, eno);
		System.out.println(slist);
		Comparator<Student> ename = (arg0, arg1) -> arg0.ename.compareTo(arg1.ename);
		Collections.sort(slist, ename);
		System.out.println(slist);
		
	}
}








