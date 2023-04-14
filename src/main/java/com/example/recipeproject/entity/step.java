package com.example.recipeproject.entity;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@Table(name="step")
@ToString
public class Step {
    private Long id;
    private String title;
    private String description;

    public Step() {
    }

    public Step(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Id
    @Column(name="id_step")
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
