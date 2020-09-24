package com.bhn.snakeandladder.services;

import com.bhn.snakeandladder.models.Board;
import com.bhn.snakeandladder.models.Ladder;
import com.bhn.snakeandladder.models.Player;
import com.bhn.snakeandladder.models.Snake;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class BoardServiceTest extends TestCase {

    public void testInitializeBoard() {

        List<Ladder> ladderList = new ArrayList<>();
        ladderList.add(new Ladder(5,50));
        ladderList.add(new Ladder(20,90));

        List<Snake> snakeList = new ArrayList<>();
        snakeList.add(new Snake(85,10));
        snakeList.add(new Snake(65,23));

        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Rohit", 1));
        playerList.add(new Player("Mayank", 2));

        BoardService boardService = new BoardService();

        Board board = boardService.initializeBoard(ladderList, snakeList, playerList);

        assertEquals(board.getPlayerPositionMap().size(), 2);
        assertEquals(board.getLadders().size(), 2);
        assertEquals(board.getSnakes().size(), 2);

        assertNotNull(board.getPlayerPositionMap().get(1));
        assertNotNull(board.getPlayerPositionMap().get(2));

        int pos = board.getPlayerPositionMap().get(1);
        assertEquals(pos, 0);

    }
}