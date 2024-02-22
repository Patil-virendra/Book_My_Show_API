package com.api.repository;

import com.api.entitites.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment , String> {

    //List<Payment> findByUser(User user);
    //List<Payment> findByUsername(User user);
}
