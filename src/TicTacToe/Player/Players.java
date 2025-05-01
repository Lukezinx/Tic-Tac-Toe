package TicTacToe.Player;

import TicTacToe.Board.Board;
import TicTacToe.Symbols.Symbols;
import java.util.*;

public class Players {

    private String name;
    private Symbols symbol;

    public Players(String name, Symbols symbols) {
        this.name = name;
        this.symbol = symbols;
    }

    public String getName() {
        return name;
    }


    public Symbols getSymbol() {
        return symbol;
    }

    public void play(Board board) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("tell me the column and row of your move");
            System.out.print("Row -> ");
            row = sc.nextInt();
            sc.nextLine();
            System.out.print("Collum -> ");
            col = sc.nextInt();
            sc.nextLine();

        } while (!board.placeSymbol(row, col,this.symbol));
    }
}
