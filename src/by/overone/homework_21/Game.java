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

    static void initialization() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                FIELD[i][j] = EMPTY_FIELD;
            }
        }
    }

    static void print() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                System.out.print(FIELD[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static boolean isCellValid(int x, int y){
        if (x < 0 || y < 0 || x >= fieldSize || y >= fieldSize){
            System.out.println("You entered the wrong number");
            return false;
        }else if (! (FIELD[x][y] == EMPTY_FIELD)){
            System.out.println("This field is occupied");
            return false ;
        }
        return true;
    }


    static void movePlayer() {
        System.out.println("Enter the coordinates");
        int x, y;
        do {
            x = enter.nextInt() - 1;
            y = enter.nextInt() - 1;
        }while (! isCellValid(x, y));
        FIELD[x][y] = PLAYER;
    }

    static void moveComputer(){
        int x, y;
        do {
            x = random.nextInt(fieldSize);
            y = random.nextInt(fieldSize);
        }while (! isCellValid(x, y));
        FIELD[x][y] = COMPUTER;
    }

    static boolean isFreeSpace (){
        for (int i = 0; i<FIELD.length; i++){
            for (int j = 0; j<FIELD[i].length; j++){
                if (FIELD[i][j] == EMPTY_FIELD){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin(char a) {
        for (int i = 0; i < FIELD.length; i++) {
            int rezalt = 0;
            for (int j = 0; j < FIELD[i].length; j++) {
                if (FIELD[i][j] == a) {
                    rezalt++;
                }
                if (rezalt == FIELD.length) {
                    return true;
                }
            }
        }
        for (int i = 0; i < FIELD.length; i++) {
            int rezalt = 0;
            for (int j = 0; j < FIELD[i].length; j++) {
                if (FIELD[j][i] == a) {
                    rezalt++;
                }
                if (rezalt == FIELD.length) {
                    return true;
                }
            }
        }
        int first = 0;
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (j == i && FIELD[i][j] == a) {
                    first++;
                }
            }
        }
        if (first == FIELD.length) {
            return true;
        }
        int second = 0;
        for (int i = 0, j = FIELD.length - 1; i < FIELD.length && j >= 0; i++, j--) {
            if (FIELD[i][j] == a) {
                second++;
            }
        }
        if (second == FIELD.length) {
            return true;
        }
        return false;
    }
}
