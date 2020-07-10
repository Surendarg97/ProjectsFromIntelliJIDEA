package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(-1,2)+ " cm");

    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches)
    {
        if((feet>=0) && (inches>=0) && (inches<=12))

        { double sumOfInches= (feet*12)+inches;

            return calcFeetAndInchesToCentimeters(sumOfInches);
        }
        else
            return -1;

    }

        public static double calcFeetAndInchesToCentimeters(double secondInches)
        {
        if(secondInches>=0)
        {
            return secondInches*2.54;

        }
        else
            return -1;
        }
    }

