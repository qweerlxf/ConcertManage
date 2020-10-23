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
	
	//ִ����ɾ��
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
		
		//ִ�в�ѯ
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
			// java.lang.NullPointerException  ��ָ���쳣��ͨ���ڶ���û�г�ʼ��ʱ����
			DB db = new DB();
		}
	
}
