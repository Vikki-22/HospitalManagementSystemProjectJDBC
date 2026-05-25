package ModelDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Departments;
import Entity.Patients;

public class PatientsDao {
	
	// Add Patient
	public int AddPatient(Patients p) {
		int i=0;
		
		try {
			Connection con =DBUtil.makeConnection();
			PreparedStatement pst= con.prepareStatement
			("insert into patients(first_name,last_name,gender,"
					+ "phone,email,addredd,bloud_group) values(?,?,?,?,?,?,?)");
			pst.setString(1, p.getFirst_name());
			pst.setString(2, p.getLast_name());
			pst.setString(3, p.getGender());
			pst.setString(4, p.getPhone());
			pst.setString(5, p.getEmail());
			pst.setString(6, p.getAddress());
			pst.setString(7, p.getBlood_group());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	// Remove Patient
	public int removePatient(Patients p) {
		int i=0;
		
		try {
			Connection con =DBUtil.makeConnection();
			PreparedStatement pst= con.prepareStatement("remove from patients where department_id=?");
			pst.setInt(1, p.getPatient_id());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	// update Patient
	public int UpdatePatient(Patients p) {
		int i=0;
		
		try {
			Connection con =DBUtil.makeConnection();
			PreparedStatement pst= con.prepareStatement("update patients set first_name=?,last_name=?,gender=?,phone=?,email=?,addredd=?,bloud_group=?) where department_id=?");
			pst.setString(1, p.getFirst_name());
			pst.setString(2, p.getLast_name());
			pst.setString(3, p.getGender());
			pst.setString(4, p.getPhone());
			pst.setString(5, p.getEmail());
			pst.setString(6, p.getAddress());
			pst.setString(7, p.getBlood_group());
			pst.setInt(8, p.getPatient_id());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	// view Patient
	public List viewDepartment() {
		ArrayList<Patients> list=new ArrayList<Patients>();
		
		try {
			Connection con =DBUtil.makeConnection();
			PreparedStatement pst= con.prepareStatement("select * from patients");
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				Patients p= new Patients(rs.getInt("patient_id"), rs.getString("firest_name"),rs.getString("last_name"), rs.getString("gender"), rs.getString("phone"), null, null, null, null, null)						
			    list.add(d);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

}
