package by.bsuir.lab1.task4;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размерность массива: ");
        int N = in.nextInt();
        int intArray[] = new int[N];
        for (int i = 0; i < N; i++)
        {
            intArray[i] = random.nextInt(10);
            System.out.println("число: " + intArray[i]);
        }

        for (int i = 0; i < intArray.length; i++)
        {
            if (IsSimple(intArray[i]))
                System.out.println("Индекс простого числа: " + i);
        }
    }

    static boolean IsSimple(int Num)
    {
        if (Num < 2)
            return false;
        double j = Math.sqrt(Num);
        for (int i = 2; i <= j; i++)
        {
            if (Num % i == 0)
                return false;
        }
        return true;

    }
}
