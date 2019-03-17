package BGrade1001;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n =0;
        while(i != 1){
            if(i%2 == 0){
                i = i/2;
            }else{
                i = (i*3+1)/2;
            }
            n++;
        }
        System.out.println(n);
    }

}