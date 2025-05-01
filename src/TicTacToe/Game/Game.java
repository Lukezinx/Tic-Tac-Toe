package TicTacToe.Game;

import TicTacToe.Board.Board;
import TicTacToe.Player.Players;
import TicTacToe.SavedGame.SaveGame;
import TicTacToe.Symbols.Symbols;

import java.util.*;

public class Game {

    Scanner sc = new Scanner(System.in);
    private  boolean gameOver = false;

    public void start() {

        System.out.println("First player name");
        String currentPlayer1 = sc.nextLine();
        Players player = new Players(currentPlayer1, Symbols.X);

        System.out.println("Second player name");
        String currentPlayer2 = sc.nextLine();
        Players player2 = new Players(currentPlayer2, Symbols.O);

        Board board = new Board();
        Players currentPlayer = player;
        System.out.println("Game started");

        do {
            System.out.println(currentPlayer.getName() + "'s turn");
            board.printBoard();
            currentPlayer.play(board);
            System.out.println();

            if (board.hasWinner(currentPlayer.getSymbol())) {
                System.out.println(currentPlayer.getName() + " wins!");
                board.printBoard();
                gameOver = true;
            } else if (board.checkDraw()) {
                System.out.println("It's a draw!");
                board.printBoard();
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == player) ? player2 : player;
            }

        } while(!gameOver);

        System.out.println("Do you want to save the game?");
        System.out.println("[1] - Yes");
        System.out.println("[0] - No");
        int option = sc.nextInt();
        if(option == 1) {
            SaveGame saveGame = new SaveGame();
            saveGame.save(board,player,player2,currentPlayer,"saveGame.txt");
        } else {
            System.exit(0);
        }


    }
}
