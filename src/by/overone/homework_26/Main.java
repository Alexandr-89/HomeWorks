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


        Predicate<String> dddd = q -> {
            String[] a = q.split(", ");
            Integer[] s = new Integer[a.length];
            for (int i = 0; i<a.length; i++){
                s[i] = Integer.parseInt(a[i]);
                if (s[i]>=0){
                    System.out.print(s[i]+",");
                }else {
                    continue;
                }
            }
            return false;
        };

        dddd.test("1, 8, -3, 4, -9, 0, 7");
    }
}
