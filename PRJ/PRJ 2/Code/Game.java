
public class Game {

    char[][] grid = new char[3][3];

    public void startGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	grid[i][j] = ' ';
            }
        }
    }


    public boolean checkIfOpen(int row, int column) {
        if ((row > 2 || column > 2) || (row < 0 || column < 0)) {
            return true;
        } else if (grid[row][column] == 'x' || grid[row][column] == 'o') {
            return true;
        }

        return false;
    }


    public void changeBoard(char player, int row, int column) {
    	grid[row][column] = player;

    }


    public void displayBoard() {
    	System.out.println("_____________________________________________________");
    	 System.out.println("  +---+---+---+");
         System.out.println("0 | " + grid[0][0] + " | " +grid[0][1] + " | " + grid[0][2] + " |");
         System.out.println("  +---+---+---+");
         System.out.println("1 | " +grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " |");
         System.out.println("  +---+---+---+");
         System.out.println("2 | " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " |");
         System.out.println("  +---+---+---+");
         System.out.println("   0   1   2 ");

    }


    public char changePlayer(char player) {
        char newTurn = 'z';
        if (player == 'o') {
            newTurn = 'x';
        }
        if (player == 'x') {
            newTurn = 'o';
        }
        return newTurn;
    }

    public boolean checkIfTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
    
    public boolean checkIfWinner() {
        if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0] && (grid[0][0] == 'x' || grid[0][0] == 'o')) {
            return true;
        } else if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1] && (grid[0][1] == 'x' || grid[0][1] == 'o')) {
            return true;
        } else if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2] && (grid[0][2] == 'x' || grid[0][2] == 'o')) {
            return true;
        } else if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2] && (grid[0][0] == 'x' || grid[0][0] == 'o')) {
            return true;
        } else if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2] && (grid[1][0] == 'x' || grid[1][0] == 'o')) {
            return true;
        } else if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2] && (grid[2][0] == 'x' || grid[2][0] == 'o')) {
            return true;
        } else if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && (grid[0][0] == 'x' || grid[0][0] == 'o')) {
            return true;
        } else if (grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2] && (grid[2][0] == 'x' || grid[2][0] == 'o')) {
            return true;
        } else {
            return false;
        }
    }
}
