package GenericClasses;

class NonGen{
    Object ob;

    NonGen(Object o){
        ob = o;
    }

    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of ob :"+ob.getClass().getName());
    }
}
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iObj;

        iObj = new NonGen(88);
        iObj.showType();

        int v = (Integer) iObj.getOb();
        System.out.println("Value :"+v);

        System.out.println();

        NonGen StrObj = new NonGen("Non Generic Test");
        StrObj.showType();

        String str = (String)StrObj.getOb();
        System.out.println("Value :"+str);
    }

}
