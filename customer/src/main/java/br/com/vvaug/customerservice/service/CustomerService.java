package br.com.vvaug.customerservice.service;

import br.com.vvaug.customerservice.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    public List<Customer> findAll() {
        return Arrays.asList(
                Customer.builder().name("Victor").document("123").build(),
                Customer.builder().name("Williams").document("1235").build()
        );
    }
}
