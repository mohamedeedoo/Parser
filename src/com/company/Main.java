package com.company;

public class Main {

    // Main Method
    public static void main(String[] args) {
        Parser parser = new Parser(); // Create new Parser object

        // pass words (or ints) into the parser
        parser.addWord(1);
        parser.addWord(2);
        parser.addWord(3);
        parser.addWord(1);
        parser.addWord(4);
        parser.addWord(23);
        parser.addWord(2);
        parser.addWord(3);
        parser.addWord(27);
        parser.addWord(25);
        parser.addWord(32);
        parser.addWord(27);
        parser.addWord(25);
        parser.addWord(32);
    }
}
