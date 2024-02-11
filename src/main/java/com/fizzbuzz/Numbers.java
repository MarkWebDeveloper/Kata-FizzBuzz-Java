package com.fizzbuzz;

import java.util.ArrayList;

public class Numbers {
    ArrayList<Integer> numbersArray = new ArrayList<>();

    public Numbers() {
    }

    public Numbers(int numbersCount) {
        for (int index = 0; index < numbersCount; index++) {
            this.numbersArray.add(index + 1);
        }
    }
}
