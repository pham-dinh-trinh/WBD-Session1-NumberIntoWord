import java.util.Scanner;

public class NumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        readNumber(number);
    }
    private static void readNumber(int number) {
        if (number >= 0 && number < 10) {
            System.out.println(UnitsDigits(number));
        } else if (number < 20) {
            if (number < 16) {
                System.out.println(tentofifty(number));
            } else {
                System.out.println(UnitsDigits(number % 10) + "teen");
            }
        } else if (number < 100) {
            System.out.println(TensDigits(number / 10) + " " + UnitsDigits(number % 10));
        } else if (number < 1000){
            int tenDigits = number - (number/100)*100;
            int unitDigits = number -(number/100)*100 - ((number - (number/100)*100)/10)*10;
            System.out.println(UnitsDigits(number/100) + " hundred and " + TensDigits(tenDigits/10) + " " + UnitsDigits(unitDigits % 10));
        }
    }
    private static String UnitsDigits(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
        }
        return result;
    }
    private static String TensDigits(int number) {
        String result = "";
        switch (number) {
            case 2:
                result = "twenty";
                break;
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "forty";
                break;
            case 5:
                result = "fifty";
                break;
            case 6:
                result = "sixty";
                break;
            case 7:
                result = "seventy";
                break;
            case 8:
                result = "eighty";
                break;
            case 9:
                result = "ninety";
                break;
        }
        return result;
    }
    private static String tentofifty(int number) {
        String result = "";
        switch (number) {
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
        }
        return result;
    }
}
