package ru.mirea.ikbo0819.pr1.ex2;
import java.lang.*;

public class DemoBall
{
    public static void main(String[] args)
    {
        Ball c1 = new Ball("Rubber",5,40);
        Ball c2 = new Ball("Skin",10,30);
        Ball c3 = new Ball("Metal",10,20);
        c1.Situation();
        c2.Situation();
        c3.Situation();
    }
}
