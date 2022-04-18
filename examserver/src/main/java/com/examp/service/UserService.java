package com.examp.service;

import com.examp.model.User;
import com.examp.model.UserRole;

import java.util.Set;

public interface UserService {

    //Creating User
    public default User createUser(User user, Set<UserRole> userRoles) throws Exception {
        return null;
    }
}
