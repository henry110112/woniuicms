package com.woniuxy.po;

public class UserPO {
	private String user_id;
	private String login;
	private String password;
	private int role;
	private int flag;
	@Override
	public String toString() {
		return "UserPO [user_id=" + user_id + ", login=" + login
				+ ", password=" + password + ", role=" + role + ", flag="
				+ flag + "]";
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
}
