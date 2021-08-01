package com.phucng.quanli.service;

import com.phucng.quanli.entity.Department;
import com.phucng.quanli.repository.DepartmentRepo;
import com.phucng.quanli.response.DepartmentResponse;
import com.phucng.quanli.util.Adapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private Adapter adapter;

    public List<DepartmentResponse> getAllDepartment(){
        List<Department> departments = departmentRepo.findAll();
        if(!ObjectUtils.isEmpty(departments)){
            return departments.stream()
                    .map(x -> adapter.departmentAdapter(x))
                    .collect(Collectors.toList());
        }
        return null;
    }
}
