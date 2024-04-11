import java.util.*;
public class Main4 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        float[] data = new float[10];
        int num;
        float max=Float.MIN_VALUE;
        float min=Float.MAX_VALUE;



        for (num = 0; num < 10; num++) {
            data[num] = sc.nextFloat();
                  if (data[num] > max) {
                      max=data[num];
                  }
                  if (data[num]<min) {
                      min=data[num];
                  }

        }
        System.out.print("max: "+String.format("%.2f", max)+"\n");
        System.out.print("min: "+String.format("%.2f", min)+"\n");
    }
}
