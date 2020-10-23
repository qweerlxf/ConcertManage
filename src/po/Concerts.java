package po;

public class Concerts {
	private String cno;
	private String cname;
	private String cprice;
	private String cplace;
	private String cstart;
	private String cduration;
	public Concerts(String cno, String cname, String cprice, String cplace, String cstart, String cduration) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.cprice = cprice;
		this.cplace = cplace;
		this.cstart = cstart;
		this.cduration = cduration;
	}
	public Concerts(String cno) {
		super();
		this.cno = cno;
	}
	public Concerts(String cno, String cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}
	public Concerts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCprice() {
		return cprice;
	}
	public void setCprice(String cprice) {
		this.cprice = cprice;
	}
	public String getCplace() {
		return cplace;
	}
	public void setCplace(String cplace) {
		this.cplace = cplace;
	}
	public String getCstart() {
		return cstart;
	}
	public void setCstart(String cstart) {
		this.cstart = cstart;
	}
	public String getCduration() {
		return cduration;
	}
	public void setCduration(String cduration) {
		this.cduration = cduration;
	}
	
}
