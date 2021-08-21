public class ch_19_website {
    public static void main(String[] args) {
        String str="www.reddit.com";
        if(str.endsWith(".com"))
            System.out.println("Commercial website (.com)");
        if(str.endsWith(".org"))
            System.out.println("Organisation website (.org)");
        if(str.endsWith(".in"))
            System.out.println("Indian website (.in)");
    }
}
