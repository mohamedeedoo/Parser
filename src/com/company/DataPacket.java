package com.company;
import java.util.*;

public class DataPacket {

    private int type; // Field to keep track of type
    private ArrayList<Integer> data; // Field to keep track of packet data

    // Construct a new data packet
    public DataPacket() {
        data = new ArrayList<Integer>();
    }

    // method to return packet type, either 1 or 2
    public int getPacketType() {
        return type;
    }

    // method to set packet type to either 1 or 2;
    public void setPacketType(int type) {
        this.type = type;
    }

    // Method to set the data of the packet
    public void setData(ArrayList<Integer> list) {
        data = list;
    }

    // method to get the data of the packet
    // returns ArrayList of Integers
    public ArrayList<Integer> getData() {
        return data;
    }

}
