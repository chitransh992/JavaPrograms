package CreationalPattern.AbstractFactoryPattern;
import CreationalPattern.AbstractFactoryPattern.Colour.Red;
import CreationalPattern.AbstractFactoryPattern.Colour.Green;
import CreationalPattern.AbstractFactoryPattern.Colour.Blue;


public class ColourFactory extends AbstractFactory{
    public shape getShape(String str){
        return null;
    }
    public Colour getColour(String str){
        if(str == null){
            return null;
        }
        if(str.equalsIgnoreCase("Green")){
            return new Green();
        }
        if(str.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        if(str.equalsIgnoreCase("Red")){
            return new Red();
        }
        return null;
    }
}
