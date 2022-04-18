package com.examp.service.Implementation;

import com.examp.model.User;
import com.examp.model.UserRole;
import com.examp.repo.RoleRepository;
import com.examp.repo.UserRepository;
import com.examp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;
//creating User
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local=this.userRepository.findByUserName(user.getUsername());
        if(local!=null){
            System.out.println("User already exist");
            throw new Exception(" User is already there");
        }
        else {
                for (UserRole ur: userRoles){
                    roleRepository.save(ur.getRole());
                }
                user.getUserRoles().addAll(userRoles);
                local = this.userRepository.save(user);
        }
        return local;
    }
}
