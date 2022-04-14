package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

//        int myIntValue = 5;
//        // this casts the double which is the original to a float. floats aren't
//        // recommended type to use doubles are
//        // you could use 5.25f instead making it easier to cast
//        float myFloatValue = (float) 5.25;
//        double myDoubleValue = 5.25d;

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.00/3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double poundToKG = 0.45359237;
        double numberConvert = 200d;
        double numberKG = poundToKG * numberConvert;
        System.out.println(numberConvert + " pounds converted to KG is " + numberKG +"KG");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);






    }
}
