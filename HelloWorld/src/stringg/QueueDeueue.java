//Create A set with all the implanatation with user defined class 
//employee and perform the insert delete and searching and sorting
package stringg;
import java.io.*;
import java.util.*;

public class QueueDeueue {
	public static void main(String args[]) {

    Set<String> emp = new HashSet<String>();
    //Adding or inserting the elements
    emp.add("Employee Name");
    emp.add("Employee Id");
    emp.add("Emp Address");
    emp.add("Emp Depatrment");
    
    
    //Printing all the inserted Or Added elements in the Set
    System.out.println(emp);
    
    
    //deleting OR removing the elements
    emp.remove("Employee Id");
    
    //To check if a certain element is present in set--Searching is done
    System.out.println("Does the above set contains 'Emp Depatrment'?" + emp.contains("Emp Depatrment"));
   
    //To search if "Employee Name" is present in the Set
    System.out.println("Does the Set conatins 'Employee Name'?"
    		+emp.contains("Employee Name"));
   
    //Sorting hashSet using ArrayList
    List<String> list = new ArrayList<String>(emp);
    Collections.sort(list);
    
    //Printing the sorted elements of the HashSet
    System.out.println("HashSet elements in sorted order using List:" +list);
    
}
}

