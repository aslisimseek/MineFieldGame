import java.util.Scanner;

public class MineFieldGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please board max row..:");
        int generalRow = scanner.nextInt();
        System.out.print("Please board max column..:");
        int generalCol = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(generalRow, generalCol);
        mineSweeper.startGame();
    }
}
