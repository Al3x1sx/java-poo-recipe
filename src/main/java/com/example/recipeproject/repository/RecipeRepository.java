package com.example.recipeproject.repository;

import com.example.recipeproject.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Recipe r SET r.author = :newAuthor, r.publication_date = :newDate, r.title = :newTitle WHERE r.id = :id")
    void updateRecipeById(@Param("newAuthor") String author, @Param("newDate") String date, @Param("newTitle") String title, @Param("id") Long id);
}
