import java.util.*;
public class Main10 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int input1, input2;
        boolean checkNum = true;
        input1 = sc.nextInt();
        input2 = sc.nextInt();

        if (input1 > 1000 || input2 > 1000) {
            checkNum = false;
        }
        System.out.println(input1 + "+" + input2 + "=" + (input1 + input2));
        System.out.println(input1 + "*" + input2 + "=" + (input1 * input2));
        System.out.println(input1 + "-" + input2 + "=" + (input1 - input2));
        System.out.println(input1 + "/" + input2 + "=" + (input1 / input2) + "..." + (input1 % input2));
    }
}