package com.company;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        parser.addWord(1);
        parser.addWord(2);
        parser.addWord(3);
        parser.addWord(2);
        parser.addWord(3);
        parser.addWord(23);
        parser.addWord(23);
        parser.addWord(25);
        parser.addWord(27);
        parser.addWord(25);
    }
}
