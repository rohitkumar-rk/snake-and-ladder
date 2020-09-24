package com.bhn.snakeandladder.services;

import com.bhn.snakeandladder.models.Board;
import com.bhn.snakeandladder.models.Ladder;
import com.bhn.snakeandladder.models.Player;
import com.bhn.snakeandladder.models.Snake;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class PlayerServiceTest extends TestCase {

    private PlayerService playerService = new PlayerServiceImpl();

    public void testMovePlayer() {

        List<Ladder> ladderList = new ArrayList<>();
        ladderList.add(new Ladder(5,50));
        ladderList.add(new Ladder(20,90));

        List<Snake> snakeList = new ArrayList<>();
        snakeList.add(new Snake(85,10));
        snakeList.add(new Snake(65,23));

        Board  board = new Board(ladderList, snakeList);

        Player player = new Player("Rohit" , 1);

        board.getPlayerPositionMap().put(1, 15);
        playerService.movePlayer(player, 5, board);;

        int pos = board.getPlayerPositionMap().get(1);
        assertEquals(pos, 90);

    }

    public void testHasPlayerWon() {
        Board board = new Board(null, null);
        Player player = new Player("Rohit", 1);
        board.getPlayerPositionMap().put(1, 100);
        assertTrue(playerService.hasPlayerWon(player, board));

        player = new Player("Mayank" , 2);
        board.getPlayerPositionMap().put(2, 50);
        assertFalse(playerService.hasPlayerWon(player, board));
    }

    public void testGetNewPosition() {

        List<Ladder> ladderList = new ArrayList<>();
        ladderList.add(new Ladder(5,50));
        ladderList.add(new Ladder(20,90));

        List<Snake> snakeList = new ArrayList<>();
        snakeList.add(new Snake(85,10));
        snakeList.add(new Snake(65,23));

        Board  board = new Board(ladderList, snakeList);

        assertEquals(playerService.getNewPosition(85, board), 10);
        assertEquals(playerService.getNewPosition(65, board), 23);
        assertEquals(playerService.getNewPosition(5, board), 50);
        assertEquals(playerService.getNewPosition(20, board), 90);

    }
}