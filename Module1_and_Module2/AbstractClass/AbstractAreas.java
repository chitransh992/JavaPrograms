package AbstractClass;

public class AbstractAreas {
    public static void main(String[] args) {
        RectangleAbstractAreas rectangle = new RectangleAbstractAreas(10,20);
        TriangleAbstractAreas triangle = new TriangleAbstractAreas(30,40);

        FigureAbstractAreas figure;

        figure = rectangle;    //Reference of FigureAbstractAreas which can used to refer to object of any class derived from FigureAbstractAreas

        System.out.println("Area is :"+figure.area());

        figure = triangle;

        System.out.println("Area is :"+figure.area());
    }
}
