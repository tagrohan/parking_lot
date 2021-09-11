package models;

import enums.ParkingLotStatus;
import enums.VehicleType;

public class ParkingLot {

   String parkingLotId;
   VehicleType vehicleType;
   double priceOfSlot;
   ParkingLotStatus parkingLotStatus;
   Vehicle vehicle;
   Guest guest;

   public Guest getGuest() {
      return guest;
   }

   public void setGuest(Guest guest) {
      this.guest = guest;
   }

   public ParkingLot() {
   }

   public ParkingLot(String parkingLotId, VehicleType vehicleType, double priceOfSlot, ParkingLotStatus parkingLotStatus, Vehicle vehicle, Guest guest) {
      this.parkingLotId = parkingLotId;
      this.vehicleType = vehicleType;
      this.priceOfSlot = priceOfSlot;
      this.parkingLotStatus = parkingLotStatus;
      this.vehicle = vehicle;
      this.guest = guest;
   }

   public String getParkingLotId() {
      return parkingLotId;
   }

   public void setParkingLotId(String parkingLotId) {
      this.parkingLotId = parkingLotId;
   }

   public VehicleType getVehicleType() {
      return vehicleType;
   }

   public void setVehicleType(VehicleType vehicleType) {
      this.vehicleType = vehicleType;
   }

   public double getPriceOfSlot() {
      return priceOfSlot;
   }

   public void setPriceOfSlot(double priceOfSlot) {
      this.priceOfSlot = priceOfSlot;
   }

   public ParkingLotStatus getParkingLotStatus() {
      return parkingLotStatus;
   }

   public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
      this.parkingLotStatus = parkingLotStatus;
   }

   public Vehicle getVehicle() {
      return vehicle;
   }

   public void setVehicle(Vehicle vehicle) {
      this.vehicle = vehicle;
   }
}
