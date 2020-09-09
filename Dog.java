package ru.mirea.ikbo0819.pr1.ex1;
import java.lang.*;

public class Dog
{
    private int Number;
    private String Name;
    private int Age;
    private int Birthday;
    private int Death;
    private int HumanOl;

    public Dog(int number, String name, int age, int birthday, int death)
    {
        Number = number;
        Name = name;
        Age = age;
        Birthday = birthday;
        Death = death;
    }

    public Dog(int number, String name, int age, int birtday)
    {
        Number = number;
        Name = name;
        Age = age;
        Birthday = birtday;
        Death = 0;
    }

    public Dog(int number, String name, int age)
    {
        Number = number;
        Name = name;
        Age = age;
        Birthday = 0;
        Death = 0;
    }

    public Dog(int number, String name)
    {
        Number = number;
        Name = name;
        Age = 0;
        Birthday = 0;
        Death = 0;
    }

    public Dog(int number)
    {
        Number = number;
        Name = "No data";
        Age = 0;
        Birthday = 0;
        Death = 0;
    }

    public int getHumber()
    {
        return Number;
    }

    public void setNumber(int number)
    {
        Number = number;
    }

    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        Name = name;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int age)
    {
        Age = age;
    }

    public int getBirthday()
    {
        return Birthday;
    }

    public void setBirthda(int birthday)
    {
        Birthday = birthday;
    }

    public int getDeath()
    {
        return Death;
    }

    public void setDeath(int death)
    {
        Death = death;
    }

    public void AgeHuman()
    {
        HumanOl = 7 * Age;
        System.out.println("Number " + Number + ", Human age " + HumanOl);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Number=" + Number +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Birthday=" + Birthday +
                ", Death=" + Death +
                ", HumanOl=" + HumanOl +
                '}';
    }



}
