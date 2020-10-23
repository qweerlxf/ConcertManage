package po;

public class Users {
	private String uno;
	private String upwd;
	private String UAUTH;
	public Users() {		
	}
	public Users(String uno, String upwd, String UAUTH) {
		super();
		this.uno = uno;
		this.upwd = upwd;
		this.UAUTH = UAUTH;
	}
	public Users(String uno, String upwd) {
		super();
		this.uno = uno;
		this.upwd = upwd;
	}
	public String getUno() {
		return uno;
	}
	public void setuNo(String uno) {
		this.uno = uno;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUname(String upwd) {
		this.upwd = upwd;
	}
	
}
