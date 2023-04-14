package com.example.recipeproject.service;

import com.example.recipeproject.entity.Ingredient;
import com.example.recipeproject.entity.Recipe;
import com.example.recipeproject.repository.RecipeRepository;
import jakarta.transaction.Transactional;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Random;


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

    public String analyzeRecipe(Long id) throws IOException, ParseException {
        Optional<Recipe> recipe = recipeRepository.findById(id);
        JSONParser jsonParser = new JSONParser();
        String fileName = "src\\main\\java\\com\\example\\recipeproject\\dictionary\\calories-data.json";

        FileReader reader = new FileReader(fileName);
        JSONObject object = (JSONObject) jsonParser.parse(reader);

        Random random = new Random();
        int totalCalories = 0;

        if (recipe.isPresent()) {
            List<Ingredient> ingredientList = recipe.get().getIngredientList();
            for (Ingredient ingredient : ingredientList) {

                try {
                    Object value = object.get(ingredient.getName());
                    String test = value.toString();
                    int yolo = Integer.parseInt(test);
                    totalCalories += yolo * ingredient.getQuantity();
                } catch (Exception e) {
                    System.out.println("ingredient not found");
                    int value = random.nextInt(500);
                    totalCalories += value * ingredient.getQuantity();
                }
            }
            return "Le total de calories est : " + totalCalories;
        }
        else {
            return "cette recette n'existe pas";
        }
    }
}
