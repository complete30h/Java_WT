package by.bsuir.lab1.task5;

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
        System.out.println();

        int result = Count(intArray);
        System.out.println("необходимо удалить элементов: "+result);

    }

    static int Count(int[] Arr)
    {
        int count = 0;
        int Max = Arr[0];
        for (int i = 1; i < Arr.length; i++)
        {
            if (Arr[i] <= Max)
                count++;
            else
                Max = Arr[i];
        }

        return count;
    }
}