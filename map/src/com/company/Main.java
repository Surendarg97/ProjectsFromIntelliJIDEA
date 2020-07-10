package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locations= new HashMap<Integer,Location>();

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        locations.put(0, new Location(0,"you are sitting in front of java learning"));
        locations.put(1, new Location(1,"you are standing infront of the building"));
        locations.put(2, new Location(2,"you are at top of the hill"));
        locations.put(3, new Location(3,"you are inside the building"));
        locations.put(4, new Location(4,"you are in the forest"));
        locations.put(5, new Location(5,"you are in the deadend"));

        locations.get(1).addExist("W",2);
        locations.get(1).addExist("E",3);
        locations.get(1).addExist("S",4);
        locations.get(1).addExist("N",5);

        locations.get(2).addExist("N",5);

        locations.get(3).addExist("W",1);

        locations.get(4).addExist("N",1);
        locations.get(4).addExist("W",2);

        locations.get(5).addExist("S",1);
        locations.get(5).addExist("W",2);



        int loc=1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String,Integer> exit= locations.get(loc).getExists();
            System.out.print("Available exits are");
            for (String exits:exit.keySet()) {

                System.out.print(exits+ ":");
            }
            System.out.println();

            String directions= scanner.nextLine().toUpperCase();
            if (!(exit.containsKey(directions))) {
                loc =exit.get(directions);
            }else
            {System.out.println("you cannot go in that direction");}
        }
    }
}
