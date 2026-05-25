package View;

import java.util.Scanner;

public class BillsView {
	private Scanner sc=new Scanner(System.in);
	public int ShowMenu()
    {
        System.out.println("-----------Bills View----------");
        System.out.println("Enter 1 : for add Bills");
        System.out.println("Enter 2 : for delete Bills");
        System.out.println("Enter 3 : for view Bills");
        System.out.println("Enter 4 : for update Bills Details ");
        System.out.println("Enter 5 : for exit..");
    	System.out.println("Enter the choice :");
    	int i=sc.nextInt();
    	
    	return i;
    }  
    
    public int getBillsId() {
    	sc.nextLine();
    	System.out.println(" Enter the Billsid ...");
    	return sc.nextInt();
    }
    
    public int getBillsPatientId() {
    	sc.nextLine();
    	System.out.println(" Enter the billsPatientid...");
    	return sc.nextInt();
    }
    
    public int getbillsAppointmentId() {
    	sc.nextLine();
    	System.out.println(" Enter the bills Appointment id....");
    	return sc.nextInt();
    }
    
    public int getbillsAppointmentDoctorId() {
    	sc.nextLine();
    	System.out.println(" Enter the bills appointment docror id....");
    	return sc.nextInt();
    }
    
    
    public String getTotalAmount() {
    	sc.nextLine();
    	System.out.println(" Enter the total amount of bills....");
    	return sc.nextLine();
    }
    
    public String getPaymentStatus() {
    	sc.nextLine();
    	System.out.println(" Enter the Payment Status....");
    	return sc.nextLine();
    }
    
    

}
