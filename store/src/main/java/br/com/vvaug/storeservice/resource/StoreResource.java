package br.com.vvaug.storeservice.resource;

import br.com.vvaug.storeservice.client.CustomerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreResource {

    private final CustomerClient customerClient;

    @GetMapping("/customers")
    public Object findAllStoreCustomers(){
        return customerClient.findAllCustomers();
    }
}
