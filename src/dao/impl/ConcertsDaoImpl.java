package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.ConcertsDao;
import db.DB;
import po.Concerts;

public class ConcertsDaoImpl {
private DB db;
	
	public ConcertsDaoImpl() {
		db=new DB();
	}
	//查看全部商品
	public ArrayList<Concerts> selectConcerts() {
		String sql="select g.gid,g.gname,g.gprice,g.gnum,g.state,s.sname from goods g,sorts s where g.sort=s.sort";
		ArrayList<Concerts> list = new ArrayList<Concerts>();
		ResultSet rs = db.query(sql);
		try {
			while(rs.next()){
				int gid = rs.getInt(1);
				String gname = rs.getString(2);
				float gprice = rs.getFloat(3);
				int gnum = rs.getInt(4);
				int state = rs.getInt(5);
				String sname = rs.getString(6);
				//创建对象
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//修改商品信息
	public boolean updateGood(int gid, String gname, float gprice, int gnum,
			int state) {
		String sql="update goods set gname='"+gname+"',gprice="+gprice+",gnum="+gnum+",state="+state+" where gid="+gid+"";
		int res = db.update(sql);
		if(res==1){
			return true;
		}
		return false;
	}

}
