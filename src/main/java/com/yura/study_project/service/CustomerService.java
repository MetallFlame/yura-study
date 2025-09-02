package com.yura.study_project.service;

import com.yura.study_project.dto.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public CustomerDto getCustomer() {
        CustomerDto user = new CustomerDto();
        user.setName("test");
        user.setAge(22);
        return user;
    }
}
