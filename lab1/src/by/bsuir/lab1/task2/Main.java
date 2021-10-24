package by.bsuir.lab1.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = in.nextInt();
        System.out.print("Enter y: ");
        int y = in.nextInt();
        System.out.print(pointBelonging(x, y));
    }

    protected static boolean pointBelonging(int x, int y)
    {
        boolean isBelong = false;
        if (((x >= -6 && x <= 6) && (y >= -3 && y <= 0)) || ((x >= -4 && x <= 4) && (y >= 0 && y <= 5)))
            isBelong = true;
        return isBelong;
    }
}