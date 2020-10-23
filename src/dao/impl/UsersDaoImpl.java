package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.IUsersDao;
import db.DB;
import po.Users;

public class UsersDaoImpl implements IUsersDao {
	private DB db;
	
	public UsersDaoImpl() {
		db=new DB();
	}

	@Override
	public boolean regUser(Users user) {
		String sql="insert into users values('"+user.getUno()+"','"+user.getUpwd()+"','”√ªß')";
		if(db.update(sql)==1){
			return true;
		}
		return false;
	}

	@Override
	public boolean loginUser(Users user) {
		String sql="select UNO from users where UNO='"+user.getUno()+"' and UPWD='"+user.getUpwd()+"'";
		ResultSet rs = db.query(sql);
		try {
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
