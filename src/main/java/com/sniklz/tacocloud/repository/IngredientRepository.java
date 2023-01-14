package com.sniklz.tacocloud.repository;

import com.sniklz.tacocloud.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
