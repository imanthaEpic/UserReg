package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
    private String dburl = "jdbc:mysql://localhost:3306/employee_management";
    private String dbuname = "root";
    private String dbpassword = "123456";
    private String dbdriver = "com.mysql.jdbc.Driver";
    
    public void loadDriver(String dbDriver){
        
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    } 
    
    public Connection getConnection() throws SQLException{
        Connection con = null;
        try {
        con = DriverManager.getConnection(dburl, dbuname, dbpassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public String insert(Member member) throws SQLException{
        
        loadDriver(dbdriver);
        Connection con = getConnection();
        String result = "Data entered successfully";
        String sql = "INSERT INTO employee_management.members VALUES(?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, member.getUname());
            ps.setString(2, member.getPassword());
            ps.setString(3, member.getEmail());
            ps.setString(4, member.getPhone());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
            result = "Data not entered!";
        }
        
        return result;
    }
}
