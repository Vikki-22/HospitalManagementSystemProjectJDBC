package View;

import java.util.Scanner;

public class AppointmentsView {
	
	
	private Scanner sc=new Scanner(System.in);
	public int ShowMenu()
    {
        System.out.println("-----------Appointments View----------");
        System.out.println("Enter 1 : for add Appointments");
        System.out.println("Enter 2 : for delete Appointments");
        System.out.println("Enter 3 : for view Appointments");
        System.out.println("Enter 4 : for update Appointments Details ");
        System.out.println("Enter 5 : for exit..");
    	System.out.println("Enter the choice :");
    	int i=sc.nextInt();
    	
    	return i;
    }  
    
    public int getAppointmentId() {
    	sc.nextLine();
    	System.out.println(" enter the Appointmentid ...");
    	return sc.nextInt();
    }
    
    public int getAppointmentPatientId() {
    	sc.nextLine();
    	System.out.println(" enter the AppointmentPatientid...");
    	return sc.nextInt();
    }
    
    public int getAppointmentDoctorId() {
    	sc.nextLine();
    	System.out.println(" enter the appointment docror id...");
    	return sc.nextInt();
    }
    
    
    public String getAppointmentsReason() {
    	sc.nextLine();
    	System.out.println(" enter the reason of appointment...");
    	return sc.nextLine();
    	
    }
}
