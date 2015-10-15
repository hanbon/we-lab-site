package com.my.weLebSite.user.service;


import java.sql.SQLException;
import com.my.weLebSite.user.dao.UserDao;
import com.my.weLebSite.user.domain.User;
import com.my.weLebSite.user.service.exception.UserException;


/**
 * 用户模块业务层
 * @author qdmmy6
 *
 */
public class UserService {
	private UserDao userDao = new UserDao();
	

	/**
	 * 登录功能
	 * @param user
	 * @return
	 * @throws UserException 
	 */
	public User login(User user) throws UserException {
		try {
			return userDao.findByLoginnameAndLoginpass(user.getLoginname(), user.getLoginpass());
		} catch (SQLException e) {
			throw new UserException(e);
		}
	}
	
	
	/**
	 * 用户名注册校验
	 * @param loginname
	 * @return
	 * @throws UserException 
	 */
	public boolean ajaxValidateLoginname(String name) throws UserException {
		try {
			return userDao.ajaxValidateLoginname(name);
		} catch (SQLException e) {
			throw new UserException(e);
		}
	}
	
	
	/**
	 * 注册功能
	 * @param user
	 */
	public void regist(User user) {
		/*
		 * 2. 向数据库插入
		 */
		try {
			userDao.add(user);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
