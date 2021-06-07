package com.task;

import java.util.Comparator;

public class SortCard implements Comparator<Poker> {
    @Override
    public int compare(Poker o1, Poker o2) {
        return o1.weight-o2.weight;
    }
}
