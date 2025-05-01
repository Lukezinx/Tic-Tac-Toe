package TicTacToe.SavedGame;

import TicTacToe.Board.Board;
import TicTacToe.Player.Players;
import TicTacToe.Symbols.Symbols;

import java.io.*;
import java.util.*;

public class SaveGame {
    Scanner sc = new Scanner(System.in);
    public void save(Board board, Players player1, Players player2, Players currentPlayer, String filePath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            File file = new File(filePath);
            if (file.exists()) {
                System.out.println("File already exists. Overwrite? (y/n)");
                String response = sc.nextLine();
                if (!response.equalsIgnoreCase("y")) {
                    return;
                }
            }

            Symbols[][] grid = board.getGrid();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    writer.write(grid[i][j].name());
                    if (j < grid[i].length - 1) writer.write(",");
                }
                writer.newLine();
            }

            writer.newLine();

            // Salva os jogadores
            writer.write("Player1:" + player1.getName() + "," + player1.getSymbol().name());
            writer.newLine();
            writer.write("Player2:" + player2.getName() + "," + player2.getSymbol().name());
            writer.newLine();


            writer.write("CurrentPlayer:" + currentPlayer.getName());
            writer.newLine();

            System.out.println("Game saved successfully!");

        }
        catch (IOException e) {
            System.out.println("Error saving game: " + e.getMessage());
        }
    }
}
