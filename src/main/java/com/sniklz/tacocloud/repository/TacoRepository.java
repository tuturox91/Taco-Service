package com.sniklz.tacocloud.repository;

import com.sniklz.tacocloud.model.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}
