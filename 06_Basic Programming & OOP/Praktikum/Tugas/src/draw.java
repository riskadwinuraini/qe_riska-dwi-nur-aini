import java.util.Scanner;

public class draw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        drawXYZ(5);

    }

    public static void drawXYZ(int n){
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    System.out.print("X");
                } else if (i % 2 == 1) {
                    System.out.print("Y");
                } else {
                    System.out.print("Z");
                }
            }
            System.out.println();
            }
        }
    }

