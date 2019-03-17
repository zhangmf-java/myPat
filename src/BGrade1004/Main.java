package BGrade1004;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int high = 0;
        int low = 100;
        int count = sc.nextInt();
        sc.nextLine();
        List<String> result = new ArrayList<>();
        result.add("");
        result.add("");
        while (count > 0){
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            Integer currentNum = Integer.valueOf(strs[2]);
            if (currentNum>high){
                result.set(0,strs[0]+" "+strs[1]);
                high = currentNum;
            }
            if (currentNum<low){
                result.set(1,strs[0]+" "+strs[1]);
                low = currentNum;
            }
            count--;
        }

        for (String s : result) {
            System.out.println(s);
        }
    }

}
