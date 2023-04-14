package com.example.recipeproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="recipe")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Recipe {

    @Id
    @Column(name = "id_recipe")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String publication_date;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name="recipe_ingredients",
            joinColumns = @JoinColumn(name = "id_recipe"),
            inverseJoinColumns = @JoinColumn(name = "id_ingredient")
    )
    private List<Ingredient> ingredientList;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name="recipe_steps",
            joinColumns = @JoinColumn(name = "id_recipe"),
            inverseJoinColumns = @JoinColumn(name = "id_step")
    )
    private List<Step> stepList;

}
