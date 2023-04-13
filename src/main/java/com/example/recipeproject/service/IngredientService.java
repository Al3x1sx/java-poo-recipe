package com.example.recipeproject.service;

import com.example.recipeproject.entity.Ingredient;
import com.example.recipeproject.repository.IngredientsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class IngredientService {

    @Autowired
    private IngredientsRepository ingredientsRepository;

    public List<Ingredient> listAllIngredients() {
        return ingredientsRepository.findAll();
    }

    public void saveIngredient(Ingredient ingredient) {
        ingredientsRepository.save(ingredient);
    }

    public Ingredient getIngredient(Long id) {
        return ingredientsRepository.findById(id).get();
    }

    public void deleteIngredient(Long id) {
        ingredientsRepository.deleteById(id);
    }
}
