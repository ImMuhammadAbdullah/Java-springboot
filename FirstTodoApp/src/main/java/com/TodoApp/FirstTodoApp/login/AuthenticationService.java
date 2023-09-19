package com.TodoApp.FirstTodoApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String userName, String password) {
        return  userName.equalsIgnoreCase("abdullah") && password.equalsIgnoreCase("dummy");
    }
}
