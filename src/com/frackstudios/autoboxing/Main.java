package com.frackstudios.autoboxing;

import java.util.ArrayList;

/**
 * Created by crypticdev on 2/13/16.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//        for (int i=0; i<=10; i++){
//            integerArrayList.add(Integer.valueOf(i));
//        }
//
//        for (int i=0; i<=10; i++){
//            System.out.println(i + " ---> " + integerArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }

    }
}
