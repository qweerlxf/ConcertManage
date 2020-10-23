package dao;

import java.util.ArrayList;

import po.Goods;

public interface IGoodsDao {
	public boolean addGood(Goods good); //���
	public boolean updateGood(int gid, String gname, float gprice, int gnum, int state);
	public boolean deleteGood(int gid);
	public boolean addBuy(Goods good);
	public ArrayList<Goods> selectGoods(); //��ʾ����
	public ArrayList<Goods> searchnGoods(String name);
	public ArrayList<Goods> searchsGoods(int sort);
}
