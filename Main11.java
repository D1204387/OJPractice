import java.util.*;
public class Main11 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);

        int w=sc.nextInt();

        int h=sc.nextInt();

        int[][] addMatrix = new int[h+1][w+1];

        for(int i=0;i<h+1;i++){
            for(int j=0;j<w+1;j++){
                addMatrix[i][j]=i+j;
                System.out.printf("%5d",addMatrix[i][j]);
            }
        System.out.println("");
        }
    }
}
