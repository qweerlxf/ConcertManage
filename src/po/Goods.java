package po;

public class Goods {
	private int gid;
	private String gname;
	private float gprice;
	private int gnum;
	private int state;
	private Sorts Sort; //商品类别

	public Goods() {
		super();
	}

	public Goods(String gname, float gprice, int gnum, int state,
			Sorts sort) {
		super();
		this.gname = gname;
		this.gprice = gprice;
		this.gnum = gnum;
		this.state = state;
		Sort = sort;
	}
	
	public Goods(int gid, String gname, float gprice, int gnum, int state,
			Sorts sort) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gnum = gnum;
		this.state = state;
		Sort = sort;
	}
	
	public Goods(int gid,int gnum) {
		super();
		this.gid = gid;
		this.gnum = gnum;
	}
	
	public Goods(int gid) {
		super();
		this.gid = gid;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public float getGprice() {
		return gprice;
	}

	public void setGprice(float gprice) {
		this.gprice = gprice;
	}

	public int getGnum() {
		return gnum;
	}

	public void setGnum(int gnum) {
		this.gnum = gnum;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Sorts getSort() {
		return Sort;
	}

	public void setSort(Sorts sort) {
		Sort = sort;
	}
	
}
