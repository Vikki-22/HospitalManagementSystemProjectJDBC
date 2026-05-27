package Controller;

import java.util.List;

import Entity.Appointments;
import Entity.DoctorAppointmentReport;
import Entity.Doctors;
import Entity.Patients;
import ModelDao.AppointmentsDao;
import View.AppointmentView;

public class AppointmentController {

    private AppointmentsDao dao =
            new AppointmentsDao();

    private AppointmentView view =
            new AppointmentView();

    public void start() {

        while (true) {

            int choice = view.showMenu();

            switch (choice) {

            // Add Appointment
            case 1:

                Patients p1 = new Patients();

                p1.setPatient_id(
                        view.getPatientId());

                Doctors d1 = new Doctors();

                d1.setDoctor_id(
                        view.getDoctorId());

                Appointments a1 =
                        new Appointments(

                        p1,
                        d1,
                        view.getAppointmentTime(),
                        view.getAppointmentReason()

                );

                int add =
                        dao.addAppointment(a1);

                if (add > 0) {

                    System.out.println(
                    "Appointment Added Successfully...");
                }
                else {

                    System.out.println(
                    "Appointment Not Added...");
                }

                break;

            // Delete Appointment
            case 2:

                int deleteId =
                        view.getAppointmentId();

                int delete =
                        dao.deleteAppointment(deleteId);

                if (delete > 0) {

                    System.out.println(
                    "Appointment Deleted Successfully...");
                }
                else {

                    System.out.println(
                    "Appointment Not Deleted...");
                }

                break;

            // View Appointment By Id
            case 3:

                int viewId =
                        view.getAppointmentId();

                Appointments a =
                        dao.viewAppointmentById(viewId);

                if (a != null) {

                    System.out.println(a);
                }
                else {

                    System.out.println(
                    "Appointment Not Found...");
                }

                break;

            // Update Appointment
            case 4:

                Patients p2 = new Patients();

                p2.setPatient_id(
                        view.getPatientId());

                Doctors d2 = new Doctors();

                d2.setDoctor_id(
                        view.getDoctorId());

                Appointments a2 =
                        new Appointments(

                        p2,
                        d2,
                        view.getAppointmentTime(),
                        view.getAppointmentReason()

                );

                a2.setAppointment_id(
                        view.getAppointmentId());

                int update =
                        dao.updateAppointment(a2);

                if (update > 0) {

                    System.out.println(
                    "Appointment Updated Successfully...");
                }
                else {

                    System.out.println(
                    "Appointment Not Updated...");
                }

                break;

            // Doctor Appointment Report
            case 5:

                List<DoctorAppointmentReport> report =
                        dao.getDoctorWiseAppointments();

                if(report.isEmpty()) {

                    System.out.println(
                    "No Data Found...");
                }
                else {

                    for(DoctorAppointmentReport r
                            : report) {

                        System.out.println(r);
                    }
                }

                break;

            // Exit
            case 6:

                System.out.println(
                "Application Closed...");

                return;

            default:

                System.out.println(
                "Invalid Choice...");
            }
        }
    }
}