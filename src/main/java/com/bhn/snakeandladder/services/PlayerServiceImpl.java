package com.bhn.snakeandladder.services;

import com.bhn.snakeandladder.models.*;

public class PlayerServiceImpl implements  PlayerService {

    @Override
    public void movePlayer(Player player, int diceValue, Board board) {

        //Get initial position of current player from hashmap
        int initialPosition = board.getPlayerPositionMap().get(player.getPlayerId());
        int newPosition = initialPosition + diceValue;

        //Find new position after passing through snakes and ladders
        //present on board
        newPosition = getNewPosition( newPosition, board);

        //If new positon exceeds board size, current player will not move
        if(newPosition > board.getBoardSize())
            return;

        //otherwise update position of current players
        board.getPlayerPositionMap().put(player.getPlayerId(), newPosition);

        System.out.println(player.getPlayerName() + " rolled a dice and got " + diceValue +
                " and move from " + initialPosition + " to " + newPosition);

    }

    @Override
    public boolean hasPlayerWon(Player currentPlayer, Board board) {
        int playerPosition = board.getPlayerPositionMap().get(currentPlayer.getPlayerId());
        if(playerPosition == 100)
            return true;
        return false;
    }

    public int getNewPosition(int newPosition, Board board) {
        int previousPosition;

        do {
            previousPosition = newPosition;

            //Check if new position has any snakes
            for (Snake snake : board.getSnakes()) {
                if (snake.getStart() == newPosition) {
                    //If piece moves to a position with head of snake,
                    //it must gu down to position of tail of snake
                    newPosition = snake.getEnd();
                }
            }

            //Check if new position has any ladders
            for (Ladder ladder : board.getLadders()) {
                if (ladder.getStart() == newPosition) {
                    //If piece moves to a position of start of ladder,
                    //It must move to end of that ladder
                    newPosition = ladder.getEnd();
                }
            }
        } while (newPosition != previousPosition);
        // There could be another snake/ladder at the tail of the snake
        // or the end position of the ladder and the piece should go up/down accordingly.
        return newPosition;
    }



}
