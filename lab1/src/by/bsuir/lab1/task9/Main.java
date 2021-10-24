package by.bsuir.lab1.task9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ball ball = new Ball(500,"Red");
        Ball ball1 = new Ball(100,"Blue");
        Ball ball2 = new Ball(200,"Blue");
        Ball ball3 = new Ball(300,"Green");

        Basket basket = new Basket();
        basket.AddBall(ball);
        basket.AddBall(ball1);
        basket.AddBall(ball2);
        basket.AddBall(ball3);

        System.out.println("Количество синих мячей: " + basket.BlueCount() + " " + "Суммарный вес: " + basket.SumWeight());

    }
}
