package dao;

import po.Users;

public interface IUsersDao {
	public boolean regUser(Users user);
	public boolean loginUser(Users user);
	
}
