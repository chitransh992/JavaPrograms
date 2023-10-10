package ThrowsPrograms;

import java.io.IOException;

public class TestThrow2 {
    public static void main(String[] args) throws IOException {
        Example2 example2 = new Example2();
        example2.method2();
        System.out.println("Normal Flow !!!!");
    }
}
