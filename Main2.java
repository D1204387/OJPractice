import java.util.*;
public class Main2 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int[] input = new int[10];
        int[] count = new int[10];
        int maxCountIndex = 0;
        int inputCount = 0;
        Boolean check = true;

        for (num = 0; num < 10; num++) {
            input[num] = sc.nextInt();
            if (input[num] < 0 || input[num] >= 10) {
                check = false;
                break;
            }
            count[input[num]]++;
            inputCount++;
        }
        if (inputCount > 10) {
            check = false;
        }
        if (check) {
            for (num = 1; num < count.length; num++) {
                if (count[num] > count[maxCountIndex]) {
                    maxCountIndex = num;
                }
            }
            System.out.println(maxCountIndex + "," + count[maxCountIndex]);
        } else {
            System.out.println("Out of range");
        }
        sc.close();
    }
}