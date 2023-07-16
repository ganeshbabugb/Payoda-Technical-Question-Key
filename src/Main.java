import Program3.CardGame;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //Program One!
        int[] arr = {2, 3, 5, 7, 1};
        int sum = 0;
        for (int a : arr) {
            sum += a;
            System.out.println(sum);
        }

        //Program Two!
        char[] charArray = {'b', 'c', 'a', 'e', 'd'};
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

        //Program Three!
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        CardGame c = new CardGame(n1, n2);
        System.out.println(c.output());
    }
}