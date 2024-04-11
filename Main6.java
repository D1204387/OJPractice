import java.util.*;

public class Main6 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=3;i++){
            for(int j= 1;j<=n-2;j++) {
                System.out.print(" ");
            }
            System.out.print("***");
        System.out.println("");
        }

        }
    }
