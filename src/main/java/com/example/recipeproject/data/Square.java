package com.example.recipeproject.data;

public class Square extends Rectangle {
    public Square(int length, int width) {
        super(length, width);
    }

    public int areaCalculation(){
        return getLength() * getWidth();
    }
}
