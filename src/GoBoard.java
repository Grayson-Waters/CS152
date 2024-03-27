// package src;

import java.util.Scanner;

public class GoBoard {
    // Declare board as a class-level variable
    private static String[][] board = new String[19][19];

    public static void main(String[] args) {
        // Call initializeBoard to set up the board
        initializeBoard();
        // Call printBoard to print the board
        printBoard();
        Scanner scanner = new Scanner(System.in);
        
        int x = 0;
        int y = 0;
        int turn = 0;
        while (true) {
            if (turn % 2 == 0) {
                System.out.println("Player 1, please enter the x coordinate of your move: ");
                x = scanner.nextInt();
                System.out.println("Player 1, please enter the y coordinate of your move: ");
                y = scanner.nextInt();
                if (board[x - 1][y - 1] == "-|-") {
                    board[x - 1][y - 1] = "-◯-";
                    printBoard();
                    turn++;
                } else {
                    System.out.println("Invalid move, please try again.");
                    continue;
                }
            } else {
                System.out.println("Player 2, please enter the x coordinate of your move: ");
                x = scanner.nextInt();
                System.out.println("Player 2, please enter the y coordinate of your move: ");
                y = scanner.nextInt();
                if (board[x - 1][y - 1] == "-|-") {
                    board[x - 1][y - 1] = "-●-";
                    printBoard();
                    turn++;
                } else {
                    System.out.println("Invalid move, please try again.");
                    continue;
                }
            }
        }
    }

    static void initializeBoard() {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                board[i][j] = "-|-";
            }
        }
    }

    static void printBoard() {
        System.out.print("  ");
        for (int t = 1; t < 20; t++) {
            if (t < 10) {
                System.out.print(" " + t + " ");
            } else {
                System.out.print(" " + t);
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (j % 19 == 0) {
                    System.out.println();
                    if (i < 9) {
                        System.out.print(i + 1 + " ");
                    } else {
                        System.out.print(i + 1);
                    }
                }
                System.out.print(board[i][j]);
            }
        }
        System.out.println();
    }
}