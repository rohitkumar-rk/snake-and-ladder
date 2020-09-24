package com.bhn.snakeandladder.services;

import com.bhn.snakeandladder.models.Board;
import com.bhn.snakeandladder.models.Ladder;
import com.bhn.snakeandladder.models.Player;
import com.bhn.snakeandladder.models.Snake;

import java.util.List;

public class BoardService {

    private  Board board;

    /**
     * This method is used to initialize SnakeAndLadder Board
     * It puts snakes and ladders on board and initializes hashmap to store
     * positions of all players
     * @param ladderList List of ladders
     * @param snakeList List of snakes
     * @param playerList List of players
     * @return Board return board after initializing
     */
    public Board initializeBoard(List<Ladder> ladderList, List<Snake> snakeList,
                                 List<Player> playerList) {

        board = new Board(ladderList, snakeList);

        //Initially put all players at position
        for(Player player : playerList){
            board.getPlayerPositionMap().put(player.getPlayerId(), 0);
        }

        return board;
    }

}
