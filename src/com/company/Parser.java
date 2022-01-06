package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Parser {
    private ArrayList<Integer> list;
    private int numTargets;
    private int numDataPoints;

    public Parser() {
        list = new ArrayList<>();

    }

    public ArrayList<Integer> addWord(int word) {
        if (list.size() == 1) {
            if (list.get(0) == 1) {
                System.out.println("Wheel data packet received");
            } else {
                System.out.println("Vision data packet received");
            }
        }
        if (list.size() == 2) {
            if (list.get(0) == 1) {
                numDataPoints = 3;
            } else {
                numTargets = list.get(1);
                numDataPoints = 2 * numTargets;
            }
        }

        list.add(word);

        if (list.size() == numDataPoints) {
            DataPacket packet = new DataPacket();
            packet.setPacketType(list.get(0));
            if (packet.getPacketType() == 1) {
                packet.setData( new ArrayList<>(list.subList(1, 3)));
                System.out.println("Wheel data packet completed, wheel data: " + Arrays.toString(packet.getData().toArray()));
            } else {
                packet.setData(new ArrayList<>(list.subList(2, list.size())));
                System.out.println("Vision data packet completed, vision data: " + Arrays.toString(packet.getData().toArray()));
            }
            list.clear();
            numTargets = 0;
            numDataPoints = 0;
            return packet.getData();
        }
        return null;
    }

}
