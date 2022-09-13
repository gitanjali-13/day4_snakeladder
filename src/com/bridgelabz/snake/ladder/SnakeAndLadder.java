package com.bridgelabz.snake.ladder;

public class SnakeAndLadder {
    static int START_POSITION = 0;
    static int No_play = 0;
    static int Ladder = 1;
    static int Snake = 2;
    static int Player_position = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and ladder Game");

        while (Player_position < 100) {
            int dice = (int) (Math.random() * 10) % 6 + 1;
            int option = (int) (Math.random() * 10) % 3;

            if (option == Ladder) {
                System.out.println("Ladder^^^");
                Player_position += dice;

            } else if (option == Snake) {
                System.out.println("Snake!!!");
                Player_position += dice;

            } else {
                System.out.println("NO-PLAY");
            }
            if (Player_position < START_POSITION) {
                Player_position = START_POSITION;
            }
            if (Player_position> 100){
                Player_position = 100;
            }
            System.out.println("Player position  is :" + Player_position);
        }
    }
}
