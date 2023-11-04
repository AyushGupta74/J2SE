package com.demo.service;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import com.demo.exceptions.WrongCrendentialException;

public class UserService {
	static Map<String,String> hm;
	static {
		hm=new HashMap<>();
		hm.put("user1","user1");
		hm.put("user2", "user2");
		hm.put("user3","user3");
	}
	public static boolean validateUser(String uname, String pass) throws WrongCrendentialException {
		String p=hm.get(uname);
		if(p!=null) {
			if(p.equals(pass)) {
				return true;
			}
		}
		throw new WrongCrendentialException("crendentials are wrong");
	}

}
