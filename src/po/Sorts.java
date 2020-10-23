package po;

public class Sorts {
	private int sort;
	private String sname;
	
	public Sorts(){
		
	}

	public Sorts(String sname) {
		super();
		this.sname = sname;
	}

	public Sorts(int sort, String sname) {
		super();
		this.sort = sort;
		this.sname = sname;
	}
	
	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
