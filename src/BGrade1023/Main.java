package BGrade1023;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");
        int[] a = new int[10];
        for (int i = 0;i<10;i++){
            a[i] = Integer.valueOf(split[i]);
        }

        for (int i = 1;i<10;i++){
            if (a[i] != 0){
                System.out.print(i);
                a[i]--;
                break;
            }
        }
        for (int i = 0;i<10;i++){
            for (int j = 1;j<=a[i];j++){
                System.out.print(i);
            }
        }
        System.out.println();
    }
}