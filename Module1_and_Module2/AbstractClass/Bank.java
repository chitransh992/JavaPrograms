package AbstractClass;

abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 5;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class TestBank{
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(" "+b.getRateOfInterest()+"%");
        b = new PNB();
        System.out.println(" "+b.getRateOfInterest()+"%");
    }
}



