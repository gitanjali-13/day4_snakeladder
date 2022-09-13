package com.bridgelabz.snake.ladder;

public class SnakeAndLadder {
    static int START_POSITION = 0;
    static int No_play = 0;
    static int Ladder = 1;
    static int Snake = 2;
    static int Player_position = 0;
    public static void main(String[] args) {
        int dice = (int) (Math.random()*10)%6 +1;

        System.out.println("Welcome to Snake and ladder Game");
        int option = (int)(Math.random() * 10 )% 3;
        if (option == Ladder){
            System.out.println("Ladder^^^");
            Player_position = dice;
        } else if ( option == Snake ) {
            System.out.println("Snake!!!");
            Player_position =dice;

        }else {
            System.out.println("NO-PLAY");
        }
        System.out.println("rolling of the die Number:" + dice);
    }
}
