package by.overone.homework_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Supplier<String> supplier = () ->{
            System.out.println("Enter string");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            a = new StringBuilder(a).reverse().toString();
            return a;
        };

        String rezult = supplier.string();
        System.out.println(rezult);
    }
}
