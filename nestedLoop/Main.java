package nestedLoop;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // nested loops = a loop inside of a loop

        Scanner scan = new Scanner(System.in);

        int rows;
        int columns;
        String symbol;

        System.out.println("Enter # of rows: ");
        rows = scan.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scan.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scan.next();

        scan.close();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }

    }
}
