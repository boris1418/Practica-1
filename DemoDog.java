package ru.mirea.ikbo0819.pr1.ex1;
import java.lang.*;

public class DemoDog
{
    public static void main(String[] args)
    {
        Dog c1 = new Dog(1,"Typhoon",6,2000,2010);
        Dog c2 = new Dog(2,"Space",3,2003);
        Dog c3 = new Dog(3,"Verona",8,2007,2018);
        Dog c4 = new Dog(4,"Tornado",10);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        c1.AgeHuman();
    }
}
