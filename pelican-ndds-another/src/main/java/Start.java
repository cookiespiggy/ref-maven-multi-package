import love.analysis.IpEchoAnaliesr;
import love.util.EchoUtils;

public class Start {
    public static void main(String[] args) {
        System.out.println("ndds start ...");

        IpEchoAnaliesr.analiys(true);

        String s = EchoUtils.append("消息头");

        System.out.println(s);
    }
}
