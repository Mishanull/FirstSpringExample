package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RandomController {
    ArrayList<Order> orders=new ArrayList<>();
    public RandomController(){

        Order order1=new Order(1,25f,"sadjaksdh",true);
        Order order2=new Order(2,32f,"mikdsl",false);
        Order order3=new Order(3,54f,"marisua",false);
        Order order4=new Order(4,2345f,"valeriu",true);
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
    }
    @GetMapping("/randomNumber")
    public String randomNumber(@RequestParam(value = "number" ) int number){
        return new RandomNameTest(number).getRandomMessage();
    }
    @GetMapping("/getOrder")
    public Order getOrder(@RequestParam(value="id") int id){
        Order order=new Order();
        for (Order o: orders) {
            if(o.getId()==id){
                order=o;
            }
        }
        return order;
    }
}
