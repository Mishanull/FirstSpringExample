package com.example.demo;

import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.OrderRepositoryImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RandomController {
    OrderRepository repository=new OrderRepositoryImpl();
    @GetMapping("/randomNumber")
    public String randomNumber(@RequestParam(value = "number" ) int number){
        return new RandomNameTest(number).getRandomMessage();
    }
    @GetMapping(value = "/getOrder",produces = {MediaType.APPLICATION_XML_VALUE})
    public Order getOrder(@RequestParam(value="id") int id){

        return repository.getOrder(id);
    }
    @GetMapping("/deleteOrder")
    public String deleteOrder(@RequestParam(value="id") int id){
         repository.deleteOrder(id);
         return "Order "+id+" deleted.";
    }
    @GetMapping("/getOrders")
    public List<Order> getOrders(){
        return repository.getOrders();
    }


    @PostMapping("/createOrder")
    public String createOrder(@RequestBody Order o){
        repository.createOrder(o);
        return "Order"+o.getId()+" created";
    }

    @PutMapping("/updateOrder")
    public String updateOrder(@RequestBody Order o){
        repository.updateOrder(o);
        return "Order "+o.getId()+" updated";
    }



    @RequestMapping(value="/order/{id}",
    method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Order getOrderById(@PathVariable("id") int id){
     return repository.getOrder(id);
    }
}
