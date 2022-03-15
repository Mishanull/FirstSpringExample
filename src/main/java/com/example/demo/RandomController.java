package com.example.demo;

import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.OrderRepositoryImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RandomController {
    OrderRepository repository=new OrderRepositoryImpl();
    @GetMapping("/randomNumber")
    public String randomNumber(@RequestParam(value = "number" ) int number){
        return new RandomNameTest(number).getRandomMessage();
    }
    @GetMapping("/getOrder")
    public Order getOrder(@RequestParam(value="id") int id){

        return repository.getOrder(id);
    }
    @GetMapping("/getOrders")
    public List<Order> getOrders(){
        return repository.getOrders();
    }

}
