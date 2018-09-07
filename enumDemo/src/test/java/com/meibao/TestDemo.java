package com.meibao;

import com.meibao.letcode.Soultion;
import org.junit.Test;

public class TestDemo {
    @Test
    public void test1(){
        Soultion soultion=new Soultion();
        int i = soultion.strStr("hello", "ll");
        System.out.println(i);
        int i1 = soultion.strStr("aaaaa", "bba");
        System.out.println(i1);

    }
    @Test
    public void test2(){
        int[] array=new int[4];
        array[0]=1;
        array[1]=3;
        array[2]=5;
        array[3]=6;
        Soultion soultion=new Soultion();
        int i = soultion.searchInsert(array, 2);
        System.out.println(i);
        int i1 = soultion.searchInsert(array, 7);
        System.out.println(i1);
    }

}
