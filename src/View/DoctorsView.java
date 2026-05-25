package View;

import java.util.Scanner;

public class DoctorsView {
	
	private Scanner sc=new Scanner(System.in);
	public int ShowMenu()
    {
        System.out.println("-----------Doctor View----------");
        System.out.println("Enter 1 : for add Doctor");
        System.out.println("Enter 2 : for delete Doctor");
        System.out.println("Enter 3 : for view Doctor Details");
        System.out.println("Enter 4 : for view All Doctor");
        System.out.println("Enter 5 : for update Doctor Details ");
        System.out.println("Enter 6 : for exit..");
    	System.out.println("Enter the choice :");
    	int i=sc.nextInt();
    	
    	return i;
    }  
    
    public int getDoctorId() {
    	sc.nextLine();
    	System.out.println(" enter the id  of doctor...");
    	return sc.nextInt();
    }
    
    public String getDoctorFirstName() {
    	sc.nextLine();
    	System.out.println(" enter the first name of doctor...");
    	return sc.nextLine();
    	
    }
    public String getDoctorLastName() {
    	sc.nextLine();
    	System.out.println(" enter the last name of doctor...");
    	return sc.nextLine();
    	
    }
    public String getDoctorSpecilization() {
    	sc.nextLine();
    	System.out.println(" enter the specilization doctor...");
    	return sc.nextLine();
    }
   
    
    public String getdoctorEmail() {
    	sc.nextLine();
    	System.out.println(" enter the email of doctor...");
    	return sc.nextLine();
    }
    public String getdoctorPhone() {
    	sc.nextLine();
    	System.out.println(" enter the phone no of doctor...");
    	return sc.nextLine();
    }
  
    

}
