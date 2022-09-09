import java.util.Scanner;
import java.util.Random;

public class MineSweeper<MineSweeperRules> {
    int row;
    int col;
    int countOfMineMine;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.countOfMineMine = (row * col) / 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a column");
        int colNumber = scanner.nextInt();
        System.out.println("Please Enter a row");
        int rowNumber = scanner.nextInt();

    }

    public MineSweeperRules() {
        int[][] mineMap;
        int[][] baseMap;
        int number = 1;

        for (int i = 0; i < mineMap.length; i++)
        {
            int[] row = mineMap[i];

            for (int j = 0; baseMap < row.length; j++)
            {
                row[j] = number;
                number++;

            }
    }










