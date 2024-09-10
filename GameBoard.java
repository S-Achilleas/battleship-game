
public class GameBoard {
    public void displayBoard() {
        int line = 1;
        while (line <= 8) {
            int column = 1;  // Reset column for each new line
            System.out.println();  // Start a new line in the output
            while (column <= 8) {  // Only print up to 7 columns
                System.out.print(line + "," + column + " ");
                column++;
            }
            line++;
        }
        System.out.println();  // For clean output after the board
    }
}