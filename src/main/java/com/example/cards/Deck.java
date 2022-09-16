package com.example.cards;

public interface Deck {
    void shuffle();
    void cut(int index);
    Card deal();
    Card turnOver();
    int search(Card card);
    void newOrder(Deck Cards);
    int size();

    default int newSize() throws OperatorNotSupportedException{
        throw new OperatorNotSupportedException();

    }


}
