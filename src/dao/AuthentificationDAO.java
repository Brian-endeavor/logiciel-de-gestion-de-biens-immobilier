package dao;

import java.sql.*;

public class AuthentificationDAO extends ConnectionDAO {
	public AuthentificationDAO() {
		super();
	}
	public int verification(int id, String password) {
		int returnValue = 0;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM authentification WHERE id = ? AND password = ?");
			ps.setInt(1, id);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				returnValue = 0;
			}
			else {
				returnValue = 1;
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			
			try {
				if(rs != null)
					rs.close();
			} catch(Exception ignore) {
				
			}
			try {
				if(ps != null)
					ps.close();
			}  catch(Exception ignore) {
		}
	}
         return  returnValue;
	}
}
