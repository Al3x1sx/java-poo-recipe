package com.example.recipeproject.service;

import com.example.recipeproject.entity.Recipe;
import com.example.recipeproject.repository.RecipeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> recipeList() {
        return recipeRepository.findAll();
    }

    public void saveRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public Recipe getRecipeById(Long id) {
        return recipeRepository.findById(id).get();
    }

    public void deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
    }

    public String getRandomRecipe() {
        return "random recipe";
    }

    public void analyzeRecipe(){

    }
}
