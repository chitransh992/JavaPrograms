package CreationalPattern.AbstractFactoryPattern;

public abstract class AbstractFactory {
    abstract Colour getColour(String colour);
    abstract shape getShape(String shape);
}
