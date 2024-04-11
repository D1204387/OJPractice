import java.util.*;
public class Main5 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);

        int score;
        score = sc.nextInt();
        if(score>=60){
            System.out.println("pass");
            if(score>=90){
                System.out.println("excellent");
            }
        } else if(score>=50){
            System.out.println("almost pass");
        } else {
            System.out.println("fail");
        }
    }
}
