package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private Connection conn;
	private Statement stmt;
	public DB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"system","lxflxf");
			//System.out.println(conn.isClosed());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	//执行增删改
		public int update(String sql){
			System.out.println(sql);
			try {
				this.stmt = conn.createStatement();
				return this.stmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return -1;
		}
		
		//执行查询
		public ResultSet query(String sql){
			System.out.println(sql);
			try {
				this.stmt=conn.createStatement();
				return this.stmt.executeQuery(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public static void main(String[] args) {
			// java.lang.NullPointerException  空指针异常，通常在对象没有初始化时出现
			DB db = new DB();
		}
	
}
