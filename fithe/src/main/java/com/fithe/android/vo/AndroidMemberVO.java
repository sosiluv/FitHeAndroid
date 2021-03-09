package com.fithe.android.vo;

public class AndroidMemberVO {

	private String id;
	private String password;
	private String email;
	private String gender;
	private int enabled;
	
	public AndroidMemberVO() {}
	
//	public AndroidMemberVO(String id, String password, String email, String gender, int enabled) {
//		this.id = id;
//		this.password = password;
//		this.email = email;
//		this.gender = gender;
//		this.enabled = enabled;
//	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
}
