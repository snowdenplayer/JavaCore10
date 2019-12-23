package ua.lviv.lgs.task2;

public class Application {
    public static void main(String[] args) {
        String str = "Abcd erty oikj";
        func(str);

    }
    public static void func(String str){
        char[]arr = str.toCharArray();
        char[]tab = {'a','e','i','o','u','y'};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j<tab.length;j++) {
                if (arr[i] == tab[j]){
                    arr[i]='-';
                }
            }
            System.out.print(arr[i] + " ");
        }


    }


}
