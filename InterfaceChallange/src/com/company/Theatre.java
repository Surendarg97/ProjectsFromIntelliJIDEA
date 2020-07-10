package com.company;

import java.util.ArrayList;

public class Theatre {

    private final String theatreName;

    private List<Seat> seats=new ArrayList<Seat>();

    public Theatre(String theatreName,int numberOfRows,int seatsPerRow){


        this.theatreName=theatreName;

        int lastRow = 'A'+(numberOfRows-1);

        for(char row= 'A';row<=lastRow;row++){
            for(int seatNum=1;seatNum<=seatsPerRow;seatNum++){
                Seat seat=new Seat(row+String.format("%02d",seatNum));
                seats.add(seat);
            }

        }

    }

    public String getTheatreName() {
        return theatreName;
    }
}
