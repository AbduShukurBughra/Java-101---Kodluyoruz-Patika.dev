package methood;

import java.util.Scanner;

public class CreatingMethodsByPattern {
    static int pattern(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int firstResult = 1;
        int secondResult = 1;

        for (int i = number; i > -number - i; i -= 5) {

            firstResult = i;
            System.out.print(firstResult);
            if (i <= 0) {
                for (int j = i; j <= number; j += 5) {
                    secondResult = j;
                    System.out.println(secondResult);
                }

            }
            if (secondResult == number) {
                break;
            }
        }
        System.out.println();
        return firstResult;
    }

    public static void main(String[] args) {

        System.out.println(pattern());

    }

}