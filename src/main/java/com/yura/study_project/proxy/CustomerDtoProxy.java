package com.yura.study_project.proxy;

import com.yura.study_project.dto.CustomerDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerDtoProxy extends CustomerDto {

    private final CustomerDto customerDto;

    @Override
    public String getCustomerName() {
        System.out.println("Name with proxy " + customerDto.getName());
        return customerDto.getCustomerName();
    }
}
