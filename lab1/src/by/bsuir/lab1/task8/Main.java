package by.bsuir.lab1.task8;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        //System.out.print("Введите размерность массива a: ");
        //int N = in.nextInt();
        //System.out.print("Введите размерность массива b: ");
        //int M = in.nextInt();
        //int[] A = new int[N];
        //int[] B = new int[M];
        int[] A1 = new int[]{1, 2, 2, 3, 8, 9};
        int[] B1 = new int[]{0, 1, 2, 10, 10, 11};

        Position(A1, B1);

    }

    static void Position(int[] Arr1, int[] Arr2)
    {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Arr1.length; i++) {
            int dex = Arrays.binarySearch(Arr1, Arr2[i]);
            if (dex < 0) result.add(-(dex) - 1 + i);
            else result.add(dex + i);
        }

        for (int i = 0; i < result.size(); i++)
        {
            System.out.print(" Индекс: " + result.get(i));
        }
    }
}
