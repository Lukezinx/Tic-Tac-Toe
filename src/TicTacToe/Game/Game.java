package TicTacToe.Game;

import TicTacToe.Board.Board;
import TicTacToe.Player.Players;
import TicTacToe.SavedGame.SaveGame;
import TicTacToe.Symbols.Symbols;

import java.util.*;

public class Game {

    private Players player;
    private SaveGame saveGame;
    private Board board;
    private Symbols symbols;

    Scanner sc = new Scanner(System.in);
    public void start(){

        boolean gameOver = false;
        while(!gameOver){
            new Board().printBoard();
        }
    }
}
