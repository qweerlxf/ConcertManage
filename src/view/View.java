package view;

public class View {
	public void showMenu(){
		System.out.println("1.用户注册");
		System.out.println("2.用户登录");
		System.out.println("3.管理员登录");
		System.out.println("0.退出");
	}
	//普通会员
	public void userMenu1(){
		System.out.println("1.查看演唱会");
		System.out.println("2.修改个人信息");
		System.out.println("0.返回");
	}
	//管理员
	public void adminMenu3(){
		System.out.println("1.商品管理");
		System.out.println("0 返回");
	}
	
	public void adminMenu31(){
		System.out.println("1.添加商品信息");
		System.out.println("2.修改商品信息");
		System.out.println("3.删除商品信息");
		System.out.println("4.查看商品信息");
		System.out.println("0 返回");
	}
	
	public void searchMenu1(){
		System.out.println("1.按名字搜索");
		System.out.println("2.按分类搜索");
		System.out.println("0.返回");
	}
	
	public void searchMenu12(){
		System.out.println("1.生鲜水果");
		System.out.println("2.休闲零食");
		System.out.println("3.个人护理");
		System.out.println("0.返回");
	}
}
