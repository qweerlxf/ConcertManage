package po;

public class Orders {
	private int oid;
	private String gname;	//��Ʒ����
	private String uname;	//�û�����
	private int ocount;		//��������
	private int gcount;		//��Ʒ����
	private float gprice;	//��Ʒ�۸�
	private float price;	//ʵ����
	private String settime;	//����ʱ��
	private String paytime; //����ʱ��
	private String ostate; 	//����״̬
	
	public Orders() {
		super();
	}

	public Orders(int oid, String gname, String uname, int ocount, int gcount,
			float gprice, String settime, String paytime, String ostate) {
		super();
		this.oid = oid;
		this.gname = gname;
		this.uname = uname;
		this.ocount = ocount;
		this.gcount = gcount;
		this.gprice = gprice;
		this.settime = settime;
		this.paytime = paytime;
		this.ostate = ostate;
	}
	
	public Orders( String gname, String uname, int ocount, int gcount,
			float gprice, float price) {
		super();
		this.gname = gname;
		this.uname = uname;
		this.ocount = ocount;
		this.gcount = gcount;
		this.gprice = gprice;
		this.price = price;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getOcount() {
		return ocount;
	}

	public void setOcount(int ocount) {
		this.ocount = ocount;
	}

	public int getGcount() {
		return gcount;
	}

	public void setGcount(int gcount) {
		this.gcount = gcount;
	}

	public float getGprice() {
		return gprice;
	}

	public void setGprice(float gprice) {
		this.gprice = gprice;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSettime() {
		return settime;
	}

	public void setSettime(String settime) {
		this.settime = settime;
	}

	public String getPaytime() {
		return paytime;
	}

	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}

	public String getOstate() {
		return ostate;
	}

	public void setOstate(String ostate) {
		this.ostate = ostate;
	}
	
}
