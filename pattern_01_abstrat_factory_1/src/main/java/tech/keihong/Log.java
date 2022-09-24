package tech.keihong;

public class Log {

    public static void info(String msg, String... params) {
        System.out.println(String.format(msg, params));
    }

    public static void info(String msg) {
        System.out.println(msg);
    }
}
