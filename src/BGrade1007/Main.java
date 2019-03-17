package BGrade1007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String top = sc.nextLine();
        int ji = 1;
        int result = 0;
        List<Integer> sus = new ArrayList<>();
        sus.add(2);
        while (ji<=Integer.valueOf(top)){
            ji+=2;
            boolean isJi = true;
            for (int i = 0;i<sus.size();i++){
                if (ji%sus.get(i)==0){
                    isJi = false;
                    break;
                }
            }
            if (isJi){
                sus.add(ji);
            }
        }
        for (int i = 0;i<sus.size()-1;i++){
            if (sus.get(i+1) - sus.get(i) == 2){
                result++;
            }
        }
        System.out.println(result);
    }
}
