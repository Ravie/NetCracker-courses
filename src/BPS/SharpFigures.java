package BPS;

import java.util.Scanner;

public class SharpFigures {
    public static void DrawFigure(int size, char figure) {
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                DrawSharp(size, figure, row, col);
            }
            System.out.println("");
        }
    }

    public static void DrawSharp(int size, char figure, int row, int col) {
        switch (figure) {
            case 'c':
                if(col >= row)
                    System.out.print("# ");
                else
                    System.out.print("  ");
                break;
            case 'e':
                if(col == 1 || col == size || row == 1 || row == size)
                    System.out.print("# ");
                else
                    System.out.print("  ");
                break;
            case 'i':
                if(col == row || col + row == size + 1 || col == 1 || col == size || row == 1 || row == size)
                    System.out.print("# ");
                else
                    System.out.print("  ");
                break;
            default:
                System.out.println("Figure not found");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите size: ");
        int size = in.nextInt();
        System.out.print("Введите figure: ");
        char figure = in.next().charAt(0);
        DrawFigure(size, figure);
    }
}
