package com.zht.java;

import com.sun.javaws.Main;
import sun.misc.PostVMInitHook;

import java.util.Arrays;
import java.util.List;

public class helloworld {
    public static void main(String[] args){
        System.out.println("hello world!");
        //模板
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println();
        System.out.println("helloworld.main");
        int num=20;
        System.out.println("num = " + num);
        System.out.println("args = " + args);
        for (int i = 0; i <10 ; i++) {

        }
        for (String arg : args) {

        }



    }
}
