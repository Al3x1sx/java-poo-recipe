package com.example.recipeproject.controller;

import com.example.recipeproject.entity.Ingredient;
import com.example.recipeproject.entity.Recipe;
import com.example.recipeproject.entity.Step;
import com.example.recipeproject.service.IngredientService;
import com.example.recipeproject.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/calories")
public class RecipeController {

    @Autowired
    IngredientService ingredientService;

    @Autowired
    RecipeService recipeService;

    @GetMapping("/recipe")
    public List<Ingredient> listIngredients() {
        return ingredientService.listAllIngredients();
    }

    @PostMapping("/ing")
    public void addIngredient(@RequestBody Ingredient ingredient) {
        System.out.println(ingredient.toString());
        ingredientService.saveIngredient(ingredient);
    }

    @PostMapping("/recipe")
    public void addRecipe(@RequestBody Recipe recipe) {
        recipeService.saveRecipe(recipe);
    }

    @PutMapping("/recipe/{id}")
    public void updateRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
        recipe.setId(id);
        recipeService.saveRecipe(recipe);
    }

    @GetMapping("/recipe/{id}")
    public Recipe getRecipeById(@PathVariable Long id) {
        return recipeService.getRecipeById(id);
    }

    @DeleteMapping("/recipe/{id}")
    public void deleteRecipeById(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
    }

    @GetMapping("/recipe/{id}/analyze")
    public void analyzeRecipe(@PathVariable Long id) {
        recipeService.analyzeRecipe();
    }

    @GetMapping("/recipe/random")
    public String getRandomRecipe() {
        return recipeService.getRandomRecipe();
    }
}
