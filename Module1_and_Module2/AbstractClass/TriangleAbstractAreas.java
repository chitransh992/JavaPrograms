package AbstractClass;

class TriangleAbstractAreas extends FigureAbstractAreas{

    TriangleAbstractAreas(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Triangle's Area");
        return dimension1*dimension2/2;
    }
}
