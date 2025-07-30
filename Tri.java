import java.util.*;

public class Tri {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Accept number of rows

        for (int i = 1; i <= n; i++) { // Start from 1 to n
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println(); // Move to next line after each row
        }

        sc.close();
    }
}
