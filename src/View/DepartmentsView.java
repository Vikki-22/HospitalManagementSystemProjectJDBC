package View;

import java.util.Scanner;


public class DepartmentsView {
    private Scanner sc= new Scanner(System.in);
    
    public int ShowMenu()
    {
        System.out.println("-----------Departments View----------");
        System.out.println("Enter 1 : for add Depratments");
        System.out.println("Enter 2 : for delete Depratments");
        System.out.println("Enter 3 : for view Depratments");
        System.out.println("Enter 4 : for update Departments details");
        System.out.println("Enter 5 : for exit..");
    	System.out.println("Enter the choice :");
    	int i=sc.nextInt();
    	
    	return i;
    }  
    
    public int getDepartmentId() {
    	sc.nextLine();
    	System.out.println(" enter the id  of department...");
    	return sc.nextInt();
    }
    
    public String getDepartmentName() {
    	sc.nextLine();
    	System.out.println(" enter the name  of department...");
    	return sc.nextLine();
    	
    }
    
    public String getDepartmentlocation() {
    	sc.nextLine();
    	System.out.println(" enter the name  of department...");
    	return sc.nextLine();
    }
    
}
