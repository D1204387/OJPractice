import java.util.*;
public class Main8 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        int[] sumCola;
        int[] total_cola;

        sumCola =new int[200];
        total_cola=new int[200];

        for(int i =0;i<200;i++){
            total_cola[i]=sc.nextInt();
        }

        for(int k =0;k<200;k++){
            int turns = (total_cola[k] / 3) + 1;

            int[] exchangedCola = new int[turns];
            int[] emptyCola = new int[turns];

            for(int i=0;i<turns;i++) {

                if (i == 0) {
                    exchangedCola[i] = total_cola[k];
                    emptyCola[i] = 1;
                } else {
                    exchangedCola[i] = ((exchangedCola[i - 1] + emptyCola[i - 1]) / 3);
                    emptyCola[i] = ((exchangedCola[i - 1] + emptyCola[i - 1]) % 3);
                }
                sumCola[k] += exchangedCola[i];
            }
            System.out.println(sumCola[k]);
        }
    }
}




