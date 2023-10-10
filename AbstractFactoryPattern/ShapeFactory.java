package CreationalPattern.AbstractFactoryPattern;

import CreationalPattern.AbstractFactoryPattern.Shape.Rectangle;
import CreationalPattern.AbstractFactoryPattern.Shape.Square;
import CreationalPattern.AbstractFactoryPattern.Shape.Circle;

public class ShapeFactory extends AbstractFactory{
    public shape getShape(String str){
        if(str == null){
            return null;
        }
        if(str.equalsIgnoreCase("circle")){
            return new Circle();
        }
        if(str.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(str.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
    public Colour getColour(String str){
        return null;
    }
}
