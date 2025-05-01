package TicTacToe.Board;
import TicTacToe.Symbols.Symbols;

public class Board {


    private Symbols[][] grid;

    public Symbols[][] getGrid() {
        return grid;
    }

    public Board() {
        grid = new Symbols[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                grid[i][j] = Symbols.EMPTY;
            }
        }
    }

    public void printBoard() {
        StringBuilder sb = new StringBuilder();
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
                System.out.println();
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


    public boolean checkDraw() {
        return isFull() && !hasWinner(Symbols.X) && !hasWinner(Symbols.O);
    }

    public boolean hasWinner(Symbols symbols) {

        // linhas
        for(int i = 0; i < 3; i++) {
            if( grid[i][0] == symbols && grid[i][1] == symbols && grid[i][2] == symbols) {
                return true;
            }
        }

        // colunas
        for(int j = 0; j < 3; j++) {
            if( grid[0][j] == symbols && grid[1][j] == symbols && grid[2][j] == symbols) {
                return true;
            }
        }

        // Diagonal Primaria
        if (grid[0][0] == symbols && grid[1][1] == symbols && grid[2][2] == symbols) {
            return true;
        }

        // Diagonal secundaria
        if (grid[0][2] == symbols && grid[1][1] == symbols && grid[2][0] == symbols) {
            return true;
        }

        return false;
    }

}
