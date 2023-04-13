package com.example.recipeproject.entity;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@Table(name="step")
@ToString
public class step {
    private Long id;
    private String title;
    private String description;

    public step() {
    }

    public step(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
