package models;

import enums.PaymentStatus;
import enums.VehicleType;

import java.time.LocalDateTime;

public class ParkingPass {

   String passId;
   String parkingCode;

   PaymentStatus paymentStatus;
   LocalDateTime parkingTime;
   LocalDateTime checkOutTime;

   Guest guest;

   public ParkingPass generatePass(Guest guest) {
      if (guest.getVehicleType() == VehicleType.CAR) {
         this.parkingTime = LocalDateTime.now();
      }
      print("slot booked");
      return this;
   }


   private void print(String msg) {
      System.out.println(msg);
   }

   public LocalDateTime getParkingTime() {
      return parkingTime;
   }

   public void setParkingTime(LocalDateTime parkingTime) {
      this.parkingTime = parkingTime;
   }

   public LocalDateTime getCheckOutTime() {
      return checkOutTime;
   }

   public void setCheckOutTime(LocalDateTime checkOutTime) {
      this.checkOutTime = checkOutTime;
   }

   public String getPassId() {
      return passId;
   }

   public void setPassId(String passId) {
      this.passId = passId;
   }

   public String getParkingCode() {
      return parkingCode;
   }

   public void setParkingCode(String parkingCode) {
      this.parkingCode = parkingCode;
   }

   public PaymentStatus getPaymentStatus() {
      return paymentStatus;
   }

   public void setPaymentStatus(PaymentStatus paymentStatus) {
      this.paymentStatus = paymentStatus;
   }

   public Guest getGuest() {
      return guest;
   }

   public void setGuest(Guest guest) {
      this.guest = guest;
   }

   @Override
   public String toString() {
      return "ParkingPass{" +
              "passId='" + passId + '\'' +
              ", parkingCode='" + parkingCode + '\'' +
              ", paymentStatus=" + paymentStatus +
              ", guest=" + guest +
              '}';
   }
}
