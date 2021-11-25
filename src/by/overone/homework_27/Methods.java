package by.overone.homework_27;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Methods {

    public StringBuilder frequentlyOccurringWord(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            stringBuilder.append(matcher.group());
            stringBuilder.append(" ");
        }
        String qqq = new String(stringBuilder);
        StringBuilder words = new StringBuilder(Objects.requireNonNull(Arrays.stream(qqq.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null)));
//        StringBuilder stringBuilder1 = new StringBuilder(words);
        return words;
//        System.out.println("Most popular word in the text is: " + words);
    }


    public StringBuilder rareWord(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            stringBuilder.append(matcher.group());
            stringBuilder.append(" ");
        }
        String qqq = new String(stringBuilder);
        StringBuilder words = new StringBuilder(Objects.requireNonNull(Arrays.stream(qqq.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null)));
//        StringBuilder stringBuilder1 = new StringBuilder(words);
        return words;
//        System.out.println("Most unpopular word in the text is: " + words);
    }


    public StringBuilder maxLengthWord(String str) {
        TreeSet<String> list = new TreeSet<>();
        String regex = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        String[] wordsArray = list.toArray(new String[list.size()]);
        String maxLength = "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The longest word in the text is: ");
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() > maxLength.length()) {
                maxLength = wordsArray[i];
            }
        }
        stringBuilder.append(maxLength);
        return stringBuilder;
    }


    public StringBuilder data(String str) {
        TreeSet<String> list = new TreeSet<>();
        String regex = "[\\d]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        String[] wordsArray = list.toArray(new String[list.size()]);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("All dates in the text without repetitions are: ");
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() > 3 && wordsArray[i].length() < 5) {
                stringBuilder.append(wordsArray[i]);
                stringBuilder.append(";");
            } else {
                continue;
            }
        }
        return stringBuilder;
    }
}