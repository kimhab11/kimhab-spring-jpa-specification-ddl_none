package com.example.trash01.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class StaffResponseDTO {
    private Integer id;
    private String name;
    private Date birthDay;
}
