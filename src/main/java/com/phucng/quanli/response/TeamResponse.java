package com.phucng.quanli.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TeamResponse {
    private Long id;
    private String name;
    private List<UserResponse> members;
}
