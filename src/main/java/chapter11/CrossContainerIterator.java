package chapter11;

import java.util.Iterator;

public class CrossContainerIterator {

    public static void display(Iterator<Gerbil> iterator){
        while (iterator.hasNext()){
            Gerbil g = iterator.next();
        }
    }
}
