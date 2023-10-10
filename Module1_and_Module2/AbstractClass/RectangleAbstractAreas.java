package AbstractClass;

class RectangleAbstractAreas extends FigureAbstractAreas {

    RectangleAbstractAreas(int a, int b){
        super(a,b);
    }

    double area(){
        System.out.println("Inside Rectangle's Area");
        return dimension1*dimension2;
    }
}
