package chapter11;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ClassGeneration {
    private int x =0;
    private ArrayList<String> favouriteMovieCharacter = new ArrayList<String>(Arrays.asList("Wheezy", "Stretch", "Sid"));
    private ClassGeneration(){}

    private String next(){
        if (x != favouriteMovieCharacter.size()){
            return favouriteMovieCharacter.get(x++);
        } else {
            x=0;
            return favouriteMovieCharacter.get(x);
        }

    }


    public static void main(String[] args){
        ClassGeneration classGeneration = new ClassGeneration();
        System.out.println(classGeneration.next());
        System.out.println(classGeneration.next());
        System.out.println(classGeneration.next());
        System.out.println(classGeneration.next());
        System.out.println(classGeneration.next());
        System.out.println(classGeneration.next());
        System.out.println(classGeneration.next());
    }
}
