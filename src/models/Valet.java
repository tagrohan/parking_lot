package models;

import enums.ParkingLotStatus;
import enums.PaymentMethod;
import enums.PaymentStatus;
import enums.VehicleType;
import services.SearchParkingLot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Valet {
//   private double amount;
//   private int noOfHours;


   public List<ParkingLot> availableParkingLots(VehicleType vehicleType) {
      List<ParkingLot> parkingLots = new ArrayList<>();
      for (ParkingLot parkingLot : SearchParkingLot.getParkingLots()) {
         if (parkingLot.getVehicleType() == vehicleType) parkingLots.add(parkingLot);
      }
      return parkingLots;
   }


   public ParkingPass parkVehicle(ParkingLot parkingLot, Guest guest) {
      parkingLot.setGuest(guest);
      ParkingPass pass = new ParkingPass();
//      if (guest.getVehicleType() == VehicleType.CAR) {
//         this.amount = parkingLot.getPriceOfSlot() * noOfHours;
//      } else if (guest.getVehicleType() == VehicleType.TWO_WHEELER) {
//         this.amount = parkingLot.getPriceOfSlot() * noOfHours;
//      }
      pass.setGuest(guest);
      pass.setPassId(guest.getId());
      pass.setParkingCode(guest.getId() + new Date());
      pass.setPaymentStatus(PaymentStatus.NOT_PAID);
      parkingLot.setParkingLotStatus(ParkingLotStatus.OCCUPIED);
      return pass.generatePass(guest);
   }

   public void checkOut(ParkingPass pass, PaymentMethod paymentMethod) {
      if (pass.getPaymentStatus() == PaymentStatus.NOT_PAID) {
         switch (paymentMethod) {
            case UPI:
//               print( LocalDateTime.now() - pass.getParkingTime() + " RS amount paid via " + " UPI");
//               break;
//            case CASH:
//               print(pass.getAmount() + " RS amount paid via " + " CASH");
//               break;
//            case CREDIT_CARD:
//               print(pass.getAmount() + " RS amount paid via " + " CREDIT_CARD");
               break;
            default:
               print("Already paid");
         }
         pass.setPaymentStatus(PaymentStatus.PAID);
      } else {
         print("Already paid");
      }
   }

   private static void print(String msg) {
      System.out.println(msg);
   }

   public Valet() {

   }

//   public double getAmount() {
//      return amount;
//   }
//
//   public void setAmount(double amount) {
//      this.amount = amount;
//   }
//
//   public int getNoOfHours() {
//      return noOfHours;
//   }
//
//   public void setNoOfHours(int noOfHours) {
//      this.noOfHours = noOfHours;
//   }
}

