package com.company;

public class Main {

    public static void main(String[] args) {

        //Integer min and max value
	int minValue = Integer.MIN_VALUE;
	int maxValue = Integer.MAX_VALUE;

        System.out.println("Integer min value"+minValue +"Integer maxvalue" +maxValue);
        System.out.println("Integer min value"+(minValue-1) +"Integer maxvalue" +(maxValue+1));

        //Byte min and max value
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;

        System.out.println("Byte min value"+byteMinValue +"Byte maxvalue" +byteMaxValue);
        System.out.println("Byte min value"+(byteMinValue-1) +"Byte maxvalue" +(byteMaxValue+1));



        byte byteVar = 100;
        short shortVar = 25000;
        int intVar = 95000;
        long longVar = 50000L + 10L * (byteVar+shortVar+intVar);
        short shortTotal=(short)(50 + 10 * (byteVar+shortVar+intVar));
        System.out.println();

    }
}
