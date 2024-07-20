import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        Scanner reader = new Scanner(System.in);
        printBoard(board);
        int validMoves = 0;
        boolean gameEnded = false;
        int player = 0;

        while (!gameEnded) {
            System.out.println("Player " + (player + 1) + " enter a row number: ");
            int row = reader.nextInt();

            System.out.println("Player " + (player + 1) + " enter a column number: ");
            int col = reader.nextInt();

            if (isValid(row, col) && (board[row - 1][col - 1] == ' ')) {
                board[row - 1][col - 1] = player == 0 ? 'X' : 'O';
                printBoard(board);
                player = ++player % 2;
                validMoves++;
            } else {
                System.out.println("Wrong cooordinates !!!!!");
            }

            gameEnded = checkBoard(board, row - 1, col - 1);
            if (validMoves == 9) {
                System.out.println("It's a draw!");
                break;
            }
            if (gameEnded) {
                player = ++player % 2;
                System.out.println("Player " + (player + 1) + " WON");
            }
        }
        reader.close();
    }

    public static boolean checkBoard(char[][] board, int row, int col) {
        if (!isValid(row + 1, col + 1)) {
            return false;
        }
        char symbol = board[row][col];

        boolean win = true;
        for (int i = 0; i < 3; i++) {
            if (board[row][i] != symbol) {
                win = false;
                break;
            }
        }
        if (win) {
            return true;
        }
        win = true;

        for (int i = 0; i < 3; i++) {
            if (board[i][col] != symbol) {
                win = false;
                break;
            }
        }

        if (win) {
            return true;
        }
        if (row == col) {
            win = true;
            for (int i = 0; i < 3; i++) {
                if (board[i][i] != symbol) {
                    win = false;
                    break;
                }
            }
        }

        if (win) {
            return true;
        }

        if (row + col == 2) {
            win = true;
            for (int i = 0; i < 3; i++) {
                if (board[2 - i][i] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        System.out.println("    1   2   3");
        System.out.println("   -----------");

        for (int row = 0; row < 3; ++row) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < 3; ++col) {
                System.out.print("|");
                System.out.print(" " + board[row][col] + " ");
                if (col == 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            System.out.println("   -----------");
        }
    }

    public static boolean isValid(int row, int col) {
        if (row < 1 || row > 3) {
            return false;
        }
        if (col < 1 || col > 3) {
            return false;
        }
        return true;

    }
}
