import java.io.*;
public class Main9 {
    public static void main(String[] argv) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int length = input.length();
        boolean check = true;

        for (int start = 0,end = length-1 ; start <= end; start++,end--) {
            if((input.charAt(start)) != input.charAt(end)) {
                check = false;
            }
        }
        if (check) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
        System.out.println("");
    }
}
