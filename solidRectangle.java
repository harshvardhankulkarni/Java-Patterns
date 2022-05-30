package Patterns;

/*
****
****
****
****
****
*/
public class solidRectangle {
    public static void main(String[] args) {
        // Outer Loop
        for (int i = 1; i <= 4; i++) {
            // Iner Loop
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}