package ua.lviv.lgs.task3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        mostOftenWord(str);
    }

    public void countWords(String str) {
        String[] arr = str.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 3) {
                count++;
            }
        }
        System.out.println("There are : " + count + " words in sentences");
    }

    public static void mostOftenWord(String str) {
        int counter = 0;
        int largestNumber = 0;
        String mostOftenWord = " ";
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 3) {
                counter = 0;
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        counter++;
                    }
                }
                if (counter > largestNumber) {
                    mostOftenWord = words[i];
                    largestNumber = counter;
                }
            }
        }
        System.out.println(str);
        System.out.println("Most often word in text is: '" + mostOftenWord + "'. It meets " + largestNumber + " times.");
    }

}


