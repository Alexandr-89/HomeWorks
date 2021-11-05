package by.overone.homework_21;

import java.util.Random;
import java.util.Scanner;

public class Game {

    static int fieldSize = 3;
    static final char PLAYER = '0';
    static final char COMPUTER = 'X';
    static final char EMPTY_FIELD = '!';
    static Scanner enter = new Scanner(System.in);
    static Random random = new Random();
    static final char[][] FIELD = new char[fieldSize][fieldSize];
}
