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
                if (checkBoundary(x, y) == false) {
                    System.out.println("Invalid move. Please try again.");
                    continue;
                }
                if (x == 0) {
                    board[y][x] = "x";}
                else {
                    board[y][x] = "-x";}
                printBoard();
                turn++;
                
                
            } else {
                System.out.println("Player 2, please enter the x coordinate of your move: ");
                x = scanner.nextInt();
                System.out.println("Player 2, please enter the y coordinate of your move: ");
                y = scanner.nextInt();
                if (checkBoundary(x, y) == false) {
                    System.out.println("Invalid move. Please try again.");
                    continue;
                }
                if (x == 0) {
                    board[y][x] = "o";}
                else {
                    board[y][x] = "-o";}
                printBoard();
                turn++;
                }
            }   
        }
    
        


    static void initializeBoard() {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (i == 0) {
                    if (j == 0) {
                        board[i][j] = "┌";
                    } else if (j == 18) {
                        board[i][j] = "-┐";
                    } else {
                        board[i][j] = "-┬";
                    }
                } else if (i == 18) {
                    if (j == 0) {
                        board[i][j] = "└";
                    } else if (j == 18) {
                        board[i][j] = "-┘";
                    } else {
                        board[i][j] = "-┴";
                    }
                } else {
                    if (j == 0) {
                        board[i][j] = "├";
                    } else if (j == 18) {
                        board[i][j] = "-┤";
                    } else {
                        board[i][j] = "-┼";
                    }

                }
            }
        }
    }
    static boolean checkBoundary(int x, int y) {
        if (x < 0 || x > 18 || y < 0 || y > 18) {
            return false;
        }
        return true;

    }

    static void printBoard() {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        
        }
    }
}