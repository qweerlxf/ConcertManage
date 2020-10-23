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
				//�û���¼
				System.out.println("�û�����");
				String UNO = sc.next();
				System.out.println("���룺");
				String UPWD = sc.next();
				Users user = new Users(UNO, UPWD);
				if(usersDao.loginUser(user)){
					//---------------�û�����--------------------------
					System.out.println("��¼�ɹ�");
					while(true){
						view.userMenu1();
						t = sc.next();
						if("1".equals(t)){
							
						}else if("2".equals(t)){
							
						}else if("0".equals(t)){
							break;
						}
					}
					//---------------�û�����--------------------------
				}else{
					System.out.println("��¼ʧ��");
				}
			}else if("3".equals(t)){
				System.out.println("�û�����");
				String UNO = sc.next();
				System.out.println("���룺");
				String UPWD = sc.next();
				Users user = new Users(UNO, UPWD);
				if(usersDao.loginUser(user)){
					System.out.println("��¼�ɹ�");
				}else{
					System.out.println("��¼ʧ��");
				}
			}else if("0".equals(t)){
				break;
			}
		}
	}
	
}
