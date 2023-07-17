import com.program3.CardGame;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Program One
        System.out.println("Enter number of input in array : ");
        int no = scanner.nextInt();
        int[] arr = new int[no];

        System.out.println("Enter array values : ");
        for (int i = 0; i < no; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int a : arr) {
            sum += a;
            System.out.println(sum);
        }

        //Program Two
        System.out.println("Enter number of input in character array : ");
        int no1 = scanner.nextInt();
        char[] charArray = new char[no1];

        System.out.println("Enter array values : ");
        for (int i = 0; i < no1; i++) {
            charArray[i] = scanner.next().charAt(0);
        }

        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

        //Program Three
        System.out.println("Enter player one card number : ");
        int n1 = scanner.nextInt();
        System.out.println("Enter player Two card number : ");
        int n2 = scanner.nextInt();
        CardGame c = new CardGame(n1, n2);
        System.out.println(c.output());
    }
}