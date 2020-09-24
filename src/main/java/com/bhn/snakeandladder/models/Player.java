package com.bhn.snakeandladder.models;

public class Player {

    private String playerName;

    /*Player id is an integer value ranging from 1 to n
    *  where n is the no. of players */
    private int playerId;

    public Player(String playerName, int playerId) {
        this.playerName = playerName;
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

}
