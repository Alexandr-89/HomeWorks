package by.overone.homework_21;

public class Main {

    public static void main(String[] args) {

        Game.initialization();
        Game.print();

        while (true){


            Game.movePlayer();
            Game.print();
            if (Game.checkWin(Game.PLAYER)){
                System.out.println("You have won");
                break;
            }
            if (Game.isFreeSpace()){
                System.out.println("Draw");
                break;
            }
            Game.moveComputer();
            System.out.println();
            Game.print();
            if (Game.checkWin(Game.COMPUTER)){
                System.out.println("Computer have won");
                break;
            }
            if (Game.isFreeSpace()){
                System.out.println("Draw");
                break;
            }
        }

    }
}
