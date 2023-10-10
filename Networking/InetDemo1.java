import java.net.InetAddress;

public class InetDemo1 {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.xebia.com");

            System.out.println("Host name :"+inetAddress.getHostName());
            System.out.println("IP Address :"+inetAddress.getHostAddress());

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
