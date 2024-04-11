import java.util.*;
public class Main7 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int password =sc.nextInt();

        int firstDigit = (password /1000);
        int D1=(firstDigit +7)%10;
        int secondDigit = (password -firstDigit*1000)/100;
        int D2 = (secondDigit+7)%10;
        int thirdDigit =(password -firstDigit*1000-secondDigit*100)/10;
        int D3=(thirdDigit+7)%10;
        int forthDigit = (password -firstDigit*1000-secondDigit*100)%10;
        int D4 = (forthDigit+7)%10;


        System.out.println(D3+""+D4+""+D1+""+D2);

        }
}
