package com.fithe.android.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fithe.android.dao.AndroidDAO;
import com.fithe.android.vo.AndroidMemberVO;

@Controller
public class AndroidController {
	
	private Logger logger = Logger.getLogger(AndroidController.class);
	
	@Autowired(required = false)
	AndroidDAO androidDAO;

	@ResponseBody
	@RequestMapping("androidSignIn")
//	public Map<String, Object> androidSignIn() {
	public Map<String, Object> androidSignIn(HttpServletRequest req, AndroidMemberVO amvo) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        logger.info("androidSignIn()");
        String enabled = "1";
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");
        System.out.println("id>>>>>>>>>>>>>>>"+id);
        System.out.println("pwd>>>>>>>>>>>>>>>"+pwd);
  
        
        amvo.setId(id);
        amvo.setPassword(pwd);
        
        List list = androidDAO.confirmUser(amvo);
        int size = list.size();
     
        if(size == 0) {
        	enabled="0";
        }
       
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("password", pwd);
        map.put("enabled", enabled);
        return map;
    }
	
	@ResponseBody
	@RequestMapping("androidInsert")
	public Map<String, Object> androidInsert(HttpServletRequest req, AndroidMemberVO amvo){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        logger.info("androidInsert()");
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        
        System.out.println("id>>>>>>>>>>>>>>>"+id);
        System.out.println("pwd>>>>>>>>>>>>>>>"+pwd);
        System.out.println("email>>>>>>>>>>>>>>>"+email);
        System.out.println("gender>>>>>>>>>>>>>>>"+gender);
		
		amvo.setId(id);
		amvo.setPassword(pwd);
		amvo.setEmail(email);
		amvo.setGender(gender);
		
		int cnt = androidDAO.AndroidInsert(amvo);
		
		System.out.println("cnt>>>>>>>>>>>>>>>>>"+cnt);
		
		Map<String, Object> map = new HashMap<String, Object>();
        map.put("enabled", cnt);
		
		
		return map;
		
		
	}
	
	@ResponseBody
	@RequestMapping("idCheck")
	public Map<String, Object> idCheck(HttpServletRequest req, AndroidMemberVO amvo){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        logger.info("idCheck()");
        String id = req.getParameter("id");
        
        System.out.println("id>>>>>>>>>>>>>>>"+id);
 
		amvo.setId(id);
	
		int cnt = androidDAO.idCheck(amvo);
		System.out.println("cnt>>>>>>>>>>>>>>>>>"+cnt);

		
		Map<String, Object> map = new HashMap<String, Object>();
        map.put("idCheck", cnt);
		
		
		return map;
		
		
	}
	
	@ResponseBody
	@RequestMapping("findPw")
	public Map<String, Object> findPw(HttpServletRequest req, AndroidMemberVO amvo){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        logger.info("findPw()");
        String email = req.getParameter("email");
        
        System.out.println("email>>>>>>>>>>>>>>>"+email);
 
		amvo.setId(email);
	
		String pw = androidDAO.findPw(amvo);
		System.out.println("pw>>>>>>>>>>>>>>>>>"+pw);

		
		Map<String, Object> map = new HashMap<String, Object>();
        map.put("password", pw);
		
		
		return map;
		
		
	}
	
}