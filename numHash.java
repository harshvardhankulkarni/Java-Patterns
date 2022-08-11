package Patterns;

/**
 * 1
 * 1#
 * 1#3
 * 1#3#
 * 1#3#5
 * 1#3#5#
 * 1#3#5#7
 */

public class numHash {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
