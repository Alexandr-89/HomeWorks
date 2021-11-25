package by.overone.homework_27;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        Methods methods = new Methods();

        FileReader reader = new FileReader("D://0000.txt");
        StringBuilder builder = new StringBuilder();
        int w;
        while ((w = reader.read()) != -1) {
            builder.append((char) w);
        }
        String x = builder.toString();
        reader.close();

        System.out.println(x);


        StringBuilder a = new StringBuilder();

       a.append(methods.frequentlyOccurringWord(x));
       a.append('\n');
       a.append(methods.rareWord(x));
       a.append('\n');
       a.append(methods.maxLengthWord(x));
       a.append('\n');
       a.append(methods.data(x));

        System.out.println(a);



        FileWriter writer = new FileWriter("D://3333.txt", false);
        StringBuilder text = new StringBuilder(a);
        writer.write(String.valueOf(text));
        writer.close();



        FileInputStream fileInputStream = new FileInputStream("D://1111.txt");
        int i;
        StringBuilder result = new StringBuilder();
        while ((i = fileInputStream.read()) != -1) {
            result.append((char) i);
        }
        String s = new String(result);
        fileInputStream.close();
        System.out.println(result);


        StringBuilder b = new StringBuilder();

        b.append(methods.frequentlyOccurringWord(s));
        b.append('\n');
        b.append(methods.rareWord(s));
        b.append('\n');
        b.append(methods.maxLengthWord(s));
        b.append('\n');
        b.append(methods.data(s));


        System.out.println(b);


        FileOutputStream fileOutputStream = new FileOutputStream("D://4444.txt");
        StringBuilder text1 = new StringBuilder(b);
        String text2 = new String(text1);
        byte[] bytes = text2.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();

    }
}
