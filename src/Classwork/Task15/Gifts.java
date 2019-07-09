package Classwork.Task15;

import java.util.ArrayList;

/**
 * Created by Ariec on 09.07.2019.
 */
public class Gifts<T extends Sweets>  {
    public Gifts(){

    }
    private ArrayList<T> glist = new ArrayList<T>();

    public Gifts(ArrayList<T> glist) {
        this.glist = glist;
    }

    public double getWeight(){
        double result = 0;
        for(T gift : glist){
            result+=gift.getWeight();
        }
        return result;
    }
    public void getDescription(){
        System.out.println("Dop:" + getWeight()+ " " + getCost()+ " " + this.toString());
    }
    public double getCost(){
        double res = 0;
        for(T gift : glist){
            res+=gift.getPrice();
        }
        return res;
    }

    public void put(T gift){
        glist.add(gift);
    }
    public void remove(T gift){
        glist.remove(gift);
    }



}
