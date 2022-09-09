import java.util.Random;
import java.util.Scanner;

public class MineSweeper<MineSweeperRules> {
    int row;
    int col;
    int countOfMineMine;
    int gameArea;

    public MineSweeperArea(int row, int col) {
        this.row = row;
        this.col = col;
        this.countOfMineMine = (row * col) / 4;
        Random randomNumber = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a column");
        int colNumber = scanner.nextInt();
        System.out.println("Please Enter a row");
        int rowNumber = scanner.nextInt();

    }

    public MineSweeperRules() {

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.gameArea[i][j] = "-";


            }
        }

    }
    public void minedMap() {
        int locationMine = 0;

        while (locationMine != countOfMineMine) {
            int mineRow = (int) (Math.random() * this.row);
            int mineCol = (int) (Math.random() * this.col);

            if (this.minedMap();[mineRow][mineCol] != ("*")) {
                countOfMineMine();[mineRow][mineCol] = "*";
                locationMine++;

}






