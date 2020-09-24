package com.bhn.snakeandladder.services;

import junit.framework.TestCase;

public class DiceServiceTest extends TestCase {

    public void testRollDice() {
        DiceService diceService = new DiceService();

        for(int index = 0; index <= 10; index++){
            int random = diceService.rollDice();
            assertTrue(random >= 1 && random <= 6);
        }

    }
}