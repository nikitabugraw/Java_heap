package chapter11;


import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> integerCollection = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        Integer[] moreints = {5, 6, 7, 8, 9, 10};
        integerCollection.addAll(Arrays.asList(moreints));
        Collections.addAll(integerCollection,11,12,13,14,15);
        Collections.addAll(integerCollection, moreints);
        List<Integer> integerList = Arrays.asList(16, 17, 18, 19, 20);


    }
}
