package StringBuilderVsStringBuffer;

public class BufferVsBuilder {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer("java");

        for(int i = 0;i<10000;i++)
        {
            stringBuffer.append("Tpoint");
        }

        System.out.println("Time taken by StringBuffer :"+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("Java");

        for(int i = 0;i<10000;i++){
            stringBuilder.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder :"+(System.currentTimeMillis()-startTime));

    }


}
