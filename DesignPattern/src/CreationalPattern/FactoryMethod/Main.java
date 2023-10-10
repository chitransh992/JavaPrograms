package CreationalPattern.FactoryMethod;


public class Main {
    public static void main(String[] args) {

//        OS os1 = new Android();     //here we expose which class we are working hence we need to use factory pattern
//        os1.spec();

//        OS os2 = new IOS();
//        os2.spec();
//
//        OS os3 = new Windows();
//        os3.spec();

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();

        //for Android
       OS andriod = operatingSystemFactory.getInstance("Open");
       andriod.spec();

       //for IOS
        OS Ios = operatingSystemFactory.getInstance("Closed");
        Ios.spec();

        //for Windows
        OS windows = operatingSystemFactory.getInstance("window");
        windows.spec();
    }
}

