package CreationalPattern.FactoryMethod;

//This Class will give objects hence we call it as Factory of Objects
// If we have Extra Class in Future then it will not change the client main application it will change the factory design pattern class
public class OperatingSystemFactory {
    public OS getInstance(String str){
        if(str.equals("Open")){          //If pass Open it returns object of android
            return new Android();
        }
        else if(str.equals("Closed")){             //if pass closed it returns object of IOS
            return new IOS();
        }
        else return new Windows();              //If pass Windows it returns object of Windows
    }
}
