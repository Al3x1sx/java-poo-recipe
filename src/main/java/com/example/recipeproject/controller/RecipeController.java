package com.example.recipeproject.controller;

import com.example.recipeproject.entity.Ingredient;
import com.example.recipeproject.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calories")
public class RecipeController {

    @Autowired
    IngredientService ingredientService;

    @GetMapping("/recipe")
    public List<Ingredient> listIngredients() {
        return ingredientService.listAllIngredients();
    }

    @PostMapping("/ing")
    public void addIngredient(@RequestBody Ingredient ingredient) {
        System.out.println(ingredient.toString());
        ingredientService.saveIngredient(ingredient);
    }
}
