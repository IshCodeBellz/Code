package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myVariable = 50; // whole line is a statement, myVariable = 50 is the expression
        if (myVariable == 50){
            System.out.println("Printed");
        }
        myVariable++;// whole line is a statement
        myVariable--;// whole line is a statement

        System.out.println("This is a test"); // whole line is a statement

        System.out.println("This is" +
                " another" +
                " still more");// still a statement

        int anotherVariable = 50;myVariable--;
        System.out.println("This is another one");

    }
}
