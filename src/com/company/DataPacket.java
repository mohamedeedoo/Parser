package com.company;
import java.util.*;

public class DataPacket {
    private int type;
    private ArrayList<Integer> data;

    public DataPacket() {
        data = new ArrayList<Integer>();
    }

    public int getPacketType() {
        return type;
    }

    public void setPacketType(int type) {
        this.type = type;
    }


    public void setData(ArrayList<Integer> list) {
        data = list;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

}
