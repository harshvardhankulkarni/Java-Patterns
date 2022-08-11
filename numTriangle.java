package Patterns;

/**
 * 11111
 * 2222
 * 333
 * 44
 * 5
 */

public class numTriangle {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
            num++;
        }
    }
}
