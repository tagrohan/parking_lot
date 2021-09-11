package models;

import database.VehicleData;
import enums.VehicleType;

import java.util.Date;
import java.util.List;

public class Vehicle {

   String vehicleId;
   String vehicleNumber;
   VehicleType type;

   List<History> histories;

   public Vehicle(String vehicleId, String vehicleNumber, VehicleType type) {
      this.vehicleId = vehicleId;
      this.vehicleNumber = vehicleNumber;
      this.type = type;
      Vehicle vehicle = VehicleData.searchVehicle(vehicleNumber);
      History history = new History();
      history.setParkedOn(new Date());
      if (vehicle != null) {
         vehicle.setHistories(histories);
      } else {
         VehicleData.addVehicleData(this);
      }
      // todo work required
   }

   public void addInVehicleHistory() {
   }

   public String getVehicleId() {
      return vehicleId;
   }

   public void setVehicleId(String vehicleId) {
      this.vehicleId = vehicleId;
   }

   public String getVehicleNumber() {
      return vehicleNumber;
   }

   public void setVehicleNumber(String vehicleNumber) {
      this.vehicleNumber = vehicleNumber;
   }

   public VehicleType getType() {
      return type;
   }

   public void setType(VehicleType type) {
      this.type = type;
   }

   public List<History> getHistories() {
      return histories;
   }

   public void setHistories(List<History> histories) {
      this.histories = histories;
   }
}
