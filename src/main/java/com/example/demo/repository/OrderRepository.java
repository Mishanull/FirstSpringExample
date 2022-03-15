package com.example.demo.repository;

import com.example.demo.Order;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface OrderRepository {
    Order getOrder(int id);
    List<Order> getOrders();
}
