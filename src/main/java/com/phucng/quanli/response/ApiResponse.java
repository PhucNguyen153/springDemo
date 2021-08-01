package com.phucng.quanli.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ApiResponse {
    private UserResponse director;
    private List<DepartmentResponse> departments;

}
