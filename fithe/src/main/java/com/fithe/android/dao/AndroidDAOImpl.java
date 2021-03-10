package com.fithe.android.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fithe.android.vo.AndroidMemberVO;


@Repository
public class AndroidDAOImpl implements AndroidDAO {
	
	
	@Autowired(required = false)
	SqlSession sqlSession;

	@Override
    public List<AndroidMemberVO> confirmUser(AndroidMemberVO amvo) {
   
    	
        return sqlSession.selectList("confirmUser",amvo);
    }

	@Override
	public int AndroidInsert(AndroidMemberVO amvo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("AndroidInsert",amvo);
	}

	@Override
	public int idCheck(AndroidMemberVO amvo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("idCheck", amvo);
	}

	@Override
	public String findPw(AndroidMemberVO amvo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("findPw", amvo);
	}


}
