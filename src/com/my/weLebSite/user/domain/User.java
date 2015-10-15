package com.my.weLebSite.user.domain;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String Loginname;
	private String qq;
	private String Loginpass;
	//注册表单
	private String reloginpass;
	

	public String getReloginpass() {
		return reloginpass;
	}

	public void setReloginpass(String reloginpass) {
		this.reloginpass = reloginpass;
	}

	private String  VerifyCode; 
	

	private String grade;
	private Boolean grant;
	private String num;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */


	public User(Integer id, String loginname, String qq, String loginpass,
			String repssword, String verifyCode, String grade, Boolean grant,
			String num) {
		super();
		Loginname = loginname;
		this.qq = qq;
		Loginpass = loginpass;
		this.reloginpass = reloginpass;
		VerifyCode = verifyCode;
		this.grade = grade;
		this.grant = grant;
		this.num = num;
	}

	// Property accessors
	public String getVerifyCode() {
		return VerifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		VerifyCode = verifyCode;
	}


	public String getLoginname() {
		return Loginname;
	}

	public void setLoginname(String loginname) {
		Loginname = loginname;
	}

	public String getLoginpass() {
		return Loginpass;
	}

	public void setLoginpass(String loginpass) {
		Loginpass = loginpass;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}


	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Boolean getGrant() {
		return this.grant;
	}

	public void setGrant(Boolean grant) {
		this.grant = grant;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}