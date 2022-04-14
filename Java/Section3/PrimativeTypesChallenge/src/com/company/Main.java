package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte anyByteValue = (byte) 10;

        short anyShortValue = (short) 20;

        int anyIntValue = 50;

        long anyLongValue = 50000L + (10L * (anyByteValue + anyShortValue + anyIntValue));
        System.out.println(anyLongValue);

        short shortTotal = (short) (1000 + 10 *
                (anyByteValue + anyShortValue + anyIntValue));
        System.out.println(shortTotal);
    }
}
