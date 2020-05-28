package love.util;

public class EchoUtils {

    public static String append(String msg) {
        System.out.println("调用了工具类模块");
        return "echo -> " + msg;
    }
}
