package com.example.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandardDeck implements Deck {

    List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {

        List<Card> newDeck = new ArrayList<>();

        Arrays.stream(Suit.values())
        .forEach(suit -> {

    Arrays.stream(FaceValue.values())
            .map(faceValue -> new Card(suit, faceValue))
            .foreach(newDeck::add);

        });


        return newDeck;
    }

    @Override
    public void shuffle() {

    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public Card turnOver() {
        return null;
    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public void newOrder(Deck Cards) {

    }

    @Override
    public int size() {
        return 0;
    }
}
