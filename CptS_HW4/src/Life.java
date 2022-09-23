/**
 * Ryan Garbutt
 * CptS 132 Spring 2021
 * HW4 Life, Next Generation
 */


import java.util.Random;
import java.util.Scanner;


public class Life {

    final static String aliveCell = "O", deadCell = ".";

    private boolean[][] board;

    public Life() {
        board = new boolean[19][19];
    }

    public static void main(String[] args) {

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        int startNum = 0;
        // Initialize board array
        Life board = new Life();

        board.clearBoard();

        // Display welcome message
        System.out.println("Welcome to the game of Life!");
        do {
            // Display menu
            System.out.print("Press \"1\" to begin:");

            startNum = scanner.nextInt();

            if (startNum == 1) {
                if (startNum == 1) {
                    board.startGame();
                }

                String stringChoice = "";
                int generationNum = 0;
                do {
                    // Display generation
                    System.out.println("\nGeneration: " + generationNum);
                    System.out.println(board);

                    // Check if the user wants to continue
                    System.out
                            .print("Press Enter for next generation, 'end' to stop: ");
                    stringChoice = scanner.nextLine().trim();

                    // Increase generation
                    generationNum += 1;
                    board.nextGeneration();
                } while (!stringChoice.equalsIgnoreCase("end"));
            }

            board.clearBoard();

        } while (startNum == 1);

        // Close scanner
        scanner.close();
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                s += (board[i][j] ? aliveCell : deadCell + " ");
            }
            s += "\n";
        }

        int aliveCount = aliveCellNumber();

        // Display number of alive cells
        if (aliveCount == 0)
            s += "No cells are alive.";
        else if (aliveCount == 1)
            s += "1 cell is alive.";
        else
            s += aliveCount + " cells are alive.";

        return s + "\n";
    }


    public int aliveCellNumber() {
        int alive = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j])
                    alive++;
            }
        }
        return alive;
    }

    //Clears the world by setting all the cells to dead
    public void clearBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = false;
            }
        }
    }

    //Generates random cells on the board
    public void startGame() {
        Random r = new Random(6);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (r.nextInt() <= 10);
            }
        }
    }


    //Checks to see if cells are alive or dead
    public boolean aliveCellCheck(int cellRow, int cellColumn) {

        if (cellRow < 10 && cellRow >= 0 && cellColumn < 10 && cellColumn >= 0) {
            if (board[cellRow][cellColumn]) {
                return true;
            }
        }
        return false;
    }

    //Counts the neighbors around a cell
    public int aliveNeighbors(int row, int col) {
        int currentAliveNeighbor = 0;

        if (aliveCellCheck(row - 1, col - 1))
            currentAliveNeighbor++;
        if (aliveCellCheck(row - 1, col))
            currentAliveNeighbor++;
        if (aliveCellCheck(row - 1, col + 1))
            currentAliveNeighbor++;

        if (aliveCellCheck(row, col - 1))
            currentAliveNeighbor++;
        if (aliveCellCheck(row, col + 1))
            currentAliveNeighbor++;

        if (aliveCellCheck(row + 1, col - 1))
            currentAliveNeighbor++;
        if (aliveCellCheck(row + 1, col))
            currentAliveNeighbor++;
        if (aliveCellCheck(row + 1, col + 1))
            currentAliveNeighbor++;

        return currentAliveNeighbor;
    }

    //Returns true if cell is alive in the next generation.
    //Returns false if the cell is dead in the next generation.
    public boolean aliveInNextGeneration(int numLivingNeighbors,
                                                boolean cellCurrentlyLiving) {
        if (cellCurrentlyLiving) {
            if (numLivingNeighbors == 3 || numLivingNeighbors == 2) {
                return true;
            }
        } else {
            if (numLivingNeighbors == 3) {
                return true;
            }
        }
        return false;
    }

    //Determines which cells are alive in the next generation.
    public void nextGeneration() {
        boolean[][] newBoard = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                newBoard[i][j] = aliveInNextGeneration(
                        aliveNeighbors(i, j),
                        board[i][j]);
            }
        }

        board = newBoard;
    }
}