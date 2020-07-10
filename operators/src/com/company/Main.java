package com.company;

public class Main {

    public static void main(String[] args) {
	double a=20.00;
        double b=80.00;
        double c=(100.00*(a+b))%40.00;
        System.out.println("Value of c is "+c);
        boolean isReminderZero=c==0?true:false;
        System.out.println("Boolean result ="+isReminderZero);
        if(!isReminderZero)
        {
            System.out.println("Got some reminder");
        }
    }
}
