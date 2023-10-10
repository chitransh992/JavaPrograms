import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
public class URLConnectionExample{
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.javatpoint.com/java-tutorial");
            URLConnection urlCon = url.openConnection();
            InputStream stream = urlCon.getInputStream();

            int i;
            while((i = stream.read())!=1){
                System.out.println((char)i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
