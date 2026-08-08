package org.example;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
//@Scope("singleton") // Default scope is singleton and Eager intialization
@Scope("prototype") // Lazy intialization
public class OrderService {

    public OrderService(){
        System.out.println("OrderService bean created");
    }

    public void processOrder() {
        System.out.println("Processed order...");
    }

}
