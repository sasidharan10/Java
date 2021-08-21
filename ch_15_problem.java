public class ch_15_problem {
    public static void main(String[] args) {
        String str="have a nice  day";
        System.out.println(str);
        System.out.println("1) Counting spaces...");
        System.out.println("2 spaces : "+str.indexOf("  "));
        System.out.println("3 spaces : "+str.indexOf("   "));
        System.out.println("2) replacing ' ' with _ ");
        System.out.println("replace(' ', '_') : "+str.replace(' ', '_'));
        System.out.println("3) Replacing a word...");
        String str1="hey <|guys|>!!! thank you guys";
        System.out.println(""+str1.replace("<|guys|>", "people"));
    }
    
}
