package BGrade1002;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chinese = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        BigDecimal yuanshu = sc.nextBigDecimal();
        int length = yuanshu.toString().length();
        Integer sum = 0;
        BigDecimal yu = yuanshu;
        StringBuilder sb = new StringBuilder();
        for (int j = length-1;j>=0;j--){
            sum += yuanshu.toString().charAt(j) - '0';
        }
        for (int i=0;i<sum.toString().length();i++){
            String per = chinese[Integer.valueOf(sum.toString().charAt(i)) - '0'];
            sb.append(per);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }


}