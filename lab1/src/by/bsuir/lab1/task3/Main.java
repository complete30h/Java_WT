package by.bsuir.lab1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        double x = a;
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter h: ");
        double h = in.nextDouble();
        while (x <= b)
        {
            System.out.printf("------------------------------\n");
            System.out.printf("x = %.3f | f(x) = %.3f\n", x, Math.tan(x));
            x += h;
        }
        if (x != b)
        {
            System.out.printf("------------------------------\n");
            System.out.printf("x = %.3f | f(x) = %.3f\n", b, Math.tan(b));
        }
        System.out.printf("------------------------------\n");
    }
}