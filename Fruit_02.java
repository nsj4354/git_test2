package com.example;

public class Fruit_02 extends Fruit_01{
    private String name;
    private String size;


    public void Disp(){
        System.out.println("분류" + name);
        System.out.println("계절" + size);
    }

    public void Set1(String a, String b)
    {
        name =a;
        size = b;
    }


}
