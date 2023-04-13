package com.example.recipeproject;

import com.example.recipeproject.entity.Ingredient;
import com.example.recipeproject.repository.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeProjectApplication {

	@Autowired
	private IngredientsRepository ingredientsRepository;


	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(RecipeProjectApplication.class, args);
	}
}
