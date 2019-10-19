package com.jetbrains;
import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Double;

public class Main {

    static SecureRandom random = new SecureRandom();
    static Scanner scan        = new Scanner(System.in);
    static int questions       = 0;
    static int correct         = 0;
    static int wrong           = 0;

    public static void main(String[] args) {
        int userInput;
        do {
            int randNum1;
            int randNum2;
            int diffNum  = 0;
            int levelNum = 0;
            int difficultyLevel = difficultyLevels(diffNum);
            int levelNumber     = levelNumbers(levelNum);
            switch (difficultyLevel) {
                case 1:
                    switch (levelNumber) {
                        case 1:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(9) + 1;
                                randNum2 = random.nextInt(9) + 1;
                                addition(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 2:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(9) + 1;
                                randNum2 = random.nextInt(9) + 1;
                                multiply(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 3:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(9) + 1;
                                randNum2 = random.nextInt(9) + 1;
                                subtraction(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 4:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(9) + 1;
                                randNum2 = random.nextInt(9) + 1;
                                divide(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 5:
                            while (questions < 10){
                                questions++;
                                randNum1 = random.nextInt(9) + 1;
                                randNum2 = random.nextInt(9) + 1;
                                mixMode(randNum1, randNum2);
                            }
                            percentage();
                            break;
                    }
                    break;

                case 2:
                    switch (levelNumber) {
                        case 1:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(99) + 1;
                                randNum2 = random.nextInt(99) + 1;
                                addition(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 2:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(99) + 1;
                                randNum2 = random.nextInt(99) + 1;
                                multiply(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 3:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(99) + 1;
                                randNum2 = random.nextInt(99) + 1;
                                subtraction(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 4:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(99) + 1;
                                randNum2 = random.nextInt(99) + 1;
                                divide(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 5:
                            while (questions < 10){
                                questions++;
                                randNum1 = random.nextInt(99) + 1;
                                randNum2 = random.nextInt(99) + 1;
                                mixMode(randNum1, randNum2);
                            }
                            percentage();
                            break;
                    }
                    break;
                case 3:
                    switch (levelNumber) {
                        case 1:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(999) + 1;
                                randNum2 = random.nextInt(999) + 1;
                                addition(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 2:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(999) + 1;
                                randNum2 = random.nextInt(999) + 1;
                                multiply(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 3:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(999) + 1;
                                randNum2 = random.nextInt(999) + 1;
                                subtraction(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 4:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(999) + 1;
                                randNum2 = random.nextInt(999) + 1;
                                divide(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 5:
                            while (questions < 10){
                                questions++;
                                randNum1 = random.nextInt(999) + 1;
                                randNum2 = random.nextInt(999) + 1;
                                mixMode(randNum1, randNum2);
                            }
                            percentage();
                            break;
                    }
                    break;
                case 4:
                    switch (levelNumber) {
                        case 1:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(9999) + 1;
                                randNum2 = random.nextInt(9999) + 1;
                                addition(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 2:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(9999) + 1;
                                randNum2 = random.nextInt(9999) + 1;
                                multiply(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 3:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(9999) + 1;
                                randNum2 = random.nextInt(9999) + 1;
                                subtraction(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 4:
                            while (questions < 10) {
                                questions++;
                                randNum1 = random.nextInt(9999) + 1;
                                randNum2 = random.nextInt(9999) + 1;
                                divide(randNum1, randNum2);
                            }
                            percentage();
                            break;
                        case 5:
                            while (questions < 10){
                                questions++;
                                randNum1 = random.nextInt(9999) + 1;
                                randNum2 = random.nextInt(9999) + 1;
                                mixMode(randNum1, randNum2);
                            }
                            percentage();
                            break;
                    }
            }
            countCorrect();
            countWrong();
            System.out.println("If you like to begin a new session enter 1 or press 0 to exit below: ");
            userInput = scan.nextInt();

        } while(userInput == 1);

    }

    public static int difficultyLevels(int diffNum){
        System.out.println("Difficulty Level: ");
        diffNum = scan.nextInt();
        return diffNum;
    }
    public static int levelNumbers(int levelNum){
        System.out.println("Enter Level number: ");
        levelNum = scan.nextInt();
        return levelNum;
    }

    public static void addition(int randNum1, int randNum2){
        double add = (double) randNum1 + randNum2;
        while(true){
            System.out.println("How much is " + randNum1 + " plus " + randNum2 + "?");
            double randNumNew = scan.nextDouble();
            if (Double.compare(randNumNew,add) == 0){
                correct++;
                correctResponse();
                break;
            }
            else{
                wrong++;
                wrongResponse();
                break;
            }
        }
    }

    public static void multiply(int randNum1, int randNum2){
        double multiplication = (double) randNum1 * randNum2;
        while(true){
            System.out.println("How much is " + randNum1 + " multiply by " + randNum2 + "?");
            double randNumNew = scan.nextDouble();
            if (Double.compare(randNumNew,multiplication) == 0) {
                correct++;
                correctResponse();
                break;
            }
            else{
                wrong++;
                wrongResponse();
                break;
            }
        }
    }

    public static void subtraction(int randNum1, int randNum2){
        double subtract = (double) randNum1 - randNum2;
        while(true){
            System.out.println("How much is " + randNum1 + " minus " + randNum2 + "?");
            double randNumNew = scan.nextDouble();
            if (Double.compare(randNumNew,subtract) == 0){
                correct++;
                correctResponse();
                break;
            }
            else{
                wrong++;
                wrongResponse();
                break;
            }
        }
    }

    public static void divide(int randNum1, int randNum2){
        double division = (double) randNum1 / randNum2;
        while(true){
            System.out.println("How much is " + randNum1 + " divided by " + randNum2 + "?");
            double randNumNew = scan.nextDouble();
            if (Double.compare(randNumNew, division) == 0){
                correct++;
                correctResponse();
                break;
            }
            else{
                wrong++;
                wrongResponse();
                break;
            }
        }
    }

    public static void mixMode(int randNum1, int randNum2){
        int randQuestions = random.nextInt(3) + 1;

        switch (randQuestions) {
            case 0:
                addition(randNum1, randNum2);
                break;
            case 1:
                multiply(randNum1, randNum2);
                break;
            case 2:
                subtraction(randNum1, randNum2);
                break;
            case 3:
                divide(randNum1, randNum2);
                break;
        }
    }

    public static void correctResponse(){
        //random number generation to choose a number from 1 to 4
        int chooseRandNumber = random.nextInt(4);
        switch (chooseRandNumber) {
            case 0:
                System.out.println("Very Good!");
                break;
            case 1:
                System.out.println("Excellent");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }
    public static void wrongResponse(){
        int chooseRandNum = random.nextInt(4);
        switch (chooseRandNum){
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }

    public static void percentage(){
        double checkCorrect = (correct/10);
        if(checkCorrect >= .75){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }
    }
    public static void countCorrect(){
        System.out.println("Correct Answers: " +correct);
    }
    public static void countWrong(){
        System.out.println("Wrong Answers: " +wrong);
    }
}

