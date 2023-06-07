/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    /**
 * CardTrick class
 * @author Tushar
 * Date: 5 June 2023
 */

import java.util.Random;

public class A1_Tushar_Piplani {
    private final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private final String[] cards = new String[7];

    public CardTrick() {
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int suit = random.nextInt(4);
            int cardNumber = random.nextInt(13) + 1;
            cards[i] = cardNumber + " of " + suits[suit];
        }
    }

    public void findCard(String card) {
        for (String c : cards) {
            if (c.equals(card)) {
                printInfo();
                return;
            }
        }
        System.out.println("Card not found");
    }

    public void printInfo() {
        System.out.println("Author: Tushar Piplani");
        System.out.println("Student ID: 991700790");
        
    }
}

