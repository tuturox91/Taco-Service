package com.sniklz.tacocloud.repository;

import com.sniklz.tacocloud.model.TacoOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<TacoOrder, Long> {
}
