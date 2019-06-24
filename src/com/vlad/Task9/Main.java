package com.vlad.Task9;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.makeMove(5);
        game.makeMove(7);
        game.makeMove(1);

        game.backMove();

        game.makeMove(2);

    }
}
