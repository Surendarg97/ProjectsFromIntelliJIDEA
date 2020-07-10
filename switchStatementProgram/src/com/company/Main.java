package com.company;

public class Main {

    public static void main(String[] args) {

        char forSwithCase='d';

	switch (forSwithCase)
    {
        case 'A':
            System.out.println("Value is A");
            break;
        case 'B':
            System.out.println("Value is B");
            break;
        case 'C':case 'd':
            System.out.println("Value is C");
            break;
        default:
            System.out.println("Value is not the above");
            break;

    }
    }
}
