
public class randomInJava {
    public static void main(String[] args) {
        int mini = 3;
        int maxi = 8;
        int range = maxi - mini + 1;
        for (int i = 0; i < 10; i++) {
            int rand = (int) ((Math.random() * range) + mini);
            System.out.println(rand);
        }
    }
}
