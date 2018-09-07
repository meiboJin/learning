package com.meibao.interfacedemo;

import com.meibao.interfacedemo.CarEnum;

public class EnumTest {
    static CarEnum mycar;
    public static void main(String args[])
    {
        System.out.println(mycar.BMW.getCarType());
        System.out.println(mycar.TOYOTA.getCarType());
        System.out.println(mycar.FIAT.getCarType());

    }
}