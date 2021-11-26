package by.overone.homework_26;

import java.util.Arrays;
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

        System.out.println();

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

        System.out.println();

        BinaryOperator<String> binaryOperator = (q1, q2) -> {
            String[] a = q1.split("");
            String[] b = q2.split("");
            String[] c = new String[a.length];
            for (int i =0; i<c.length; i++){
                c[i] = a[i]+"-"+b[i];
            }
            String z = Arrays.toString(c);
            System.out.println(z);
            return z;
        };

        binaryOperator.aaaa("123456", "123456");

        System.out.println();

        UnaryOperator<String> unaryOperator = q -> {
            String[] arr = q.split(", ");
            Integer[] arr1 = new Integer[arr.length];
            for (int i =0; i<arr.length; i++){
                arr1[i] = Integer.parseInt(arr[i]);
                arr1[i] = arr1[i]*arr1[i];
            }
            String sss = Arrays.toString(arr1);
            System.out.println(sss);
            return sss;
        };

        unaryOperator.aaaaaaa("2, 3, 4, 5, 6");
    }
}
