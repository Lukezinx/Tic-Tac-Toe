package TicTacToe.Board;
import TicTacToe.Symbols.Symbols;

public class Board {
    StringBuilder sb = new StringBuilder();

    private Symbols[][] grid;

    public Board() {
        grid = new Symbols[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                grid[i][j] = Symbols.EMPTY;
            }
        }
    }

    public void printBoard() {

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++){

                sb.append(grid[i][j]);
                if (j < grid.length - 1){
                    sb.append('|');
                }
            }
            sb.append('\n');
            if (i < grid.length -1){
                sb.append("--------\n");
            }
        }
        System.out.println(sb);
    }

    public boolean placeSymbol(int row, int col, Symbols symbol) {
        if((row >= 0 && row <= 2) && (col >= 0 && col <= 2)){
            if(grid[row][col] == Symbols.EMPTY) {
                grid[row][col] = symbol;
                return true;
            }
            else {
                System.out.println("already have a piece");
                return false;
            }
        }
        System.out.println("invalid number");
        return false;
    }

    public boolean isFull() {
        for(int i = 0; i < grid.length;i++) {
            for(int j = 0; j < grid.length;j++) {
                if(grid[i][j] == Symbols.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasWinner() {

        // linhas
        for(int i = 0; i < 2; i++) {
            if( grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != Symbols.EMPTY) {
                return true;
            }
        }

        // colunas
        for(int j = 0; j < 2; j++) {
            if( grid[0][j] == grid[1][j] && grid[1][j] == grid[2][j] && grid[0][j] != Symbols.EMPTY) {
                return true;
            }
        }

        // Diagonal Primaria
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != Symbols.EMPTY) {
            return true;
        }

        // Diagonal secundaria
        if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != Symbols.EMPTY) {
            return true;
        }

        return false;
    }

}
