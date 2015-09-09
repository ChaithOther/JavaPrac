package DBConn;

import java.sql.*;

public class ConenctDB_2 {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "munnu";
		String password = "munnu";
		
		try{
			Class.forName(driver).newInstance();//Create Object of a Driver class
			conn = DriverManager.getConnection(url+dbName, userName, password);
			// connection will be established
			
			//********************Statement***********************
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from users");
			
    /**			
			rs.next();//1st row
			System.out.println(rs.getString("city"));//city is column name
//			System.out.println(rs.getString(1));//1 is the index of the column which is city in db
			rs.next();//2nd row
			System.out.println(rs.getString("city"));
	**/	
			
//			while(rs.next()){
//				System.out.println(rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3));
//			}**/
			//********************End of Statement***********************
			
			//********************Prepared Statement***********************
			PreparedStatement pstmt = conn.prepareStatement("select * from users where name = ? and sex = ?");
			pstmt.setString(1,  "B");
			pstmt.setString(2, "F");
			ResultSet rs1 = pstmt.executeQuery();
			while(rs1.next()){
				System.out.println(rs1.getString(1)+"--"+rs1.getString(2)+"--"+rs1.getString(3));
			}
			//********************End of Prepared Statement***********************

			
			//********************Callable Statement - incomplete***********************
			
		}catch (Exception e){
			
		}finally{
			conn.close();
		}
		
	}

}
