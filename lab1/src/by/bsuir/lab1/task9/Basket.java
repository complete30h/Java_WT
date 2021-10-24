package by.bsuir.lab1.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Ball> Balls = new ArrayList<>();

    public void AddBall(Ball ball)
    {
        Balls.add(ball);
    }

    public double SumWeight()
    {
        double Weight = 0;
        for (int i = 0; i < Balls.size(); i++)
        {
            Weight += Balls.get(i).getWeight();
        }
        return Weight;
    }

    public int BlueCount()
    {
        int Count = 0;
        for (int i = 0; i < Balls.size(); i++)
        {
            if (Balls.get(i).Color() == "Blue")
            {
                Count++;
            }
        }
        return Count;
    }

}
