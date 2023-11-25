package com.alexandre.marcelino.delivery.repository;

import com.alexandre.marcelino.delivery.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository <Delivery, Long> {
}
