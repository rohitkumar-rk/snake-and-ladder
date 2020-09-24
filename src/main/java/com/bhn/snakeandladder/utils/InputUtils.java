package com.bhn.snakeandladder.utils;

import com.bhn.snakeandladder.models.Ladder;
import com.bhn.snakeandladder.models.Player;
import com.bhn.snakeandladder.models.Snake;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InputUtils {

    private Scanner scanner = new Scanner(System.in);

    private int noOfSnakes;
    private int noOfLadders;
    private int noOfPlayers;

    /**
     * Takes input snakes through console
     * @return List<Snake>  returns a list of snakes
     */
    public List<Snake> inputSnakes(){
        System.out.print("Enter no. of snakes : ");
        noOfSnakes = scanner.nextInt();
        List<Snake> snakeList = new ArrayList<>();

        System.out.println("Enter head and tail position of each snake");

        for(int index = 0; index < noOfSnakes; index++){
            int head = scanner.nextInt();
            int tail = scanner.nextInt();

            Snake snake = new Snake(head, tail);
            snakeList.add(snake);
        }

        return snakeList;
    }

    /**
     * Takes input ladders through console
     * @return List<Ladder> returns a list of ladders
     */
    public List<Ladder> inputLadders(){
        System.out.print("Enter no. of Ladders : ");
        noOfLadders = scanner.nextInt();

        List<Ladder> ladderList = new ArrayList<>();

        System.out.println("Enter start and end position of each ladder");

        for(int index = 0; index < noOfLadders; index++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            Ladder ladder = new Ladder(start, end);
            ladderList.add(ladder);
        }

        return ladderList;
    }

    /**
     * Takes input players through console
     * @return List<Players> returns a list of players
     */
    public List<Player> inputPlayers() {
        System.out.print("Enter no. of players : ");
        noOfPlayers = scanner.nextInt();

        List<Player> playerList = new ArrayList<>();

        System.out.println("Enter name of each player ");

        for(int index = 1; index <= noOfPlayers; index++) {
            String playerName = scanner.next();

            Player player = new Player(playerName, index);
            playerList.add(player);
        }

        return playerList;
    }

}
