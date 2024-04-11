import java.util.*;
public class Main1 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int[] data=new int[10];
        int m=0,n=0;
        int[] data_odd=new int[5];
        int[] data_even=new int[5];

        for(int i=0;i<10;i++){
            data[i]=sc.nextInt();
            if((i+1)%2!=0){
               data_odd[m]=data[i];
               m++;
            }
            else{
                data_even[n]=data[i];
                n++;
            }
        }
        int sum_data_odd=0,sum_data_even=0;

        for(int num1:data_odd){
            sum_data_odd += num1;
        }
        for(int num2:data_even){
            sum_data_even += num2;
        }
        System.out.print(sum_data_odd+","+sum_data_even);
     }
}
