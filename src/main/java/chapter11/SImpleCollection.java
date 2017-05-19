package chapter11;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class SImpleCollection {
    public static void main(String[] args){
        Collection<Integer> integers = new HashSet<Integer>();
        for (int i =0; i<= 10; i++)
            integers.add(i);
        for (Integer integer: integers)
            System.out.println(integer);
    }
}
