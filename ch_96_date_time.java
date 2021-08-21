public class ch_96_date_time {
    public static void main(String[] args) {
        System.out.println("\nCurrent Time : "+System.currentTimeMillis());
        System.out.println("long size : "+Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365 +" Years since 1970");
    }
}
