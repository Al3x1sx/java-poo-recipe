package com.example.recipeproject.data;

public class Rectangle {
    private static Rectangle instance = null;
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(){
    }

    //pour essayer le singleton
    public static Rectangle getInstance(int width, int length) {
        if(instance == null) {
            instance = new Rectangle(width, length);
        }
        return instance;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void display(){
        StringBuilder line = new StringBuilder();
        StringBuilder square = new StringBuilder();
        line.append("#".repeat(Math.max(0, getWidth())));

        for(int i = 0; i < getLength(); i++) {
            square.append(line).append("\n");
        }

        System.out.println(square);
    }
}
