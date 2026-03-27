package com.example.webapp.service.impl;

import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.webapp.entity.LoginUser;

@Service
public class LoginUserDatailsServiceImpl implements UserDetailsService{
	@Override
	public UserDetails loadUserByUsername(String username)
	 throws UsernameNotFoundException{
		
		if(username.equals("tarou")) {
			return new LoginUser("tarou", "pass", 
					              Collections.emptyList());
			
		if(authentication != null) {
			return new LoginUser(authentication.getUsername(), authentication.getPassword(),getAuthorityList(authentication.getAuthority());
			
		}else {
			throw new UsernameNotFoundException(
					username + "=> 指定しているユーザー名は存在しません");
		}
	}

}
}

private List<>