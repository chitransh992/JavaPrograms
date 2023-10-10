package CreationalPattern.SinglatonPattern;

//Singlaton Pattern is used to define a class that has only one instance and provide the global point of access to it

public class ABC {
    static ABC object = new ABC();

    private ABC(){

    }
    public static ABC getInstance(){
        return object;
    }

}
