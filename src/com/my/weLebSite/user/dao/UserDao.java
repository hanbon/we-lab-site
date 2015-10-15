package com.my.weLebSite.user.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.my.weLebSite.user.domain.User;
import cn.itcast.jdbc.TxQueryRunner;

/**
 * 用户模块持久层
 * @author 
 *
 */
public class UserDao {
	private QueryRunner qr = new TxQueryRunner();

	/**
	 * 按用户名和密码查询
	 * @param loginname
	 * @param loginpass
	 * @return
	 * @throws SQLException 
	 */
	public User findByLoginnameAndLoginpass(String Loginname, String Loginpass) throws SQLException {
		String sql = "select * from user where Loginname=? and Loginpass=?";
			return (qr.query(sql, new BeanHandler<User>(User.class), Loginname, Loginpass));
			
	}
	


	/**
	 * 校验用户名是否注册
	 * @param loginname
	 * @return
	 * @throws SQLException 
	 */
	public boolean ajaxValidateLoginname(String Loginname) throws SQLException {
		String sql = "select count(1) from user where Loginname=?";
		Number number = (Number)qr.query(sql, new ScalarHandler(), Loginname);
		return number.intValue() == 0;
	}
	

	/**
	 * 添加用户
	 * @param user
	 * @throws SQLException 
	 */
	public void add(User user) throws SQLException {
		String sql = "insert into user values(?,?,?,?,?,?,?,?)";
		Object[] params = {0,user.getLoginname(), user.getQq(), user.getLoginpass(),user.getReloginpass(),user.getGrade(),false,user.getNum()};
		qr.update(sql, params);
	}
}
