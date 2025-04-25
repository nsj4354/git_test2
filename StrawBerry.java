package com.example;

public class StrawBerry {
    private String color;
    private String price;


    public void Disp(){
        System.out.println("분류" + color);
        System.out.println("계절" + price);
    }

    public void Set1(String a, String b)
    {
        color = a;
        price = b;
    }


}
