package com.yura.study_project.controller;

import com.yura.study_project.dto.CustomerDto;
import com.yura.study_project.proxy.CustomerDtoProxy;
import com.yura.study_project.service.CustomerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CustomerController {

    CustomerService customerService;

    @GetMapping("/customer")
    public CustomerDto getCustomer() {
        CustomerDto customer = new CustomerDto();
        customer.setName("test name");
        customer.setAge(23);

        CustomerDto customerWithProxy = new CustomerDtoProxy(customer);

        System.out.println(customer.getCustomerName());
        System.out.println("=====");
        System.out.println(customerWithProxy.getCustomerName());


        return customerService.getCustomer();
    }
}
