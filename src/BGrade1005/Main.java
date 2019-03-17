package BGrade1005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a = 0;
        sc.nextLine();
        String line = sc.nextLine();
        String[] split = line.split(" ");
        List<Integer> integers = new ArrayList<>();
        for (String s : split) {
            integers.add(Integer.valueOf(s));
        }
        while (a < integers.size()){
            Integer per = Integer.valueOf(integers.get(a));
            while (per != 1){
                if (per % 2 == 0){
                    per = per/2;
                }else{
                    per = (per*3+1)/2;
                }
                for (int i = 0;i<integers.size();i++){
                    if (per.equals(Integer.valueOf(integers.get(i)))){
                        integers.remove(i);
                        if (i<=a){
                            a--;
                        }
                    }
                }
            }

            a++;
        }
        Collections.sort(integers,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Integer integer : integers) {
            sb.append(" "+integer);
        }
        System.out.println(sb.toString().trim());
    }
}
