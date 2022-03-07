package test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	private Integer eId;
	private String eName;
	private Integer eAge;
	private Integer eSalary;
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer geteAge() {
		return eAge;
	}
	public void seteAge(Integer eAge) {
		this.eAge = eAge;
	}
	public Integer geteSalary() {
		return eSalary;
	}
	public void seteSalary(Integer eSalary) {
		this.eSalary = eSalary;
	}
	public Employee(Integer eId, String eName, Integer eAge, Integer eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}

	
	
	public static void main(String args[]) throws ClassNotFoundException {
		
		
		List<Employee> elist=new ArrayList<Employee>();
		
	   
	    elist.add(new Employee(4,"dd",14,4000));
	    elist.add(new Employee(5,"ee",115,15000));
	    elist.add(new Employee(1,"aa",11,1000));
	    elist.add(new Employee(3,"ff",16,7000));
	    elist.add(new Employee(2,"bb",12,2000));
	    elist.add(new Employee(3,"cc",13,3000));
	   
	    
	    
		System.out.println("Total No of employess => " + elist.stream().count());

		Employee highstSalry = elist.stream()
				.max((a, b) -> a.eSalary > b.geteSalary() ? +1 : a.eSalary < b.geteSalary() ? -1 : 0).get();
		System.out.println("employee having highst salary => " + highstSalry.eName);

		Employee lowstSalry = elist.stream()
				.min((a, b) -> a.eSalary > b.geteSalary() ? +1 : a.eSalary < b.geteSalary() ? -1 : 0).get();
		System.out.println("employee having min salary => " + lowstSalry.eName);

		System.out.println("sort employee objects using numer field");
		elist.stream().sorted((a, b) -> a.geteAge().compareTo(b.geteAge())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.eName));

		System.out.println("sort employee objects using string field");
		elist.stream().sorted((a, b) -> a.geteName().compareTo(b.geteName())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.eName));

		// to print sum of ages
		System.out.println(elist.stream().collect(Collectors.summarizingDouble(e -> e.eAge)));
		// to pring avg valus of ages
		System.out.println(elist.stream().collect(Collectors.averagingDouble(e -> e.eAge)));
	     
		System.out.println("return single obejct from the filter ");
		Employee result2 = elist.stream().filter(x -> "cc".equals(x.geteName())).findAny().orElse(null);
		
	
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
	}
	
	
}