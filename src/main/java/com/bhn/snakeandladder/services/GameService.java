package com.bhn.snakeandladder.services;

import com.bhn.snakeandladder.models.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GameService {

    private Queue<Player> players;
    private Board board;
    boolean isGameCompleted;
    private DiceService diceService;
    private PlayerService playerService;

    /**
     * It simply creates objects of all the required services
     * and variables mentioned above that will be used by startGame() method
     * @param playerList A list of players that we need to put in queue
     * @param board
     * @return void
     */
    public void initializeGame(List<Player> playerList, Board board) {
        players = new LinkedList<>(playerList);
        this.board = board;
        this.isGameCompleted = false;
        diceService = new DiceService();
        playerService = new PlayerServiceImpl();
    }

    /**
     * This is the core part of program
     * This method starts game and continues it untill
     * a player has won the game
     * @return void
     */
    public void startGame() {

        while (!isGameCompleted){

            //Remove a player from queue
            Player currentPlayer = players.poll();
            int diceValue = diceService.rollDice();

            //Move current players on board
            playerService.movePlayer(currentPlayer, diceValue, board);

            //If current players has won the game, print result
            if(playerService.hasPlayerWon(currentPlayer, board)) {
                System.out.println(currentPlayer.getPlayerName() + " has won the game.");
                isGameCompleted = true;
            }

            //else just add current player to the queue
            else {
                players.add(currentPlayer);
            }

        }

    }


}
