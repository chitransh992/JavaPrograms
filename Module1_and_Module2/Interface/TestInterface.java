package Interface;

interface MyInterface{
    final int a = 20;

    void draw();
}
class TestInterface implements MyInterface{
    public void draw(){
        System.out.println("Drawing !!");
    }
    public static void main(String[] args) {
         TestInterface test = new TestInterface();
         test.draw();;
         System.out.println(a);
    }
}
