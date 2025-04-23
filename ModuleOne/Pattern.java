import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        char key = '*';
        
        // Upper half
        for (int i = 1; i <= number - 1; i++) {
            if (i == 1) {
                for (int j = 1; j < number * 2; j++) {
                  System.out.print(key);
                }
            } else {
                for (int j = 0; j < number - i + 1; j++) {
                  System.out.print(key);
                }
                for (int j = 0; j < ((i - 1) * 2) - 1; j++) {
                  System.out.print(" ");
                }
                for (int j = 0; j < number - i + 1; j++) {
                  System.out.print(key);
                }
            }
            System.out.println();
        }

        // Lower half (including middle line)
        for (int i = number; i >= 1; i--) {
            if (i == 1) {
                for (int j = 1; j < number * 2; j++) {
                    System.out.print(key);
                }
            } else {
                for (int j = 0; j < number - i + 1; j++) {
                    System.out.print(key);
                }
                for (int j = 0; j < ((i - 1) * 2) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < number - i + 1; j++) {
                    System.out.print(key);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}