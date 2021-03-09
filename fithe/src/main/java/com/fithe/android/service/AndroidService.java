package com.fithe.android.service;

import java.util.List;

import com.fithe.android.vo.AndroidMemberVO;

public interface AndroidService {
	
	public List<AndroidMemberVO> confirmUser(AndroidMemberVO amvo);
	public int AndroidInsert(AndroidMemberVO amvo);
	public int idCheck(AndroidMemberVO amvo);
	public String findPw(AndroidMemberVO amvo);
}
