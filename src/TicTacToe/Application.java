package TicTacToe;

import TicTacToe.Board.Board;


import static TicTacToe.Symbols.Symbols.O;
import static TicTacToe.Symbols.Symbols.X;

public class Application {

    public static void main(String[] args){

        // Funcionando

        Board p = new Board();
        p.placeSymbol(0,0,X);
        p.placeSymbol(1,0,X);
        p.placeSymbol(2,0,X);
        p.printBoard();

        System.out.println(p.hasWinner());
    }
}
