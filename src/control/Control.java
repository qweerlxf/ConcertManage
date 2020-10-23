package control;

import java.util.ArrayList;
import java.util.Scanner;

import dao.impl.UsersDaoImpl;
import po.Users;
import view.View;

public class Control {
	private UsersDaoImpl usersDao;
	private Scanner sc;
	private View view;
	
	public Control() {
		usersDao=new UsersDaoImpl();
		sc=new Scanner(System.in);
		view=new View();
	}
	
	public void start(){
		while(true){
			view.showMenu();
			String t = sc.next();
			if("1".equals(t)){
				
			}else if("2".equals(t)){
				//用户登录
				System.out.println("用户名：");
				String UNO = sc.next();
				System.out.println("密码：");
				String UPWD = sc.next();
				Users user = new Users(UNO, UPWD);
				if(usersDao.loginUser(user)){
					//---------------用户操作--------------------------
					System.out.println("登录成功");
					while(true){
						view.userMenu1();
						t = sc.next();
						if("1".equals(t)){
							
						}else if("2".equals(t)){
							
						}else if("0".equals(t)){
							break;
						}
					}
					//---------------用户操作--------------------------
				}else{
					System.out.println("登录失败");
				}
			}else if("3".equals(t)){
				System.out.println("用户名：");
				String UNO = sc.next();
				System.out.println("密码：");
				String UPWD = sc.next();
				Users user = new Users(UNO, UPWD);
				if(usersDao.loginUser(user)){
					System.out.println("登录成功");
				}else{
					System.out.println("登录失败");
				}
			}else if("0".equals(t)){
				break;
			}
		}
	}
	
}
