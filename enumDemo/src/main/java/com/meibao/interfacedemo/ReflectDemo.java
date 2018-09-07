package com.meibao.interfacedemo;

import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectDemo {
    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        try {
            Class c1 = Class.forName(name);
            Class superc1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());//将修饰符打印出来
            if(modifiers.length()>0)
                System.out.print(modifiers);
            System.out.print(" class "+name);
            if(superc1 != null && superc1 != Object.class)
                System.out.print(" extends "+ superc1.getName());
            System.out.print("\n{\n");
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
