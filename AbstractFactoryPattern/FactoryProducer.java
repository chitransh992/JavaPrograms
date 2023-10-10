package CreationalPattern.AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getInstance(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        if(choice.equalsIgnoreCase("COLOUR")){
            return new ColourFactory();
        }
        return null;
    }
}
