package com.bhn.snakeandladder.services;

import java.util.Random;

public class DiceService {

    /**
     * Rolls a dice and returns a random value from 1 to 6
     * @return int
     */
    public int rollDice() {
        return new Random().nextInt(6) + 1;
    }

}
