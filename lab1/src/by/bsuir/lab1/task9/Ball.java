package by.bsuir.lab1.task9;

public class Ball {
    private double Weight;
    private String Color;

    public Ball(double Weight, String Color)
    {
        this.Weight = Weight;
        this.Color = Color;
    }
    public void setWeight(double Weight)
    {
        this.Weight = Weight;
    }
    public void setColor(String Color)
    {
        this.Color = Color;
    }
    public double getWeight()
    {
        return Weight;
    }

    public String Color()
    {
        return Color;
    }
}
