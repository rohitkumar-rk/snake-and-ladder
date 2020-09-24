package com.bhn.snakeandladder.services;

import com.bhn.snakeandladder.models.Board;
import com.bhn.snakeandladder.models.Player;

public interface PlayerService {

    /**
     * This method is used to move player on Snake and Ladder Board
     * after rolling the dice. Player moves from initial position to new position
     * @param player Current player that we need to move on board
     * @param diceValue value of dice for which we need to move player
     * @param board Snake and Ladder Board
     * @return void
     */
    public void movePlayer(Player player, int diceValue, Board board);

    /**
     * This method is used to check whether current player has won or not
     * i.e. whether current players has reached 100 or not.
     * @param currentPlayer A list of kingdoms with their respective messages
     * @param board Snake and Ladder Board
     * @return boolean
     */
    public boolean hasPlayerWon(Player currentPlayer, Board board);

    /**
     * Finds new position of the players when a player moves on board
     * It takes into consideration Snakes and Ladders present on board
     * and Finds a final position which we will get if players meets any
     * snake or ladder on board
     * @param newPosition new position  of current player
     * @param board Snake and Ladder Board
     * @return Final position of current player
     */
    public int getNewPosition(int newPosition, Board board);

}
