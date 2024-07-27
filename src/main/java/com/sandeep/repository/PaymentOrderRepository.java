package com.sandeep.repository;

import com.sandeep.model.PaymentOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {
}
