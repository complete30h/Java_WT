package by.bsuir.lab1.task7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размерность массива: ");
        int N = in.nextInt();
        int intArray[] = new int[N];
        for (int i = 0; i < N; i++) {
            intArray[i] = random.nextInt(10);
            System.out.printf(" элемент:  " + intArray[i]);
        }

        ShellSort(intArray);
        System.out.println();
        Print(intArray);
    }

    static void ShellSort(int[] Arr)
    {
        for (int i = 0; i < Arr.length - 1;)
        {
            if (Arr[i] <= Arr[i+1])
            {
                i++;
            }

            else if (Arr[i] > Arr[i + 1])
            {
                int temp = Arr[i];
                Arr[i] = Arr[i+1];
                Arr[i+1] = temp;
                if (i!= 0)
                {
                    i--;
                }
            }
        }
    }

    static void Print(int[] Arr)
    {
            for (int j = 0; j < Arr.length; j++)
            {
                System.out.print(" " + Arr[j]);
            }
            System.out.println();
    }
}
