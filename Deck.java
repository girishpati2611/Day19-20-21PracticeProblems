package com.bridglabz.oops;

public class Deck {
    public static void main(String[] args) {
        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // initialize deck
        int n = SUITS.length * RANKS.length;
        String[] deck = new String[n];

        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print shuffled deck
        System.out.println("------------------------------");
        System.out.println("The cards of player one are :");
        System.out.println("------------------------------");
        for (int i = 0; i <= 8; i++) {
                System.out.println(deck[i]);
        }
        System.out.println("------------------------------");
        System.out.println("The cards of player two are :");
        System.out.println("------------------------------");
        for (int i = 9; i <= 17; i++) {
                System.out.println(deck[i]);
        }
        System.out.println("------------------------------");
        System.out.println("The cards of player three are :");
        System.out.println("------------------------------");
        for (int i = 18; i <= 26; i++) {
                System.out.println(deck[i]);
        }
        System.out.println("------------------------------");
        System.out.println("The cards of player four are :");
        System.out.println("------------------------------");
        for (int i = 27; i <= 35; i++) {
                System.out.println(deck[i]);
        }
    }
}