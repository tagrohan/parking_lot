package models;

import enums.VehicleType;
import interfaces.User;

public class Guest extends User {

   Account account;
   VehicleType vehicleType;
   Vehicle vehicle;


   public ParkingPass parkVehicle(ParkingLot parkingLot, int noOfHours) {
      Valet valet = new Valet();
      valet.parkVehicle(parkingLot, this);
      return new ParkingPass();
   }

   public Guest(String id, String name, String email, String phoneNo, VehicleType vehicleType) {
      super(id, name, email, phoneNo);
      this.vehicleType = vehicleType;
   }

   public Guest(String id, String name, String email, String phoneNo, VehicleType vehicleType, Vehicle vehicle) {
      super(id, name, email, phoneNo);
      this.vehicleType = vehicleType;
      this.vehicle = vehicle;
   }

   public Account getAccount() {
      return account;
   }

   public void setAccount(Account account) {
      this.account = account;
   }

   public VehicleType getVehicleType() {
      return vehicleType;
   }

   public void setVehicleType(VehicleType vehicleType) {
      this.vehicleType = vehicleType;
   }

   @Override
   public String toString() {
      return "Guest{" +
              "account=" + account +
              ", vehicleType=" + vehicleType +
              '}';
   }

   public Vehicle getVehicle() {
      return vehicle;
   }

   public void setVehicle(Vehicle vehicle) {
      this.vehicle = vehicle;
   }
}
