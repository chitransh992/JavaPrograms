package inheritance;

public class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob)                     // Box object initialization
    {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    /*
    used for the box object initialization

    BOX objBox = new box(10, 10, 10);
    box boj1Box = new Box();

    box obj2box = new Box(objBox);

     */

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width*height*depth;
      }
}
