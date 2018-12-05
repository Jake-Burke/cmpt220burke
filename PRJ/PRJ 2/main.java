import java.util.Scanner;

public class main {

    public static void main(String[] args) {
    	
        char player = 'o';
        int row;
        int column;
       
        Scanner Input = new Scanner(System.in);
        Game ttt = new Game();

        ttt.startGame();
        System.out.println("Tic-Tac-Toe in Java is now ready to play.");
        ttt.displayBoard();

        while (true) {
            player = ttt.changePlayer(player);
            System.out.print("\nPlayer " + player + " ,choose your spot (Row, Column):");
            row = Input.nextInt();
            column = Input.nextInt();

            while (ttt.checkIfOpen(row, column)) {
                System.out.println("That spot is already taken, please try again (Row, Column).");
                ttt.displayBoard();
                row = Input.nextInt();
                column = Input.nextInt();
            }
            ttt.changeBoard(player, row, column);
            ttt.displayBoard();
            
            if (ttt.checkIfTie()) {
                System.out.println("\nThe game is a tie!  Play again to find out who is the real winner!");
                break;
            }

            if (ttt.checkIfWinner()) {
                System.out.println("\nPlayer " +player + " has won!");
                break;

            }
          
        }


    }

}

