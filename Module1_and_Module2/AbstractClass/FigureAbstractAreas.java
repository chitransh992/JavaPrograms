package AbstractClass;

abstract class FigureAbstractAreas {
    double dimension1;
    double dimension2;

    FigureAbstractAreas(double a, double b){
        dimension1 = a;
        dimension2 = b;
    }

    abstract double area();
}
