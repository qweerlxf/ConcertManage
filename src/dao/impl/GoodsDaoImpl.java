package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.IGoodsDao;
import db.DB;
import po.Goods;
import po.Sorts;

public class GoodsDaoImpl implements IGoodsDao {
	private DB db;
	
	public GoodsDaoImpl() {
		db=new DB();
	}

	//添加商品
	public boolean addGood(Goods good) {
		String sql="insert into goods values(null,'"+good.getGname()+"',"+good.getGprice()+","+good.getGnum()+","+good.getState()+","+good.getSort().getSort()+")";
		if(db.update(sql)==1){
			return true;
		}
		return false;
	}
	
	//删除商品
	public boolean deleteGood(int gid) {
		String sql="delete from goods where gid="+gid+"";
		if(db.update(sql)==1){
			return true;
		}
		return false;
	}
	//查看全部商品
	public ArrayList<Goods> selectGoods() {
		String sql="select g.gid,g.gname,g.gprice,g.gnum,g.state,s.sname from goods g,sorts s where g.sort=s.sort";
		ArrayList<Goods> list = new ArrayList<Goods>();
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
				Sorts sort = new Sorts(sname);
				Goods good = new Goods(gid, gname, gprice, gnum, state, sort);
				list.add(good);
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

	//购买商品后修改商品信息
	public boolean addBuy(Goods good) {
		String sql="update goods set gnum="+good.getGnum()+" where gid="+good.getGid()+"";
		int res = db.update(sql);
		if(res==1){
			return true;
		}
		return false;
	}
	//按名字查找商品
	public ArrayList<Goods> searchnGoods(String name) {
		String sql="select gid,gname,gprice,gnum,state,sort from goods where gname like '%!"+name+"%' escape '!'";
		ArrayList<Goods> list = new ArrayList<Goods>();
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
				Sorts sorts = new Sorts(sname);
				Goods good = new Goods(gid, gname, gprice, gnum, state, sorts);
				list.add(good);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//按分类查找商品
	public ArrayList<Goods> searchsGoods(int sort) {
		String sql="select gid, gname, gprice, gnum,state,sort from goods where sort like '"+sort+"'";		
		ArrayList<Goods> list = new ArrayList<Goods>();
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
				Sorts sorts = new Sorts(sname);
				Goods good = new Goods(gid, gname, gprice, gnum, state, sorts);
				list.add(good);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
