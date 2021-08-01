package com.phucng.quanli.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DepartmentResponse {
    private Long id;
    private String name;
    private UserResponse manager;
    private List<TeamResponse> teams;
}
