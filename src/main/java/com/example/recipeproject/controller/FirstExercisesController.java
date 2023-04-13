package com.example.recipeproject.controller;

import com.example.recipeproject.data.Square;
import com.example.recipeproject.service.FirstExercisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//dsl c'est overkill lol
@RestController
@RequestMapping("api/first-exercises")
public class FirstExercisesController {

    @Autowired
    FirstExercisesService firstExercisesService;

    @GetMapping("/read-text-file")
    public void readTextFile() throws Exception {
        firstExercisesService.readTextFile();
    }

    @GetMapping("/generate-text-file")
    public void generateTextFile() throws Exception {
        firstExercisesService.generateTextFile();
    }

    @GetMapping("/count-words")
    public void countWords() throws Exception {
        firstExercisesService.countWordInSentence();
    }

    @GetMapping("/find-random")
    public void findRandom() throws Exception {
        firstExercisesService.findRandomNumber();
    }

    @GetMapping("/checkEven")
    public void checkEvenNumber() throws Exception {
        firstExercisesService.checkNumberIsEven();
    }

    @GetMapping("/counter")
    public void counter() {
        firstExercisesService.counter();
    }

    @GetMapping("/pyramid")
    public void pyramid() {
        firstExercisesService.printPyramid("motPyramiiiiid");
    }

    @GetMapping("/reverse")
    public void printReverse() {
        firstExercisesService.printReverse("Mot d'exemple");
    }

    @PostMapping("/showSquare")
    public void showAndCalculSquare(@RequestBody Square square) throws Exception {
        System.out.println("area of square is : " + square.areaCalculation());
        square.display();
    }
}
