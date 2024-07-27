package com.sandeep.repository;

import com.sandeep.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
