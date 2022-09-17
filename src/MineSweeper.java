import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    String[][] board;
    int mineCount = 0;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.board = new String[row][col];
        this.mineCount = (row * col) / 4;
    }

    public void startGame() {
        int right = 0;
        putMine();
        System.out.println("Mine Location");
        printMinely();
        System.out.println("===============================");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.print("Please Enter Row..:");
            int userRow = scanner.nextInt();
            System.out.print("Please Enter Col..:");
            int userCol = scanner.nextInt();
            if (userRow < row && userCol < col) {
                if (board[userRow][userCol] != "*") {
                    if (board[userRow][userCol] == "-") {
                        controlGame(userRow, userCol);
                        right++;
                        if (right == ((row * col) - mineCount)){
                            System.out.println("You are win!!");
                            break;
                        }
                    } else {
                        System.out.println("=================================");
                        System.out.println("Same row and colum.Please enter another..");
                        System.out.println("================================");
                    }
                } else {
                    System.out.println("Game Over");
                    break;
                }
            } else {
                System.out.println("=================================");
                System.out.println("Please enter element in board..");
                System.out.println("================================");
            }
        }

    }

    public void printMinely() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != "*") {
                    board[i][j] = "-";
                }
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == "*") {
                    System.out.print("- ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void putMine() {
        Random random = new Random();
        for (int i = 0; i < mineCount; i++) {
            int rowRandomLocation = random.nextInt(row);
            int colRandomLocation = random.nextInt(col);
            board[rowRandomLocation][colRandomLocation] = "*";
        }
    }

    public void controlGame(int userRow, int userCol) {
        int mineNearestCounter = 0;
        if (userRow > 0 && userCol > 0 && board[userRow - 1][userCol - 1] == "*") {
            mineNearestCounter++;
        }

        if (userRow > 0 && board[userRow - 1][userCol] == "*") {
            mineNearestCounter++;
        }

        if (userRow > 0 && (userCol < col - 1) && board[userRow - 1][userCol + 1] == "*") {
            mineNearestCounter++;
        }

        if (userCol > 0 && board[userRow][userCol - 1] == "*") {
            mineNearestCounter++;
        }

        if ((userCol < col - 1) && board[userRow][userCol + 1] == "*") {
            mineNearestCounter++;
        }

        if ((userRow < row - 1) && userCol > 0 && board[userRow + 1][userCol - 1] == "*") {
            mineNearestCounter++;
        }
        if ((userRow < row-  1) && board[userRow + 1][userCol] == "*") {
            mineNearestCounter++;
        }
        if ((userRow < row - 1) && (userCol < col - 1) && board[userRow + 1][userCol + 1] == "*") {
            mineNearestCounter++;
        }
        board[userRow][userCol] = String.valueOf(mineNearestCounter);
    }


}
