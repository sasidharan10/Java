public class ch_19_leap_year {
    public static void main(String[] args) {
        int y = 2000;
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            System.out.println("It is a Leap year :)");
        } else {
            System.out.println("It is Not a Leap year :(");
        }
    }
}
