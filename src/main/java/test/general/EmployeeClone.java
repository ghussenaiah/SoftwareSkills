package test.general;

import java.util.Objects;

public class EmployeeClone implements Cloneable   
{  
    int id;  
    String name;  
  
    public String toString()   
    {  
        return "id:- " + id + " name:- " + name;  
    }  
    static public void main(String sd[]) throws CloneNotSupportedException   
    {  
    	EmployeeClone e1 = new EmployeeClone();  
        e1.id = 101;  
        e1.name = "Shweta";  
  
        EmployeeClone e2 = (EmployeeClone) e1.clone();  
        System.out.println("Actual Object e1:- " + e1);  
        System.out.println("Cloned Object e2:- " + e2);  
        System.out.println("Actual object identity:- " + e1.hashCode());  
        System.out.println("Cloned object identity:- " + e2.hashCode()); //both e1 and e2 object are separate objects inside heap  
        System.out.println("Cloned object identity:- " + e1.equals(e2));
        
        System.out.println("first object:- " + e1);
        
        System.out.println("second object:- " + e2);
        if(e1==e2) {
        	 System.out.println("address comparision");  
        }
        
      
    }
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeClone other = (EmployeeClone) obj;
		return id == other.id && Objects.equals(name, other.name);
	}  
  
}  