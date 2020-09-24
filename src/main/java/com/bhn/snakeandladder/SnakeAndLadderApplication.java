package com.bhn.snakeandladder;

import com.bhn.snakeandladder.models.*;
import com.bhn.snakeandladder.services.BoardService;
import com.bhn.snakeandladder.services.GameService;
import com.bhn.snakeandladder.utils.InputUtils;

import java.util.List;

public class SnakeAndLadderApplication {

    private static InputUtils inputUtils = new InputUtils();
    private static BoardService boardService = new BoardService();
    private static GameService gameService = new GameService();

    public static void main(String[] args) {

//      Take input of snakes, ladders and players
        List<Snake> snakeList = inputUtils.inputSnakes();
        List<Ladder> ladderList = inputUtils.inputLadders();
        List<Player> playerList = inputUtils.inputPlayers();

        //Initialize snake and ladder board
        Board board = boardService.initializeBoard(ladderList, snakeList, playerList);
        gameService.initializeGame(playerList, board);

        //Start game
        gameService.startGame();

    }

}
