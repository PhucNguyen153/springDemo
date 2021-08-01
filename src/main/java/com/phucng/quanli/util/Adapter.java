package com.phucng.quanli.util;

import com.phucng.quanli.entity.Department;
import com.phucng.quanli.entity.Team;
import com.phucng.quanli.entity.User;
import com.phucng.quanli.response.DepartmentResponse;
import com.phucng.quanli.response.TeamResponse;
import com.phucng.quanli.response.UserResponse;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class Adapter {
    public UserResponse userAdapter(User entity){
        return UserResponse.builder().id(entity.getId()).name(entity.getName()).build();
    }

    public TeamResponse teamAdapter(Team entity){
        return TeamResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .members(entity.getUsers()
                        .stream()
                        .filter(Objects::nonNull)
                        .map(this::userAdapter)
                        .collect(Collectors.toList()))
                .build();
    }

    public DepartmentResponse departmentAdapter(Department entity){
        return DepartmentResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .manager(userAdapter(entity.getDepartmentManager()))
                .teams(entity.getTeams()
                        .stream()
                        .filter(Objects::nonNull)
                        .map(this::teamAdapter)
                        .collect(Collectors.toList()))
                .build();
    }
}
