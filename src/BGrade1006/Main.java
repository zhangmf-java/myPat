package BGrade1006;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int s = i/100;
        int b = i%100/10;
        int a = i%10;

        for (int j = 0;j<s;j++){
            System.out.print("B");
        }

        for (int j = 0;j<b;j++){
            System.out.print("S");
        }
        for (int j = 1;j<=a;j++) {
            System.out.print(j);
        }
        System.out.println();

    }
}
