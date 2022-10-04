package myfirstwebapp.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean authenticate(String user, String password) {
        String goodUser = "Jules";
        String goodPass = "pass";
        return user.equals(goodUser) & password.equals(goodPass);
    }
 }
