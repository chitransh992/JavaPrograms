import java.io.File;
import java.io.FileInputStream;
public class Demo implements java.io.Serializable{
    public String name;
    public int rollNumber;

    Demo(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
}
