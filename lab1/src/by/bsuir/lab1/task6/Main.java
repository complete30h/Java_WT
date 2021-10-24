package by.bsuir.lab1.task6;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество чисел: ");
        System.out.println();
        int N = in.nextInt();
        int intArray[] = new int[N];
        for (int i = 0; i < N; i++)
        {
            intArray[i] = random.nextInt(1000);
            System.out.print(" " + intArray[i]);
        }
        System.out.println();
        System.out.println();
        int k = -1;
        int Matrix[][] = new int[N][N];
        for (int i = 0; i < N; i++)
        {
            int f = 0;
            k++;
            for (int j = 0; j < N; j++)
            {
                if (k + j >= N)
                {
                    Matrix[i][j] = intArray[f];
                    f++;
                }
                else
                {
                    Matrix[i][j] = intArray[k + j];
                }
            }
        }
        Print(Matrix);
    }

    static void Print(int[][] Arr)
    {
        for (int i = 0; i < Arr.length; i++)
        {
            for (int j = 0; j < Arr.length; j++)
            {
                System.out.print(" " + Arr[i][j]);
            }
            System.out.println();
        }
    }
}
