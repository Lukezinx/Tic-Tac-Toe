package TicTacToe.Symbols;

public enum Symbols {
    X,O,EMPTY;


    @Override
    public String toString() {
        if (this == X) {
            return "X";
        } else if (this == O) {
            return "O";
        }
        return " ";
    }
}
