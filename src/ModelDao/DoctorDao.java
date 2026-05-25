package ModelDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Departments;

public class DoctorDao {
	

	// Add Patient
	public int AddDepartment(Departments d) {
		int i=0;
		
		try {
			Connection con =DBUtil.makeConnection();
			PreparedStatement pst= con.prepareStatement
			("insert into patients(departmnet_name,location) values(?,?)");
			pst.setString(1, d.getDepartment_name());
			pst.setString(2, d.getLocation());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	// Remove Patient
	public int removeDepartment(Departments d) {
		int i=0;
		
		try {
			Connection con =DBUtil.makeConnection();
			PreparedStatement pst= con.prepareStatement("remove from department where department_id=?");
			pst.setInt(1, d.getDepartment_id());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	// update Patient
	public int UpdateDepartment(Departments d) {
		int i=0;
		
		try {
			Connection con =DBUtil.makeConnection();
			PreparedStatement pst= con.prepareStatement("update department set department_name=?, location=? where department_id=?");
			pst.setString(1, d.getDepartment_name());
			pst.setString(2, d.getLocation());
			pst.setInt(3, d.getDepartment_id());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	// view Patient
	public List viewDepartment() {
		ArrayList<Departments> list=new ArrayList<Departments>();
		
		try {
			Connection con =DBUtil.makeConnection();
			PreparedStatement pst= con.prepareStatement("select * from departments");
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				Departments d= new Departments(rs.getInt("department_id"),
				rs.getString("department_name"),
				rs.getString("location"));						
			    list.add(d);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

}
