package by.overone.homework_24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true){
            System.out.println("Your date of birth");
            System.out.println("Enter month your of birth");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String mounth = scanner.nextLine();
                System.out.println("Enter number your of birth");

                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    Month.zodiacSign(mounth, number);
                }
            }
        }
    }
}
