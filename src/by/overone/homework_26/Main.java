package by.overone.homework_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        System.out.println();

        Function many = q->{
            double coefficient = 2.45;
            String [] arr = q.split(" ");
            double z = Double.parseDouble(arr[0])/coefficient;
            return z;
        };

        System.out.println(many.convertion("155.0 USD"));

        System.out.println();

        Consumer<String> consumer = q->{
            double coefficient = 2.45;
            String [] arr = q.split(" ");
            double z = Double.parseDouble(arr[0])/coefficient;
            System.out.println(z);
        };

        consumer.conversion("396.0 USD");

        System.out.println();

        List<String> list = new ArrayList<>();

        list.add("ssss");
        list.add("aaaaaa");
        list.add("ccccc");
        list.add("eeeee");
        list.add("asdfg");
        list.add("a");
        list.add("aa");
        list.add("jhkykg");
        list.add("mbkk");
        list.add("aderaa");

        list.stream().filter(q->q.startsWith("aa")).map(q->q+", ").forEach(System.out::print);

        System.out.println();

        Tester tester1 = new Tester(1, "bbbbb");
        Tester tester2 = new Tester(2, "asdf");
        Tester tester3 = new Tester(3, "bb");
        Tester tester4 = new Tester(4, "babbb");
        Tester tester5 = new Tester(5, "bbbdfrb");
        Tester tester6 = new Tester(6, "bbbbb");

        List<Tester> list1 = new ArrayList<>();
        list1.add(tester1);
        list1.add(tester2);
        list1.add(tester3);
        list1.add(tester4);
        list1.add(tester5);
        list1.add(tester6);

        list1.stream().filter(q->q.getId()>3).forEach(q->System.out.println(q.getId()));
        System.out.println();
        list1.stream().filter(q->q.getName().startsWith("bb"))
                .forEach(q->System.out.println(q.getName()+"-"+q.getId()));
        System.out.println();
        list1.stream().forEach(q->System.out.println(q.getName()));
        list1.stream().filter(q->q.getId()>3)
                .filter(q->q.getName().startsWith("bb"))
                .forEach(q->System.out.println(q.getName()+"-"+q.getId()));
    }
}
