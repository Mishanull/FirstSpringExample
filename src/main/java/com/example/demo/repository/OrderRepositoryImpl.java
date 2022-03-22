package com.example.demo.repository;

import com.example.demo.Order;
import org.springframework.stereotype.Repository;

import java.util.*;

public class OrderRepositoryImpl  implements OrderRepository{
    private static final Map<Integer, Order> map=new HashMap<Integer,Order>();
    static {
        initDataSource();
    }

    private static void initDataSource() {
        Order order1=new Order(1,25f,"sadjaksdh",true);
        Order order2=new Order(2,32f,"mikdsl",false);
        Order order3=new Order(3,54f,"marisua",false);
        Order order4=new Order(4,2345f,"valeriu",true);
        map.put(order1.getId(), order1);
        map.put(order2.getId(),order2);
        map.put(order3.getId(),order3);
        map.put(order4.getId(),order4);
    }

    @Override
    public Order getOrder(int id) {
        return map.get(id);
    }

    @Override
    public List<Order> getOrders() {
        Collection<Order> orders= map.values();
        ArrayList<Order> list = new ArrayList<>(orders);
        return list;
    }

    @Override
    public void deleteOrder(int id) {
        map.remove(id);

    }

    @Override
    public void createOrder(Order o) {
        map.put(o.getId(),o);
    }

    @Override
    public Order updateOrder(Order o) {
        return map.put(o.getId(),o);
    }
}
