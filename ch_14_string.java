public class ch_14_string {
    public static void main(String[] args) {
        String n1 = "Sasidharan";
        System.out.println("length() : " + n1.length());
        System.out.println("toLowerCase() : " + n1.toLowerCase());
        System.out.println("toUpperCase() : " + n1.toUpperCase());
        String n2 = "    g oood    ";
        System.out.println("trim() : " + n2.trim());
        String n3 = "have a nice   day";
        System.out.println(n3);
        System.out.println("substring(7) : " + n3.substring(7));
        System.out.println("substring(7,11) : " + n3.substring(7, 11));
        System.out.println("replace('a', 'k') : " + n3.replace('a', 'k'));
        System.out.println("startsWith(\"Sa\") : " + n1.startsWith("Sa"));
        System.out.println("endsWith(\"an\") : " + n1.endsWith("an"));
        System.out.println("charAt(2) : " + n1.charAt(2));
        System.out.println("indexOf(d) : " + n1.indexOf("d"));
        System.out.println("lastIndexOf(a) : " + n1.lastIndexOf("a"));
        System.out.println("equals(\"sasi\") : " + n1.equals("sasi"));
        System.out.println("equalsIgnoreCase(\"SASIDHARAN\") : " + n1.equalsIgnoreCase("SASIDHARAN"));
    }
}
