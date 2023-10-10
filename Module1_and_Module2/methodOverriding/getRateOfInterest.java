package methodOverriding;

public class getRateOfInterest {
    int Interest() {
        return 0;
    }
}
class SBI extends getRateOfInterest{

    int Interest() {
        return 1;
    }
}
class ICICI extends getRateOfInterest{

    int Interest() {
        return 2;
    }
}
class pnb extends getRateOfInterest{

    int Interest() {
        return 3;
    }
}
class test{
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        pnb p = new pnb();

        System.out.println("The rate of Interest of SBI is :"+s.Interest());
        System.out.println("The rate of Interest of ICICI is :"+i.Interest());
        System.out.println("The rate of Interest of PNB is :"+p.Interest());
    }
}
