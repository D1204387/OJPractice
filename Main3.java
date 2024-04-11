import java.util.*;
public class Main3 {
    public static void main(String[] argv){
        Scanner sc =new Scanner(System.in);

        int month = sc.nextInt();

        int day = sc.nextInt();

        String constellation ="";
        switch(month){
            case 1:
                if (day >= 21) {
                    constellation = "Aquarius";
                } else {
                    constellation = "Capricorn";
                }
                break;

            case 2:
                if (day >= 19) {
                    constellation = "Pisces";
                } else {
                    constellation = "Aquarius";
                }
                break;

            case 3:
                if (day >= 21) {
                    constellation = "Aries";
                } else {
                    constellation = "Pisces";
                }
                break;

            case 4:
                if (day >= 21) {
                    constellation = "Taurus";
                } else {
                    constellation = "Aries";
                }
                break;

            case 5:{

                if (day >= 22) {
                    constellation = "Gemini";
                } else {
                    constellation = "Taurus";
                }
                break;
            }
            case 6:{
                if (day >= 22) {
                    constellation = "Cancer";
                } else {
                    constellation = "Gemini";
                }
                break;
            }
            case 7:{
                if (day >= 23) {
                    constellation = "Leo";
                } else {
                    constellation = "Cancer";
                }
                break;
            }
            case 8:
                if (day >= 24) {
                    constellation = "Virgo";
                } else {
                    constellation = "Leo";
                }
                break;

            case 9:
                if (day >= 24) {
                    constellation = "Libra";
                } else {
                    constellation = "Virgo";
                }
                break;

            case 10:
                if (day >= 24) {
                    constellation = "Scorpio";
                } else {
                    constellation = "Libra";
                }
                break;

            case 11:
                if (day >= 23) {
                    constellation = "Sagittarius";
                } else {
                    constellation = "Scorpio";
                }
                break;

            case 12:
                if (day >= 22) {
                    constellation = "Capricorn";
                } else {
                    constellation = "Sagittarius";
                }
                break;

        }
        System.out.print(constellation);
    }
}
