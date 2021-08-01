package com.phucng.quanli.controller;

import com.phucng.quanli.response.ApiResponse;
import com.phucng.quanli.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/api/v1/controller")
public class CompanyController {

    @Autowired
    private ManageService manageService;

    @GetMapping
    public ResponseEntity<?> getAllUser(){
        try{
            ApiResponse response = manageService.getAllUser();
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }catch (Exception e){
            return ResponseEntity.status(NOT_FOUND)
                    .body(e.getMessage());
        }
    }
}
