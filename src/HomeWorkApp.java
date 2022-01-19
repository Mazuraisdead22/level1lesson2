public class HomeWorkApp {

    public static void main(String[] args) {
        amountInterval(1, 2);
        positiveOrNegative(4);
        trueNum(-8);
        printLines("fine", 6);
        leapYear(2024);
    }

    public static boolean amountInterval(int a, int b) {

        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int c) {
        if (c < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean trueNum(int x){
        if (x < 0){
            return true;
        }else{
            return false;
        }

    }
    public static void printLines(String text, int t){
        for (int i = 0; i < t; i++) {
            System.out.println(text);
        }
    }
    public static void leapYear(int year){
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " год не високосный");
        }else{
            System.out.println(year + " високосный  год ");
        }
    }
}

