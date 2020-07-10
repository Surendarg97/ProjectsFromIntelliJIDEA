package com.company;

public class Main {

    public static void main(String[] args) {
	float floatMinValue= Float.MIN_VALUE;
	float floatMaxValue= Float.MAX_VALUE;
        System.out.println("FloatMinValue = "+floatMinValue);
        System.out.println("FloatMaxValue = "+floatMaxValue);
        
        double doubleMinValue= Double.MIN_VALUE;
        double doubleMaxValue= Double.MAX_VALUE;
        System.out.println("DoubleMinValue = "+doubleMinValue);
        System.out.println("DoubleMaxValue = "+doubleMaxValue);

        float f=(float)5.24;

        double pounds=200;
        double kg=pounds*0.45359237;
        System.out.println(kg);

    }
}
