package com.meibao.ListPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list=new ArrayList();

        for(int i=0;i<10;i++){
            list.add(i);
        }

        for (Object o : list) {
            System.out.println(o);
        }

        list.add(2,25);

        for (Object o : list) {
            System.out.println(o);
        }

    }

}
