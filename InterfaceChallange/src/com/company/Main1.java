package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    public static void main1(String[] args) {

        ISavable newPlayer=new Player("surendar",10,25);
        System.out.println(newPlayer.toString());
        saveObject(newPlayer);
       // newPlayer.setHitPoints(123);
        System.out.println(newPlayer);
        //loadObject(newPlayer);
        System.out.println(newPlayer);

        ISavable newPlayer2=new Monster("second name",14,36);
        saveObject(newPlayer2);
        ((Monster)  newPlayer2).getName();
        System.out.println(newPlayer2.toString());



    }

    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(ISavable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values=readValues();
        objectToLoad.read(values);
    }
}
