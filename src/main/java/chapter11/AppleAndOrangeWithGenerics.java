package chapter11;

import java.util.*;
public class AppleAndOrangeWithGenerics {
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i< 3 ; i++)
            apples.add(new Apple());
            //apples.add(new Orange());//Compilation error
        for (Apple apple: apples)
            System.out.println(apple.id());
    }
}
