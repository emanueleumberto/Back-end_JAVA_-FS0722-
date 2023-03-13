package com.springSecretCode.auth.service;

import com.springSecretCode.auth.payload.LoginDto;
import com.springSecretCode.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
