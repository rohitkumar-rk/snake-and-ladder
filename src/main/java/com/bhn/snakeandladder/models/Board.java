package com.bhn.snakeandladder.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    public static final int BOARD_SIZE = 100;

    private List<Ladder> ladders;
    private List<Snake> snakes;
    private Map<Integer, Integer> playerPositionMap;

    public Board(List<Ladder> ladders, List<Snake> snakes) {
        this.ladders = ladders;
        this.snakes = snakes;
        playerPositionMap = new HashMap<>();
    }

    public static int getBoardSize() {
        return BOARD_SIZE;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public void setPlayerPositionMap(Map<Integer, Integer> playerPositionMap) {
        this.playerPositionMap = playerPositionMap;
    }

    public Map<Integer, Integer> getPlayerPositionMap() {
        return playerPositionMap;
    }

}
