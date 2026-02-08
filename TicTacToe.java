import java.util.*;

public class TicTacToe{
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    public static final String PURPLE = "\u001B[35m";

    public static void printBoard(char[][] board) {
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(" ");

            for (int j = 0; j < 3; j++) {
                char cell = board[i][j];

                if (cell == 'X') {
                    System.out.print(RED + cell + RESET);
                } else if (cell == 'O') {
                    System.out.print(BLUE + cell + RESET);
                } else {
                    System.out.print(YELLOW + cell + RESET);
                }

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    public static boolean hasWon(char player, char[][] board) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] findWinningMove(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    char temp = board[i][j];
                    board[i][j] = symbol;

                    if (hasWon(symbol, board)) {
                        board[i][j] = temp;
                        return new int[] { i, j };
                    }

                    board[i][j] = temp;
                }
            }
        }
        return null;
    }

    public static int[] getRandomMove(char[][] board) {
        Random rand = new Random();
        int row, col;

        do {
            row = rand.nextInt(3);
            col = rand.nextInt(3);
        } while (board[row][col] == 'X' || board[row][col] == 'O');

        return new int[] { row, col };
    }

    public static int[] chooseCell(Scanner sc) {
        while (true) {
            System.out.print(CYAN + "Choose a cell (1-9): " + RESET);

            try {
                int cell = sc.nextInt();

                if (cell < 1 || cell > 9) {
                    System.out.println(RED + "Invalid entry! Must be 1-9." + RESET);
                    continue;
                }

                int row = (cell - 1) / 3;
                int col = (cell - 1) % 3;

                return new int[] { row, col };

            } catch (InputMismatchException e) {
                System.out.println(RED + "Invalid input! Enter numbers only." + RESET);
                sc.nextLine();
            }
        }
    }

    public static void playHumanVsHuman(Scanner sc, char[][] board) {
        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard(board);
            System.out.println(CYAN + "Player " + currentPlayer + ", your turn." + RESET);

            int[] move = chooseCell(sc);

            if (board[move[0]][move[1]] == 'X' || board[move[0]][move[1]] == 'O') {
                System.out.println(RED + "Cell occupied! Try again." + RESET);
                continue;
            }

            board[move[0]][move[1]] = currentPlayer;

            if (hasWon(currentPlayer, board)) {
                printBoard(board);
                System.out.println(GREEN + "Player " + currentPlayer + " wins!" + RESET);
                gameEnded = true;
            } else if (isDraw(board)) {
                printBoard(board);
                System.out.println(YELLOW + "Game Drawn!" + RESET);
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    public static void playHumanVsComputer(Scanner sc, char[][] board) {
        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            if (currentPlayer == 'X') {
                printBoard(board);
                System.out.println(CYAN + "Your turn (X)" + RESET);

                int[] move = chooseCell(sc);

                if (board[move[0]][move[1]] == 'X' || board[move[0]][move[1]] == 'O') {
                    System.out.println(RED + "Cell occupied! Try again." + RESET);
                    continue;
                }

                board[move[0]][move[1]] = 'X';

            } else {
                System.out.println(PURPLE + "Computer is thinking..." + RESET);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                int[] move = findWinningMove(board, 'O');

                if (move == null) {
                    move = findWinningMove(board, 'X');
                }

                if (move == null) {
                    move = getRandomMove(board);
                }

                board[move[0]][move[1]] = 'O';
            }

            if (hasWon(currentPlayer, board)) {
                printBoard(board);

                if (currentPlayer == 'X') {
                    System.out.println(GREEN + "You win!" + RESET);
                } else {
                    System.out.println(RED + "Computer wins!" + RESET);
                }

                gameEnded = true;

            } else if (isDraw(board)) {
                printBoard(board);
                System.out.println(YELLOW + "Game Drawn!" + RESET);
                gameEnded = true;

            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(PURPLE);
        System.out.println(" _____ ___ ____   _____  _    ____   _____ ___  _____ ");
        System.out.println("|_   _|_ _/ ___| |_   _|/ \\  / ___| |_   _/ _ \\| ____|");
        System.out.println("  | |  | | |       | | / _ \\| |       | || | | |  _|  ");
        System.out.println("  | |  | | |___    | |/ ___ \\ |___    | || |_| | |___ ");
        System.out.println("  |_| |___\\____|   |_/_/   \\_\\____|   |_| \\___/|_____|");
        System.out.println(RESET);
        System.out.println();

        while (true) {
            System.out.println(GREEN + "┌─────────────────────┐" + RESET);
            System.out.println(GREEN + "│ 1) Human vs Human   │" + RESET);
            System.out.println(GREEN + "│ 2) Human vs Computer│" + RESET);
            System.out.println(GREEN + "│ 3) Exit             │" + RESET);
            System.out.println(GREEN + "└─────────────────────┘" + RESET);
            System.out.print(CYAN + "Select an option: " + RESET);

            int choice = 0;

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
            }

            if (choice == 3) {
                System.out.println(YELLOW + "Exiting... Goodbye!" + RESET);
                break;
            }

            char[][] board = {
                    { '1', '2', '3' },
                    { '4', '5', '6' },
                    { '7', '8', '9' }
            };

            if (choice == 1) {
                playHumanVsHuman(sc, board);
            } else if (choice == 2) {
                playHumanVsComputer(sc, board);
            } else {
                System.out.println(RED + "Invalid choice! Try again." + RESET);
            }

            System.out.println();
        }

        sc.close();
    }
}
