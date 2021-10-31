package br.com.vvaug.storeservice.client;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "customer-service", path = "/customers")
public interface CustomerClient {

    @GetMapping
    JsonNode findAllCustomers();
}
