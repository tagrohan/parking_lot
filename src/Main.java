import enums.PaymentMethod;
import enums.PaymentStatus;
import enums.VehicleType;
import models.Guest;
import models.ParkingLot;
import models.ParkingPass;
import models.Valet;

import java.util.List;

public class Main {
   public static void main(String[] args) {


      Guest guest = new Guest("12", "rohan", "email", "800", VehicleType.CAR);
      Valet valet = new Valet();
      List<ParkingLot> parkingLots = valet.availableParkingLots(guest.getVehicleType());
      if (parkingLots.isEmpty()) {
         System.out.println("OOps no space available");
         return;
      }
      Guest guest2 = new Guest("122", "rohan", "email", "800", VehicleType.CAR);


//      ParkingPass pass = valet.parkVehicle(parkingLots.get(0), guest, 2);
//      System.out.println(pass);
//      valet.checkOut(pass, PaymentMethod.CASH);
//      pass.setPaymentStatus(PaymentStatus.PAID);
//      valet.checkOut(pass, PaymentMethod.CASH);


   }
}
