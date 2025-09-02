package com.yura.study_project.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private String name;
    private Integer age;

    public String getCustomerName() {
        return this.name;
    }
}
