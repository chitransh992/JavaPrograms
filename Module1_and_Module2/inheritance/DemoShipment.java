package inheritance;

public class DemoShipment {
    public static void main(String[] args) {
      Shipment shipment1  = new Shipment(10,20,30,10,3.41);
      Shipment shipment2 = new Shipment(2,3,4,0.75,1.25);

      double vol;
      vol = shipment1.volume();

      System.out.println("Volume of the Shipment is :"+vol);
      System.out.println("Weight of the Shipment is :"+shipment1.weight);
      System.out.println("Cost of the Shipment is :"+shipment1.cost);
      System.out.println();

      vol = shipment2.volume();
      System.out.println("Volume of the Shipment is :"+vol);
      System.out.println("Weight of the Shipment is :"+shipment2.weight);
      System.out.println("Cost of the Shipment is :"+shipment2.cost);
      System.out.println();

    }
}
