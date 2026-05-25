package View;

import java.util.Scanner;

public class PatientsView {
        
private Scanner sc= new Scanner(System.in);
    
    public int ShowMenu()
    {
        System.out.println("-----------Patients View----------");
        System.out.println("Enter 1 : for add Patient");
        System.out.println("Enter 2 : for delete Patient");
        System.out.println("Enter 3 : for view Patients Details");
        System.out.println("Enter 4 : for view All Patients");
        System.out.println("Enter 5 : for update Patients Details");
        System.out.println("Enter 6 : for exit..");
    	System.out.println("Enter the choice :");
    	int i=sc.nextInt();
    	
    	return i;
    }  
    
    public int getPatientId() {
    	sc.nextLine();
    	System.out.println(" enter the id  of patient...");
    	return sc.nextInt();
    }
    
    public String getPatientFirstName() {
    	sc.nextLine();
    	System.out.println(" enter the first name of patient...");
    	return sc.nextLine();
    	
    }
    public String getPatientLastName() {
    	sc.nextLine();
    	System.out.println(" enter the last name of patient...");
    	return sc.nextLine();
    	
    }
    public String getPatientGender() {
    	sc.nextLine();
    	System.out.println(" enter the gender f patient...");
    	return sc.nextLine();
    }
    public String getPatientAddress() {
    	sc.nextLine();
    	System.out.println(" enter the address of patient...");
    	return sc.nextLine();
    }
    public String getPatientEmail() {
    	sc.nextLine();
    	System.out.println(" enter the email of patient...");
    	return sc.nextLine();
    }
    public String getPatientPhone() {
    	sc.nextLine();
    	System.out.println(" enter the phone no of patient...");
    	return sc.nextLine();
    }
    public String getPatientBloodGroup() {
    	sc.nextLine();
    	System.out.println(" enter the gender  of patient...");
    	return sc.nextLine();
    }
    
}
