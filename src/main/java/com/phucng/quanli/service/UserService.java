package com.phucng.quanli.service;

import com.phucng.quanli.entity.User;
import com.phucng.quanli.repository.UserRepo;
import com.phucng.quanli.response.UserResponse;
import com.phucng.quanli.util.Adapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private Adapter adapter;

    public UserResponse getDirector(){
        Optional<User> director = userRepo.findByDirectorIsTrue();
        if (director.isPresent()){
            return adapter.userAdapter(director.get());
        }
        return null;
    }
}
