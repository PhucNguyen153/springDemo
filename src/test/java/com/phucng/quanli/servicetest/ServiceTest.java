package com.phucng.quanli.servicetest;

import com.phucng.quanli.entity.Department;
import com.phucng.quanli.entity.User;
import com.phucng.quanli.repository.DepartmentRepo;
import com.phucng.quanli.repository.UserRepo;
import com.phucng.quanli.response.ApiResponse;
import com.phucng.quanli.service.ManageService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceTest {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private ManageService manageService;

    @Test
    public void getDirectorSuccess(){
        User director = userRepo.findByDirectorIsTrue().get();
        assertEquals(true, director.isDirector());
    }
    @Test
    public void getAllDepartmentSuccess(){
        List<Department> departments = departmentRepo.findAll();
        assertNotNull(departments);
    }
    @Test
    @Transactional
    public void getAllInfoSuccess(){
        ApiResponse result = manageService.getAllUser();
        assertNotNull(result);
    }
}
