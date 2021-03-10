package com.fithe.android.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fithe.android.dao.AndroidDAO;
import com.fithe.android.vo.AndroidMemberVO;

public class AndroidServiceImpl implements AndroidService {

	@Autowired(required = false)
	private AndroidDAO androidDAO;
	
	
	
	@Override
	public List<AndroidMemberVO> confirmUser(AndroidMemberVO amvo) {
		// TODO Auto-generated method stub
		List<AndroidMemberVO> list = androidDAO.confirmUser(amvo);
		
		return list;
	}



	@Override
	public int AndroidInsert(AndroidMemberVO amvo) {
		// TODO Auto-generated method stub
		int cnt = androidDAO.AndroidInsert(amvo);
		
		return cnt;
	}



	@Override
	public int idCheck(AndroidMemberVO amvo) {
		// TODO Auto-generated method stub
		int cnt = androidDAO.idCheck(amvo);
		return cnt;
	}



	@Override
	public String findPw(AndroidMemberVO amvo) {
		// TODO Auto-generated method stub
		String pw = androidDAO.findPw(amvo);
		return pw;
	}

}
