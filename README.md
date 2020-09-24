# Snake and Ladder

## Problem Overview

Create a Snake and Ladder  Application

## Requirements

jdk 11 <br>
gradle 5.1 and above

## Input Format

The application should take input of following things :

1. No. of ladders and start and end of each ladder
2. No. of snakes and head and tails of each snake
3. No. of players and Name of each player

## Output Format

The application must print each movement of each player in following format 

<Plaer-Name> rolled a dice and got <Number on dice>  and move from <initial position> to <new positin>

Print winner at the end

## Sample Input 

```
Enter no. of snakes : 3
Enter head and tail position of each snake
88 16
93 20
95 53
Enter no. of Ladders : 4
Enter start and end position of each ladder
3 95
27 100
51 75
61 79
Enter no. of players : 2
Enter name of each player 
Rohit
Mayank
```

## Sample Output 

```
Rohit rolled a dice and got 4 and move from 0 to 4
Mayank rolled a dice and got 1 and move from 0 to 1
Rohit rolled a dice and got 6 and move from 4 to 10
Mayank rolled a dice and got 2 and move from 1 to 53
Rohit rolled a dice and got 3 and move from 10 to 13
Mayank rolled a dice and got 2 and move from 53 to 55
Rohit rolled a dice and got 6 and move from 13 to 19
Mayank rolled a dice and got 4 and move from 55 to 59
Rohit rolled a dice and got 5 and move from 19 to 24
Mayank rolled a dice and got 4 and move from 59 to 63
Rohit rolled a dice and got 6 and move from 24 to 30
Mayank rolled a dice and got 6 and move from 63 to 69
Rohit rolled a dice and got 2 and move from 30 to 32
Mayank rolled a dice and got 5 and move from 69 to 74
Rohit rolled a dice and got 5 and move from 32 to 37
Mayank rolled a dice and got 5 and move from 74 to 79
Rohit rolled a dice and got 4 and move from 37 to 41
Mayank rolled a dice and got 2 and move from 79 to 81
Rohit rolled a dice and got 3 and move from 41 to 44
Mayank rolled a dice and got 4 and move from 81 to 85
Rohit rolled a dice and got 3 and move from 44 to 47
Mayank rolled a dice and got 3 and move from 85 to 16
Rohit rolled a dice and got 2 and move from 47 to 49
Mayank rolled a dice and got 1 and move from 16 to 17
Rohit rolled a dice and got 1 and move from 49 to 50
Mayank rolled a dice and got 1 and move from 17 to 18
Rohit rolled a dice and got 2 and move from 50 to 52
Mayank rolled a dice and got 3 and move from 18 to 21
Rohit rolled a dice and got 1 and move from 52 to 53
Mayank rolled a dice and got 3 and move from 21 to 24
Rohit rolled a dice and got 6 and move from 53 to 59
Mayank rolled a dice and got 6 and move from 24 to 30
Rohit rolled a dice and got 3 and move from 59 to 62
Mayank rolled a dice and got 1 and move from 30 to 31
Rohit rolled a dice and got 1 and move from 62 to 63
Mayank rolled a dice and got 2 and move from 31 to 33
Rohit rolled a dice and got 2 and move from 63 to 65
Mayank rolled a dice and got 6 and move from 33 to 39
Rohit rolled a dice and got 4 and move from 65 to 69
Mayank rolled a dice and got 1 and move from 39 to 40
Rohit rolled a dice and got 3 and move from 69 to 72
Mayank rolled a dice and got 1 and move from 40 to 41
Rohit rolled a dice and got 1 and move from 72 to 73
Mayank rolled a dice and got 3 and move from 41 to 44
Rohit rolled a dice and got 1 and move from 73 to 74
Mayank rolled a dice and got 1 and move from 44 to 45
Rohit rolled a dice and got 1 and move from 74 to 75
Mayank rolled a dice and got 6 and move from 45 to 75
Rohit rolled a dice and got 6 and move from 75 to 81
Mayank rolled a dice and got 3 and move from 75 to 78
Rohit rolled a dice and got 5 and move from 81 to 86
Mayank rolled a dice and got 2 and move from 78 to 80
Rohit rolled a dice and got 1 and move from 86 to 87
Mayank rolled a dice and got 1 and move from 80 to 81
Rohit rolled a dice and got 5 and move from 87 to 92
Mayank rolled a dice and got 5 and move from 81 to 86
Rohit rolled a dice and got 3 and move from 92 to 53
Mayank rolled a dice and got 4 and move from 86 to 90
Rohit rolled a dice and got 2 and move from 53 to 55
Mayank rolled a dice and got 1 and move from 90 to 91
Rohit rolled a dice and got 6 and move from 55 to 79
Mayank rolled a dice and got 1 and move from 91 to 92
Rohit rolled a dice and got 6 and move from 79 to 85
Mayank rolled a dice and got 5 and move from 92 to 97
Rohit rolled a dice and got 1 and move from 85 to 86
Rohit rolled a dice and got 1 and move from 86 to 87
Rohit rolled a dice and got 4 and move from 87 to 91
Rohit rolled a dice and got 6 and move from 91 to 97
Mayank rolled a dice and got 2 and move from 97 to 99
Rohit rolled a dice and got 2 and move from 97 to 99
Mayank rolled a dice and got 1 and move from 99 to 100
Mayank has won the game.
```


## Compilation and Execution

```
Compilation : gradlew clean build
Execution : java -jar <path_to/bhn.jar 
```

