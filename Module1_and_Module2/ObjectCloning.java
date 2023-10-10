

class ObjectCloning implements Cloneable{
    int rollNo;
    String name;

    ObjectCloning(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            ObjectCloning object1 = new ObjectCloning(10, "Chitransh");
            ObjectCloning object2 = (ObjectCloning)object1.clone();

            System.out.println(object1.rollNo+" "+object1.name);
            System.out.println(object2.rollNo+" "+object2.name);
        }
        catch(CloneNotSupportedException c){}
    }

}

