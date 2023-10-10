package ExceptionPropagation;

import java.io.IOException;

class ExceptionPropagation2{
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }
    void n(){
        try {
            m();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        ExceptionPropagation2 obj=new ExceptionPropagation2();
        obj.p();
        System.out.println("normal flow");
    }
}
