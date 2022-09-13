package com.bridgelabz.snake.ladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;
        int afterrolling = (int)Math.floor(Math.random() * 10 ) % 6 + 1;
        System.out.println("position" +afterrolling);
    }
}
