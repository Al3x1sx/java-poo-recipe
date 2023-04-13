package com.example.recipeproject.repository;

import com.example.recipeproject.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientsRepository extends JpaRepository<Ingredient, Long> {

}