package com.company;

import java.util.*;

public class VisionDataPacket {
    private static final int TYPE = 2;
    private ArrayList data;
    private int numTargets;

    public VisionDataPacket() {
        data = new ArrayList<Integer>();
        numTargets = 0;
    }

    public int getPacketType() {
        return TYPE;
    }

    public void setData(ArrayList<Integer> list) {
        data = list;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public int getNumTargets() {
        return numTargets;
    }

    public void setNumTargets(int numTargets) {
        this.numTargets = numTargets;
    }
}
