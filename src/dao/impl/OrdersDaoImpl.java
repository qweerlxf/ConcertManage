package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.IOrdersDao;
import db.DB;
import po.Goods;
import po.Orders;

public class OrdersDaoImpl implements IOrdersDao{
private DB db;
	
	public OrdersDaoImpl() {
		db=new DB();
	}

	//添加订单
	public boolean addOrder(Orders order) {
		String sql="insert into orders values(null,'"+order.getGname()+"','"+order.getUname()+"',"+order.getOcount()+","+order.getGcount()+","+order.getGprice()+","+order.getPrice()+",now(),now(),'交易成功')";
		if(db.update(sql)==1){
			return true;
		}
		return false;
	}
}
