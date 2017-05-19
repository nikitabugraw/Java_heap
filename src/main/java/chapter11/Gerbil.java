package chapter11;


import java.util.ArrayList;

public class Gerbil {
    double gerbilNumber ;
    Gerbil(double gerbilNumber){
        this.gerbilNumber= gerbilNumber;
    }
    void hop(){
        System.out.print(gerbilNumber + " << ");
    }
    public static void main(String[] args){
        ArrayList<Gerbil> gerbilArrayList = new ArrayList<Gerbil>();
        for(int i=0;i<3;i++)
            gerbilArrayList.add(new Gerbil(Math.random()));
        for(Gerbil obj : gerbilArrayList)
            System.out.println(obj);
    }
}
