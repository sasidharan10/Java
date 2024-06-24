import java.util.*;

public class ch01_singleton_pattern {
    public static class Singleton {

        private final String data;

        private static volatile Singleton instance;

        private Singleton(String data) {
            this.data = data;
        }

        public static Singleton getInstance(String data) {
            Singleton result = instance;
            if (result == null) {
                synchronized (Singleton.class) {
                    result = instance;
                    if (result == null) {
                        instance = result = new Singleton(data);
                    }
                }
            }
            return result;
        }

        public String getData() {
            return data;
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance("Geekific"));
        Singleton singleton = Singleton.getInstance("Singleton");
        System.out.println(singleton);
        System.out.println(singleton.getData());

    }
}
