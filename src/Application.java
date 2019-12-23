import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws MyExeption {
        Scanner in = new Scanner(System.in);
        String sb = in.nextLine();
        if (sb.length() != 5) {
            throw new MyExeption("Not consist of 5 latters");
        } else {
            char[] tab = sb.toLowerCase().toCharArray();
            char[] arr = sb.toLowerCase().toCharArray();
            for (int i = 0; i < arr.length/2; i++) {
                char tmp = arr[arr.length-1-i];
                arr[arr.length-1-i]=arr[i];
                arr[i]=tmp;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            int counter = 0;
            for (int i = 0; i < tab.length; i++) {
                if(tab[i]==arr[i]){
                    counter++;
                }

            }
            if(counter == 5){
                System.out.println("Palindrome");
            }else{
                throw new MyExeption("Not palindrome");
            }

        }


    }
}
