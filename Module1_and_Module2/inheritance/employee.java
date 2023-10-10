package inheritance;

public class employee {
    int id;
    String name;
    Address address;

    employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    void display() {
        System.out.println(id + " " + name + " ");
        System.out.println(address.city1+" "+address.city2+" "+address.city3+" ");
    }

    public static void main(String[] args) {
    Address address1 = new Address("UP","Bihar","Patna");
    Address address2 = new Address("Jaipur","Udaipur","Ajmer");

    employee e1 = new employee(101,"ramesh",address1);
    employee e2 = new employee(102,"harish",address2);

    e1.display();
    e2.display();


    }
}


