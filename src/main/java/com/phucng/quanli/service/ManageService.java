package com.phucng.quanli.service;

import com.phucng.quanli.entity.Department;
import com.phucng.quanli.entity.Team;
import com.phucng.quanli.entity.User;
import com.phucng.quanli.repository.DepartmentRepo;
import com.phucng.quanli.repository.UserRepo;
import com.phucng.quanli.response.ApiResponse;
import com.phucng.quanli.response.DepartmentResponse;
import com.phucng.quanli.response.TeamResponse;
import com.phucng.quanli.response.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ManageService {

    @Autowired
    private UserService userService;
    @Autowired
    private DepartmentService departmentService;

    public ApiResponse getAllUser(){
        UserResponse director = userService.getDirector();
        List<DepartmentResponse> departments = departmentService.getAllDepartment();

        ApiResponse response = new ApiResponse(director, departments);
        return response;
    }


}
