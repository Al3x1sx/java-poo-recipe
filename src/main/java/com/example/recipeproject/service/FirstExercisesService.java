package com.example.recipeproject.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Random;

@Service
public class FirstExercisesService {

    public void readTextFile() throws Exception {
        File file;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Write the path to the file");

        String path = reader.readLine();

        try {
            file = new File(path);

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }

        } catch (Exception e) {
            System.out.println("file not found");
        }


    }

    public void generateTextFile()
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Write a sentence I will put it in a file");

        String phrase = reader.readLine();

        File myObj = new File("filename.txt");

        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write(phrase);
        myWriter.close();
    }

    public void countWordInSentence()
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Write a sentence I will count the number of words");

        String phrase = reader.readLine();

        String[] words = phrase.split("\\s+");
        System.out.println("Il y a " + words.length + " mots dans votre phrase");
    }

    public void findRandomNumber()
            throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        boolean find = false;
        Random rand = new Random();
        int random = rand.nextInt(25);
        int nbCoups = 0;
        System.out.println("I choose a number, find it !");
        while (!find) {
            System.out.println("Enter a number : ");
            int num = Integer.parseInt(reader.readLine());
            if (num == random) {
                find = true;
                System.out.println("Congrats !!!");
            } else if (num < random) {
                System.out.println("bigger");
            } else {
                System.out.println("smaller");
            }
            nbCoups += 1;
        }

        System.out.println("nombre de coups : " + nbCoups);
    }

    public void checkNumberIsEven()
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int num = Integer.parseInt(reader.readLine());

        if (num % 2 == 0)
            System.out.println(num + " est pair");
        else
            System.out.println(num + " est impair");
    }

    public void counter() {
        int counter = 0;
        for (int i = 0; i <= 10000; i++) {
            counter = counter + i;
        }
        System.out.println(counter);
    }

    public void printPyramid(String arg) {
        String pyramid = "";


        for (int i = 0; i < arg.length(); i++) {
            pyramid = pyramid + arg.charAt(i);
            System.out.println(pyramid);
        }

        for (int i = arg.length() - 1; i >= 0; i--) {
            pyramid = pyramid.substring(0, i);
            System.out.println(pyramid);
        }

    }

    public void printReverse(String arg) {
        StringBuilder nstr = new StringBuilder();
        char ch;

        System.out.print("Original word: ");
        System.out.println(arg); //Example word

        for (int i = 0; i < arg.length(); i++) {
            ch = arg.charAt(i); //extracts each character
            nstr.insert(0, ch); //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }
}
