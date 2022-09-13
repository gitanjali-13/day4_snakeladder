package com.bridgelabz.snake.ladder;

public class SnakeAndLadder {
    static int START_POSITION = 0;
    public static void main(String[] args) {
        int dice = (int) (Math.random()*10)%6 +1;

        System.out.println("Welcome to Snake and ladder Game");
        System.out.println("rolling of the die Number:" + dice);
    }
}
