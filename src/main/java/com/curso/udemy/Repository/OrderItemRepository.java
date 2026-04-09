package com.curso.udemy.Repository;

import com.curso.udemy.Entities.OrderItem;
import com.curso.udemy.Entities.PK.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
